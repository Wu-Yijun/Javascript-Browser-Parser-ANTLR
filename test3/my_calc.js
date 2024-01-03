import antlr4 from "../node_modules/antlr4/src/antlr4/index.web.js";
import CLexer from "./TestLexer.js";
import CParser from "./TestParser.js";
import JSListener from "./JSListener.js";
import nameList from "./Test.tokens.js";


const iName = "test.c";
const oName = "test.js";


// JSListener.tFileName = iName.replace(".calc", ".js")
console.log("Compiling " + iName + " to " + oName);

var input = `/* @author 123 */`;

var chars = new antlr4.InputStream(input);
var lexer = new CLexer(chars);
var tokens = new antlr4.CommonTokenStream(lexer);
var parser = new CParser(tokens);
parser.buildParseTrees = true;
var tree = parser.commentBlock();

for (let e of tokens.tokens) {
    console.log(e.type, e.start, e.stop, e.text, nameList[e.type])
}
var extractor = new JSListener();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree);

var str="";
for (let e of tokens.tokens) {
    str+=`<span class="CodeCStyle${e.type}">${e.text}</span>`;
    if(e.type==120)
        console.log(e);
}
document.getElementById("test").innerHTML = str;

// var tree2 = parser.blockCommentA();
// antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree2);
