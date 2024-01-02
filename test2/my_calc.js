import antlr4 from "../node_modules/antlr4/src/antlr4/index.web.js"
import calcLexer from "./calcLexer.js"
import calcParser from "./calcParser.js"
import JSListener from "./JSListener.js"


const iName = "test.calc"
const oName = "test.js"


// JSListener.tFileName = iName.replace(".calc", ".js")
console.log("Compiling " + iName + " to " + oName)

var input = `
x := 10 + 5 * 6 ^ 2

print x + 8
`
var chars = new antlr4.InputStream(input)
var lexer = new calcLexer(chars)
var tokens = new antlr4.CommonTokenStream(lexer)
var parser = new calcParser(tokens)
parser.buildParseTrees = true
var tree = parser.program()

var extractor = new JSListener()
antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree)
