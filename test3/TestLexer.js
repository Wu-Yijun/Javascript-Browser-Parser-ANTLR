// Generated from ./Test.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from './antlr4.js';


const serializedATN = [4,0,5,37,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,
7,4,1,0,1,0,1,0,1,1,1,1,1,1,1,2,1,2,1,2,1,2,4,2,22,8,2,11,2,12,2,23,1,2,
1,2,1,3,4,3,29,8,3,11,3,12,3,30,1,4,4,4,34,8,4,11,4,12,4,35,2,23,30,0,5,
1,1,3,2,5,3,7,4,9,5,1,0,2,4,0,10,10,13,13,32,32,64,64,2,0,10,10,13,13,39,
0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,1,11,1,0,0,0,
3,14,1,0,0,0,5,17,1,0,0,0,7,28,1,0,0,0,9,33,1,0,0,0,11,12,5,47,0,0,12,13,
5,42,0,0,13,2,1,0,0,0,14,15,5,42,0,0,15,16,5,47,0,0,16,4,1,0,0,0,17,18,5,
32,0,0,18,19,5,64,0,0,19,21,1,0,0,0,20,22,8,0,0,0,21,20,1,0,0,0,22,23,1,
0,0,0,23,24,1,0,0,0,23,21,1,0,0,0,24,25,1,0,0,0,25,26,5,32,0,0,26,6,1,0,
0,0,27,29,8,1,0,0,28,27,1,0,0,0,29,30,1,0,0,0,30,31,1,0,0,0,30,28,1,0,0,
0,31,8,1,0,0,0,32,34,7,1,0,0,33,32,1,0,0,0,34,35,1,0,0,0,35,33,1,0,0,0,35,
36,1,0,0,0,36,10,1,0,0,0,4,0,23,30,35,0];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class TestLexer extends antlr4.Lexer {

    static grammarFileName = "Test.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "'/*'", "'*/'" ];
	static symbolicNames = [ null, null, null, "CommentProperty", "CommentPropertyText", 
                          "NL" ];
	static ruleNames = [ "T__0", "T__1", "CommentProperty", "CommentPropertyText", 
                      "NL" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.atn.PredictionContextCache());
    }
}

TestLexer.EOF = antlr4.Token.EOF;
TestLexer.T__0 = 1;
TestLexer.T__1 = 2;
TestLexer.CommentProperty = 3;
TestLexer.CommentPropertyText = 4;
TestLexer.NL = 5;



