import antlr4 from "./antlr4.js";
import Lexer from "./CPP14Lexer.js";
import Parser from "./CPP14Parser.js";

import { MyListener, Token, Rule, TokenFind, RuleFind } from "./MyListener.js"

function AddLoader() {
    const elem = document.createElement("div");
    elem.classList.toggle("loader");
    elem.innerHTML = `<div class="loader-inner line-scale"><div></div><div></div><div></div><div></div><div></div></div>`;

    return elem;
}
function RemoveLoader(dom) {
    dom.getElementsByClassName("loader").forEach(element => {
        dom.removeChild(element);
    });
}

function yieldToMain() {
    return new Promise(resolve => {
        setTimeout(resolve, 10);
    });
}

function makeRequest(method, url) {
    return new Promise(function (resolve, reject) {
        let xhr = new XMLHttpRequest();
        xhr.open(method, url);
        xhr.onload = function () {
            if (this.status >= 200 && this.status < 300) {
                resolve(xhr.response);
            } else {
                reject({
                    status: this.status,
                    statusText: xhr.statusText
                });
            }
        };
        xhr.onerror = function () {
            reject({
                status: this.status,
                statusText: xhr.statusText
            });
        };
        xhr.send();
    });
}

async function GetAndRender(url) {
    document.getElementById("test").appendChild(AddLoader());
    await yieldToMain();

    const input = await makeRequest("GET", url);

    var chars = new antlr4.InputStream(input);
    var lexer = new Lexer(chars);
    var tokens = new antlr4.CommonTokenStream(lexer);
    var parser = new Parser(tokens);
    parser.buildParseTrees = true;
    await yieldToMain();
    var tree = await parser.translationUnit();

    await yieldToMain();

    var extractor = new MyListener(tokens);
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree);

    // for (let i of tokens.tokens) {
    //     console.log(i.text, Token(i.type));
    // }

    document.getElementById("test").innerHTML = `<span>${input.replaceAll("<", "&lt;").replaceAll(">", "&gt;")}</span>`;

}


const inputPath = 'test.cpp';
window.onload = ()=>{GetAndRender(inputPath);}


// var str = "";
// for (let idex in tokens.tokens) {
//     let e = tokens.tokens[idex];
//     var s = (String)(e.text);
//     if (e.type == -1)
//         s = "";
//     s = s.replaceAll("<", "&lt;");
//     s = s.replaceAll(">", "&gt;");
//     switch (Token(e.type)) {
//         case "BlockComment": {
//             s = s.replace(/([^\S\n])(@[^\s@]+?)([\s])/g, `$1<span class="CodeCStyleBlockCommentNote">$2</span>$3`);
//             break;
//         }
//         case "StringLiteral": {
//             if (s[0] == '#') {
//                 // not StringLiteral but macros
//                 let rg = extractor.range.goForRange(idex);
//                 if (rg && rg.insideName("Macro Defines")) {
//                     let name = s.substring(1).replace(" ", "");
//                     let v = extractor.range.gothroughForVar(name, idex, "MacroParams");
//                     if (v) {
//                         // ok
//                         s = `#<span class="CodeCStyleTypeMacroToString">${s.substring(1)}</span>`
//                     } else {
//                         // error
//                         // red
//                         s = `<span class="font-red-error wavy-line decoration-line-red">${s}</span>`
//                     }
//                 } else {
//                     // error
//                     // red
//                     s = `<span class="font-red-error wavy-line decoration-line-red">${s}</span>`
//                 }
//             }
//             const pattern_printf = /(%[0\+\- \#]?(([1-9][0-9]*)|\*)?(\.([0-9]*|\*))?([hlL]|ll)?[aAdoxXufeEgGcsp])/g;
//             const pattern_scanf = /(%(\*)?([0-9]*?)([hiL]|ll)?([aAcdeEfFgGiosuxXp]|%|\[\]))/g;
//             const pattern_io = new RegExp("(" + pattern_printf.source + "|" + pattern_scanf.source + ")", pattern_printf.flags);
//             const pattern_bslash = /(\\.)/g;
//             s = s.replace(pattern_io, `<span class="CodeCStyleStringLiteralFormatted">$1</span>`);
//             s = s.replace(pattern_bslash, `<span class="CodeCStyleStringLiteralBackSlash">$1</span>`);
//             break;
//         }
//         case "Constant": {
//             // find the one that is char
//             // highlight the bslash and errors
//             if (s.charAt(0) == "'" && s.charAt(s.length - 1) == "'") {
//                 if (s.length == 3)
//                     break;
//                 if (s.length == 4 && s.charAt(1) == '\\') {
//                     s = `'<span class="CodeCStyleCharBackSlash">${s.substring(1, s.length - 1)}</span>'`;
//                     break;
//                 }
//                 // error
//                 s = `'<span class="wavy-line decoration-line-orange">${s.substring(1, s.length - 1)}</span>'`;
//             }
//             break;
//         }
//         case "Identifier": {
//             let rg = extractor.range.goForRange(idex);
//             if (rg) {
//                 if (rg.insideName("Macro Defines")) {
//                     let v = extractor.range.gothroughForVar(s, idex);
//                     if (v) {
//                         if (v.identifier == "MacroParams") {
//                             s = `<span class="CodeCStyleTypeMacroParamFind">${s}</span>`;
//                         } else {
//                             s = `<span class="CodeCStyleType${v.identifier}">${s}</span>`;
//                         }
//                     } else {
//                         // undefined MacroParams
//                         let txts = s.split("##");
//                         s = "";
//                         // debugger;
//                         for (let i = 0; i < txts.length; ++i) {
//                             let name = txts[i].replaceAll(" ", "");
//                             let v2 = extractor.range.gothroughForVar(name, idex);
//                             if (v2) {
//                                 if (v2.identifier == "MacroParams") {
//                                     s += `<span class="CodeCStyleTypeMacroParamFind">${txts[i]}</span>`;
//                                 } else {
//                                     s += `<span class="CodeCStyleType${v.identifier}">${txts[i]}</span>`;
//                                 }
//                             } else {
//                                 s += `<span class="CodeCStyleTypeMacroParamNotfind">${txts[i]}</span>`;
//                             }
//                             if (1 + i != txts.length)
//                                 s += `##`;
//                         }
//                     }
//                 } else {
//                     let v = extractor.range.gothroughForVar(s, idex);
//                     if (v) {
//                         s = `<span class="CodeCStyleType${v.identifier}">${s}</span>`;
//                     } else {
//                         // not defined-var
//                         s = `<span class="CodeCStyleTypeUndefined wavy-line decoration-line-orange">${s}</span>`;
//                     }
//                 }
//             } else {
//                 // undefined
//                 s = `<span class="CodeCStyleTypeUndefined wavy-line decoration-line-red">${s}</span>`;
//             }
//             let v = extractor.range.gothroughForVar(e.text, idex);

//             break;
//         }
//         case null:
//         case undefined:
//             s = "";
//     }
//     str += `<span class="CodeCStyle${e.type} CodeCStyle${Token(e.type)}">${s}</span>`;
// }
// document.getElementById("test").innerHTML = str;
