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
/***
 * @author 汉字测试
 * @date 2024-1-3
 * @meta 多行注释测试
 **/


int foo();
int main()
{
    int i, sum = 0;
   
    for ( i = 1; i <= LAST; i++ ) {
      sum += i;
    } /*-for-*/
    printf("sum = %d\\n", sum + foo());

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

var tree2 = parser.blockCommentA();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree2);
