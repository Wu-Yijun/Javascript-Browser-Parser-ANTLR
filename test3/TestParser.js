// Generated from ./Test.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from './antlr4.js';
import TestListener from './TestListener.js';
const serializedATN = [4,1,5,36,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,0,1,0,1,0,
1,0,5,0,12,8,0,10,0,12,0,15,9,0,1,1,1,1,5,1,19,8,1,10,1,12,1,22,9,1,1,1,
1,1,3,1,26,8,1,1,1,1,1,1,1,5,1,31,8,1,10,1,12,1,34,9,1,1,1,1,20,2,0,2,2,
0,2,0,0,37,0,4,1,0,0,0,2,16,1,0,0,0,4,5,6,0,-1,0,5,6,5,1,0,0,6,7,3,2,1,0,
7,8,5,2,0,0,8,13,1,0,0,0,9,10,10,1,0,0,10,12,5,5,0,0,11,9,1,0,0,0,12,15,
1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,14,1,1,0,0,0,15,13,1,0,0,0,16,20,6,1,
-1,0,17,19,9,0,0,0,18,17,1,0,0,0,19,22,1,0,0,0,20,21,1,0,0,0,20,18,1,0,0,
0,21,25,1,0,0,0,22,20,1,0,0,0,23,24,5,3,0,0,24,26,5,4,0,0,25,23,1,0,0,0,
25,26,1,0,0,0,26,32,1,0,0,0,27,28,10,1,0,0,28,29,5,5,0,0,29,31,3,2,1,2,30,
27,1,0,0,0,31,34,1,0,0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,3,1,0,0,0,34,32,
1,0,0,0,4,13,20,25,32];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class TestParser extends antlr4.Parser {

    static grammarFileName = "Test.g4";
    static literalNames = [ null, "'/*'", "'*/'" ];
    static symbolicNames = [ null, null, null, "CommentProperty", "CommentPropertyText", 
                             "NL" ];
    static ruleNames = [ "commentBlock", "commentBlockContents" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = TestParser.ruleNames;
        this.literalNames = TestParser.literalNames;
        this.symbolicNames = TestParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 0:
    	    		return this.commentBlock_sempred(localctx, predIndex);
    	case 1:
    	    		return this.commentBlockContents_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    commentBlock_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    commentBlockContents_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 1:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };



	commentBlock(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new CommentBlockContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 0;
	    this.enterRecursionRule(localctx, 0, TestParser.RULE_commentBlock, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 5;
	        this.match(TestParser.T__0);
	        this.state = 6;
	        this.commentBlockContents(0);
	        this.state = 7;
	        this.match(TestParser.T__1);
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 13;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,0,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new CommentBlockContext(this, _parentctx, _parentState);
	                this.pushNewRecursionContext(localctx, _startState, TestParser.RULE_commentBlock);
	                this.state = 9;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 10;
	                this.match(TestParser.NL); 
	            }
	            this.state = 15;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,0,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}


	commentBlockContents(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new CommentBlockContentsContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 2;
	    this.enterRecursionRule(localctx, 2, TestParser.RULE_commentBlockContents, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 20;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,1,this._ctx)
	        while(_alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1+1) {
	                this.state = 17;
	                this.matchWildcard(); 
	            }
	            this.state = 22;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,1,this._ctx);
	        }

	        this.state = 25;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
	        if(la_===1) {
	            this.state = 23;
	            this.match(TestParser.CommentProperty);
	            this.state = 24;
	            this.match(TestParser.CommentPropertyText);

	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 32;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,3,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new CommentBlockContentsContext(this, _parentctx, _parentState);
	                this.pushNewRecursionContext(localctx, _startState, TestParser.RULE_commentBlockContents);
	                this.state = 27;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 28;
	                this.match(TestParser.NL);
	                this.state = 29;
	                this.commentBlockContents(2); 
	            }
	            this.state = 34;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,3,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}


}

TestParser.EOF = antlr4.Token.EOF;
TestParser.T__0 = 1;
TestParser.T__1 = 2;
TestParser.CommentProperty = 3;
TestParser.CommentPropertyText = 4;
TestParser.NL = 5;

TestParser.RULE_commentBlock = 0;
TestParser.RULE_commentBlockContents = 1;

class CommentBlockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestParser.RULE_commentBlock;
    }

	commentBlockContents() {
	    return this.getTypedRuleContext(CommentBlockContentsContext,0);
	};

	commentBlock() {
	    return this.getTypedRuleContext(CommentBlockContext,0);
	};

	NL() {
	    return this.getToken(TestParser.NL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestListener ) {
	        listener.enterCommentBlock(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestListener ) {
	        listener.exitCommentBlock(this);
		}
	}


}



class CommentBlockContentsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestParser.RULE_commentBlockContents;
    }

	CommentProperty() {
	    return this.getToken(TestParser.CommentProperty, 0);
	};

	CommentPropertyText() {
	    return this.getToken(TestParser.CommentPropertyText, 0);
	};

	commentBlockContents = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CommentBlockContentsContext);
	    } else {
	        return this.getTypedRuleContext(CommentBlockContentsContext,i);
	    }
	};

	NL() {
	    return this.getToken(TestParser.NL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestListener ) {
	        listener.enterCommentBlockContents(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestListener ) {
	        listener.exitCommentBlockContents(this);
		}
	}


}




TestParser.CommentBlockContext = CommentBlockContext; 
TestParser.CommentBlockContentsContext = CommentBlockContentsContext; 
