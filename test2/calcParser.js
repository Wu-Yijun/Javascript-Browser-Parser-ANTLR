// Generated from test/calc.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from "../node_modules/antlr4/src/antlr4/index.web.js"
import calcListener from './calcListener.js';
const serializedATN = [4,1,30,119,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
2,13,7,13,2,14,7,14,2,15,7,15,1,0,1,0,1,0,5,0,36,8,0,10,0,12,0,39,9,0,1,
1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,5,4,57,8,4,
10,4,12,4,60,9,4,1,5,1,5,1,5,5,5,65,8,5,10,5,12,5,68,9,5,1,6,1,6,1,6,5,6,
73,8,6,10,6,12,6,76,9,6,1,7,1,7,1,7,1,7,1,7,1,7,3,7,84,8,7,1,8,1,8,1,8,1,
8,1,8,1,8,1,8,3,8,93,8,8,1,9,1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,12,1,12,
1,12,5,12,106,8,12,10,12,12,12,109,9,12,1,12,1,12,1,13,1,13,1,14,1,14,1,
15,1,15,1,15,0,0,16,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,0,6,2,0,11,
11,20,20,1,0,14,15,1,0,16,17,1,0,24,26,1,0,1,9,1,0,18,20,115,0,37,1,0,0,
0,2,40,1,0,0,0,4,45,1,0,0,0,6,49,1,0,0,0,8,53,1,0,0,0,10,61,1,0,0,0,12,69,
1,0,0,0,14,83,1,0,0,0,16,92,1,0,0,0,18,94,1,0,0,0,20,96,1,0,0,0,22,98,1,
0,0,0,24,100,1,0,0,0,26,112,1,0,0,0,28,114,1,0,0,0,30,116,1,0,0,0,32,36,
3,4,2,0,33,36,3,2,1,0,34,36,3,30,15,0,35,32,1,0,0,0,35,33,1,0,0,0,35,34,
1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,1,1,0,0,0,39,37,1,0,
0,0,40,41,5,27,0,0,41,42,7,0,0,0,42,43,3,8,4,0,43,44,5,29,0,0,44,3,1,0,0,
0,45,46,5,10,0,0,46,47,3,8,4,0,47,48,5,29,0,0,48,5,1,0,0,0,49,50,3,8,4,0,
50,51,3,28,14,0,51,52,3,8,4,0,52,7,1,0,0,0,53,58,3,10,5,0,54,55,7,1,0,0,
55,57,3,10,5,0,56,54,1,0,0,0,57,60,1,0,0,0,58,56,1,0,0,0,58,59,1,0,0,0,59,
9,1,0,0,0,60,58,1,0,0,0,61,66,3,12,6,0,62,63,7,2,0,0,63,65,3,12,6,0,64,62,
1,0,0,0,65,68,1,0,0,0,66,64,1,0,0,0,66,67,1,0,0,0,67,11,1,0,0,0,68,66,1,
0,0,0,69,74,3,14,7,0,70,71,5,23,0,0,71,73,3,14,7,0,72,70,1,0,0,0,73,76,1,
0,0,0,74,72,1,0,0,0,74,75,1,0,0,0,75,13,1,0,0,0,76,74,1,0,0,0,77,78,5,14,
0,0,78,84,3,14,7,0,79,80,5,15,0,0,80,84,3,14,7,0,81,84,3,24,12,0,82,84,3,
16,8,0,83,77,1,0,0,0,83,79,1,0,0,0,83,81,1,0,0,0,83,82,1,0,0,0,84,15,1,0,
0,0,85,93,3,18,9,0,86,93,3,22,11,0,87,93,3,20,10,0,88,89,5,12,0,0,89,90,
3,8,4,0,90,91,5,13,0,0,91,93,1,0,0,0,92,85,1,0,0,0,92,86,1,0,0,0,92,87,1,
0,0,0,92,88,1,0,0,0,93,17,1,0,0,0,94,95,5,28,0,0,95,19,1,0,0,0,96,97,7,3,
0,0,97,21,1,0,0,0,98,99,5,27,0,0,99,23,1,0,0,0,100,101,3,26,13,0,101,102,
5,12,0,0,102,107,3,8,4,0,103,104,5,21,0,0,104,106,3,8,4,0,105,103,1,0,0,
0,106,109,1,0,0,0,107,105,1,0,0,0,107,108,1,0,0,0,108,110,1,0,0,0,109,107,
1,0,0,0,110,111,5,13,0,0,111,25,1,0,0,0,112,113,7,4,0,0,113,27,1,0,0,0,114,
115,7,5,0,0,115,29,1,0,0,0,116,117,5,29,0,0,117,31,1,0,0,0,8,35,37,58,66,
74,83,92,107];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class calcParser extends antlr4.Parser {

    static grammarFileName = "calc.g4";
    static literalNames = [ null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", 
                            "'atan'", "'ln'", "'log'", "'sqrt'", "'print'", 
                            "':='", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
                            "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", 
                            null, "'i'" ];
    static symbolicNames = [ null, "COS", "SIN", "TAN", "ACOS", "ASIN", 
                             "ATAN", "LN", "LOG", "SQRT", "PRINT", "EQCOL", 
                             "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
                             "DIV", "GT", "LT", "EQ", "COMMA", "POINT", 
                             "POW", "PI", "EULER", "I", "VARIABLE", "REAL", 
                             "EOL", "WS" ];
    static ruleNames = [ "program", "assign", "print", "condition", "expression", 
                         "multiplyingExpression", "powExpression", "signedAtom", 
                         "atom", "number", "constant", "variable", "func", 
                         "funcname", "relop", "emptyline" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = calcParser.ruleNames;
        this.literalNames = calcParser.literalNames;
        this.symbolicNames = calcParser.symbolicNames;

        calcParser.prototype.start = function() {
            console.log("Started...")
        }

    }



	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, calcParser.RULE_program);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 37;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 671089664) !== 0)) {
	            this.state = 35;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case 10:
	                this.state = 32;
	                this.print();
	                break;
	            case 27:
	                this.state = 33;
	                this.assign();
	                break;
	            case 29:
	                this.state = 34;
	                this.emptyline();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 39;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	assign() {
	    let localctx = new AssignContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, calcParser.RULE_assign);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 40;
	        this.match(calcParser.VARIABLE);
	        this.state = 41;
	        _la = this._input.LA(1);
	        if(!(_la===11 || _la===20)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 42;
	        this.expression();
	        this.state = 43;
	        this.match(calcParser.EOL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	print() {
	    let localctx = new PrintContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, calcParser.RULE_print);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 45;
	        this.match(calcParser.PRINT);
	        this.state = 46;
	        this.expression();
	        this.state = 47;
	        this.match(calcParser.EOL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condition() {
	    let localctx = new ConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, calcParser.RULE_condition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 49;
	        this.expression();
	        this.state = 50;
	        this.relop();
	        this.state = 51;
	        this.expression();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expression() {
	    let localctx = new ExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, calcParser.RULE_expression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 53;
	        this.multiplyingExpression();
	        this.state = 58;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===14 || _la===15) {
	            this.state = 54;
	            _la = this._input.LA(1);
	            if(!(_la===14 || _la===15)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 55;
	            this.multiplyingExpression();
	            this.state = 60;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	multiplyingExpression() {
	    let localctx = new MultiplyingExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, calcParser.RULE_multiplyingExpression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 61;
	        this.powExpression();
	        this.state = 66;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===16 || _la===17) {
	            this.state = 62;
	            _la = this._input.LA(1);
	            if(!(_la===16 || _la===17)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 63;
	            this.powExpression();
	            this.state = 68;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	powExpression() {
	    let localctx = new PowExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, calcParser.RULE_powExpression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 69;
	        this.signedAtom();
	        this.state = 74;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===23) {
	            this.state = 70;
	            this.match(calcParser.POW);
	            this.state = 71;
	            this.signedAtom();
	            this.state = 76;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	signedAtom() {
	    let localctx = new SignedAtomContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, calcParser.RULE_signedAtom);
	    try {
	        this.state = 83;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 14:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 77;
	            this.match(calcParser.PLUS);
	            this.state = 78;
	            this.signedAtom();
	            break;
	        case 15:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 79;
	            this.match(calcParser.MINUS);
	            this.state = 80;
	            this.signedAtom();
	            break;
	        case 1:
	        case 2:
	        case 3:
	        case 4:
	        case 5:
	        case 6:
	        case 7:
	        case 8:
	        case 9:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 81;
	            this.func();
	            break;
	        case 12:
	        case 24:
	        case 25:
	        case 26:
	        case 27:
	        case 28:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 82;
	            this.atom();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	atom() {
	    let localctx = new AtomContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, calcParser.RULE_atom);
	    try {
	        this.state = 92;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 28:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 85;
	            this.number();
	            break;
	        case 27:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 86;
	            this.variable();
	            break;
	        case 24:
	        case 25:
	        case 26:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 87;
	            this.constant();
	            break;
	        case 12:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 88;
	            this.match(calcParser.LPAREN);
	            this.state = 89;
	            this.expression();
	            this.state = 90;
	            this.match(calcParser.RPAREN);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	number() {
	    let localctx = new NumberContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, calcParser.RULE_number);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 94;
	        this.match(calcParser.REAL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	constant() {
	    let localctx = new ConstantContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, calcParser.RULE_constant);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 96;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 117440512) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variable() {
	    let localctx = new VariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, calcParser.RULE_variable);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 98;
	        this.match(calcParser.VARIABLE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	func() {
	    let localctx = new FuncContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, calcParser.RULE_func);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 100;
	        this.funcname();
	        this.state = 101;
	        this.match(calcParser.LPAREN);
	        this.state = 102;
	        this.expression();
	        this.state = 107;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===21) {
	            this.state = 103;
	            this.match(calcParser.COMMA);
	            this.state = 104;
	            this.expression();
	            this.state = 109;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 110;
	        this.match(calcParser.RPAREN);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	funcname() {
	    let localctx = new FuncnameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, calcParser.RULE_funcname);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 112;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 1022) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	relop() {
	    let localctx = new RelopContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, calcParser.RULE_relop);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 114;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 1835008) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	emptyline() {
	    let localctx = new EmptylineContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, calcParser.RULE_emptyline);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 116;
	        this.match(calcParser.EOL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

calcParser.EOF = antlr4.Token.EOF;
calcParser.COS = 1;
calcParser.SIN = 2;
calcParser.TAN = 3;
calcParser.ACOS = 4;
calcParser.ASIN = 5;
calcParser.ATAN = 6;
calcParser.LN = 7;
calcParser.LOG = 8;
calcParser.SQRT = 9;
calcParser.PRINT = 10;
calcParser.EQCOL = 11;
calcParser.LPAREN = 12;
calcParser.RPAREN = 13;
calcParser.PLUS = 14;
calcParser.MINUS = 15;
calcParser.TIMES = 16;
calcParser.DIV = 17;
calcParser.GT = 18;
calcParser.LT = 19;
calcParser.EQ = 20;
calcParser.COMMA = 21;
calcParser.POINT = 22;
calcParser.POW = 23;
calcParser.PI = 24;
calcParser.EULER = 25;
calcParser.I = 26;
calcParser.VARIABLE = 27;
calcParser.REAL = 28;
calcParser.EOL = 29;
calcParser.WS = 30;

calcParser.RULE_program = 0;
calcParser.RULE_assign = 1;
calcParser.RULE_print = 2;
calcParser.RULE_condition = 3;
calcParser.RULE_expression = 4;
calcParser.RULE_multiplyingExpression = 5;
calcParser.RULE_powExpression = 6;
calcParser.RULE_signedAtom = 7;
calcParser.RULE_atom = 8;
calcParser.RULE_number = 9;
calcParser.RULE_constant = 10;
calcParser.RULE_variable = 11;
calcParser.RULE_func = 12;
calcParser.RULE_funcname = 13;
calcParser.RULE_relop = 14;
calcParser.RULE_emptyline = 15;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_program;
    }

	print = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PrintContext);
	    } else {
	        return this.getTypedRuleContext(PrintContext,i);
	    }
	};

	assign = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(AssignContext);
	    } else {
	        return this.getTypedRuleContext(AssignContext,i);
	    }
	};

	emptyline = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EmptylineContext);
	    } else {
	        return this.getTypedRuleContext(EmptylineContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterProgram(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitProgram(this);
		}
	}


}



class AssignContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_assign;
    }

	VARIABLE() {
	    return this.getToken(calcParser.VARIABLE, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	EOL() {
	    return this.getToken(calcParser.EOL, 0);
	};

	EQCOL() {
	    return this.getToken(calcParser.EQCOL, 0);
	};

	EQ() {
	    return this.getToken(calcParser.EQ, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterAssign(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitAssign(this);
		}
	}


}



class PrintContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_print;
    }

	PRINT() {
	    return this.getToken(calcParser.PRINT, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	EOL() {
	    return this.getToken(calcParser.EOL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterPrint(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitPrint(this);
		}
	}


}



class ConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_condition;
    }

	expression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ExpressionContext,i);
	    }
	};

	relop() {
	    return this.getTypedRuleContext(RelopContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitCondition(this);
		}
	}


}



class ExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_expression;
    }

	multiplyingExpression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(MultiplyingExpressionContext);
	    } else {
	        return this.getTypedRuleContext(MultiplyingExpressionContext,i);
	    }
	};

	PLUS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(calcParser.PLUS);
	    } else {
	        return this.getToken(calcParser.PLUS, i);
	    }
	};


	MINUS = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(calcParser.MINUS);
	    } else {
	        return this.getToken(calcParser.MINUS, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitExpression(this);
		}
	}


}



class MultiplyingExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_multiplyingExpression;
    }

	powExpression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PowExpressionContext);
	    } else {
	        return this.getTypedRuleContext(PowExpressionContext,i);
	    }
	};

	TIMES = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(calcParser.TIMES);
	    } else {
	        return this.getToken(calcParser.TIMES, i);
	    }
	};


	DIV = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(calcParser.DIV);
	    } else {
	        return this.getToken(calcParser.DIV, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterMultiplyingExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitMultiplyingExpression(this);
		}
	}


}



class PowExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_powExpression;
    }

	signedAtom = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SignedAtomContext);
	    } else {
	        return this.getTypedRuleContext(SignedAtomContext,i);
	    }
	};

	POW = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(calcParser.POW);
	    } else {
	        return this.getToken(calcParser.POW, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterPowExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitPowExpression(this);
		}
	}


}



class SignedAtomContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_signedAtom;
    }

	PLUS() {
	    return this.getToken(calcParser.PLUS, 0);
	};

	signedAtom() {
	    return this.getTypedRuleContext(SignedAtomContext,0);
	};

	MINUS() {
	    return this.getToken(calcParser.MINUS, 0);
	};

	func() {
	    return this.getTypedRuleContext(FuncContext,0);
	};

	atom() {
	    return this.getTypedRuleContext(AtomContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterSignedAtom(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitSignedAtom(this);
		}
	}


}



class AtomContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_atom;
    }

	number() {
	    return this.getTypedRuleContext(NumberContext,0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	constant() {
	    return this.getTypedRuleContext(ConstantContext,0);
	};

	LPAREN() {
	    return this.getToken(calcParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(calcParser.RPAREN, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterAtom(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitAtom(this);
		}
	}


}



class NumberContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_number;
    }

	REAL() {
	    return this.getToken(calcParser.REAL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterNumber(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitNumber(this);
		}
	}


}



class ConstantContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_constant;
    }

	PI() {
	    return this.getToken(calcParser.PI, 0);
	};

	EULER() {
	    return this.getToken(calcParser.EULER, 0);
	};

	I() {
	    return this.getToken(calcParser.I, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterConstant(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitConstant(this);
		}
	}


}



class VariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_variable;
    }

	VARIABLE() {
	    return this.getToken(calcParser.VARIABLE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitVariable(this);
		}
	}


}



class FuncContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_func;
    }

	funcname() {
	    return this.getTypedRuleContext(FuncnameContext,0);
	};

	LPAREN() {
	    return this.getToken(calcParser.LPAREN, 0);
	};

	expression = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExpressionContext);
	    } else {
	        return this.getTypedRuleContext(ExpressionContext,i);
	    }
	};

	RPAREN() {
	    return this.getToken(calcParser.RPAREN, 0);
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(calcParser.COMMA);
	    } else {
	        return this.getToken(calcParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterFunc(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitFunc(this);
		}
	}


}



class FuncnameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_funcname;
    }

	COS() {
	    return this.getToken(calcParser.COS, 0);
	};

	TAN() {
	    return this.getToken(calcParser.TAN, 0);
	};

	SIN() {
	    return this.getToken(calcParser.SIN, 0);
	};

	ACOS() {
	    return this.getToken(calcParser.ACOS, 0);
	};

	ATAN() {
	    return this.getToken(calcParser.ATAN, 0);
	};

	ASIN() {
	    return this.getToken(calcParser.ASIN, 0);
	};

	LOG() {
	    return this.getToken(calcParser.LOG, 0);
	};

	LN() {
	    return this.getToken(calcParser.LN, 0);
	};

	SQRT() {
	    return this.getToken(calcParser.SQRT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterFuncname(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitFuncname(this);
		}
	}


}



class RelopContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_relop;
    }

	EQ() {
	    return this.getToken(calcParser.EQ, 0);
	};

	GT() {
	    return this.getToken(calcParser.GT, 0);
	};

	LT() {
	    return this.getToken(calcParser.LT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterRelop(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitRelop(this);
		}
	}


}



class EmptylineContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = calcParser.RULE_emptyline;
    }

	EOL() {
	    return this.getToken(calcParser.EOL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.enterEmptyline(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof calcListener ) {
	        listener.exitEmptyline(this);
		}
	}


}




calcParser.ProgramContext = ProgramContext; 
calcParser.AssignContext = AssignContext; 
calcParser.PrintContext = PrintContext; 
calcParser.ConditionContext = ConditionContext; 
calcParser.ExpressionContext = ExpressionContext; 
calcParser.MultiplyingExpressionContext = MultiplyingExpressionContext; 
calcParser.PowExpressionContext = PowExpressionContext; 
calcParser.SignedAtomContext = SignedAtomContext; 
calcParser.AtomContext = AtomContext; 
calcParser.NumberContext = NumberContext; 
calcParser.ConstantContext = ConstantContext; 
calcParser.VariableContext = VariableContext; 
calcParser.FuncContext = FuncContext; 
calcParser.FuncnameContext = FuncnameContext; 
calcParser.RelopContext = RelopContext; 
calcParser.EmptylineContext = EmptylineContext; 
