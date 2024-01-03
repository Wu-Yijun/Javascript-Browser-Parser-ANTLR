import antlr4 from "../node_modules/antlr4/src/antlr4/index.web.js";
import CLexer from "./CLexer.js";
import CParser from "./CParser.js";
import JSListener from "./JSListener.js";
import nameList from "./C.tokens.js";


const iName = "test.c";
const oName = "test.js";


// JSListener.tFileName = iName.replace(".calc", ".js")
console.log("Compiling " + iName + " to " + oName);

var input = `
#include <stdio.h>
#define LAST 10
#define f(x, y) 12
#define g(x, y) 22 + \\
xy
/***
 * @author 汉字测试
 * @date 2024-1-3
 * @meta 多行注释测试
 **/

struct A{
    int b;
};

const int aa = 10;
int foo();
int main()
{
    int i, sum = 0;
   
    for ( i = 1; i <= LAST; i++ ) {
      sum += i;
    } /*-for-*/
    printf("sum = %d\\n", sum + foo());
    printf("1%#1.00hd12%*12[]s3%c4", 10, "1", '2','\\2','333',' ');

    return 0;
}
int foo(){
    return 10;
}
`;

var chars = new antlr4.InputStream(input);
var lexer = new CLexer(chars);
var tokens = new antlr4.CommonTokenStream(lexer);
var parser = new CParser(tokens);
parser.buildParseTrees = true;
var tree = parser.compilationUnit();
var extractor = new JSListener();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree);

for (let e of tokens.tokens) {
    console.log(e.type, e.start, e.stop, e.text, nameList[e.type])
}

var str = "";
for (let e of tokens.tokens) {
    var s = (String)(e.text);
    if (e.type == -1)
        s = "";
    s = s.replaceAll("<", "&lt;");
    s = s.replaceAll(">", "&gt;");
    switch (nameList[e.type]) {
        case "BlockComment":
            s = s.replace(/([^\S\n])(@[^\s@]+?)([\s])/g, `$1<span class="CodeCStyleBlockCommentNote">$2</span>$3`);
            break;
        case "StringLiteral":
            const pattern_printf = /(%[0\+\- \#]?(([1-9][0-9]*)|\*)?(\.([0-9]*|\*))?([hlL]|ll)?[aAdoxXufeEgGcsp])/g;
            const pattern_scanf = /(%(\*)?([0-9]*?)([hiL]|ll)?([aAcdeEfFgGiosuxXp]|%|\[\]))/g;
            const pattern_io = new RegExp("(" + pattern_printf.source + "|" + pattern_scanf.source + ")", pattern_printf.flags);
            const pattern_bslash = /(\\.)/g;
            s = s.replace(pattern_io, `<span class="CodeCStyleStringLiteralFormatted">$1</span>`);
            s = s.replace(pattern_bslash, `<span class="CodeCStyleStringLiteralBackSlash">$1</span>`);
            break;
        case "Constant":
            // find the one that is char
            // highlight the bslash and errors
            if (s.charAt(0) == "'" && s.charAt(s.length - 1) == "'") {
                if (s.length == 3)
                    break;
                if (s.length == 4 && s.charAt(1) == '\\') {
                    s = `'<span class="CodeCStyleCharBackSlash">${s.substring(1, s.length - 1)}</span>'`;
                    break;
                }
                // error
                s = `'<span class="wavy-line decoration-line-orange">${s.substring(1, s.length - 1)}</span>'`;
            }
            break;
        case null:
        case undefined:
            s = "";
    }
    str += `<span class="CodeCStyle${e.type} CodeCStyle${nameList[e.type]}">${s}</span>`;
}
document.getElementById("test").innerHTML = str;

