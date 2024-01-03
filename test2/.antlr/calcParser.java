// Generated from f:/Github/Javascript-Browser-Parser-ANTLR/test2/calc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class calcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, PRINT=10, 
		EQCOL=11, LPAREN=12, RPAREN=13, PLUS=14, MINUS=15, TIMES=16, DIV=17, GT=18, 
		LT=19, EQ=20, COMMA=21, POINT=22, POW=23, PI=24, EULER=25, I=26, VARIABLE=27, 
		REAL=28, EOL=29, WS=30;
	public static final int
		RULE_program = 0, RULE_assign = 1, RULE_print = 2, RULE_condition = 3, 
		RULE_expression = 4, RULE_multiplyingExpression = 5, RULE_powExpression = 6, 
		RULE_signedAtom = 7, RULE_atom = 8, RULE_number = 9, RULE_constant = 10, 
		RULE_variable = 11, RULE_func = 12, RULE_funcname = 13, RULE_relop = 14, 
		RULE_emptyline = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "assign", "print", "condition", "expression", "multiplyingExpression", 
			"powExpression", "signedAtom", "atom", "number", "constant", "variable", 
			"func", "funcname", "relop", "emptyline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", 
			"'log'", "'sqrt'", "'print'", "':='", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", null, "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", 
			"PRINT", "EQCOL", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", "I", "VARIABLE", 
			"REAL", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	calcParser.prototype.start = function() {
	    console.log("Started...")
	}

	public calcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<EmptylineContext> emptyline() {
			return getRuleContexts(EmptylineContext.class);
		}
		public EmptylineContext emptyline(int i) {
			return getRuleContext(EmptylineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 671089664L) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
					{
					setState(32);
					print();
					}
					break;
				case VARIABLE:
					{
					setState(33);
					assign();
					}
					break;
				case EOL:
					{
					setState(34);
					emptyline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(calcParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(calcParser.EOL, 0); }
		public TerminalNode EQCOL() { return getToken(calcParser.EQCOL, 0); }
		public TerminalNode EQ() { return getToken(calcParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VARIABLE);
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==EQCOL || _la==EQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			expression();
			setState(43);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(calcParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(calcParser.EOL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PRINT);
			setState(46);
			expression();
			setState(47);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			expression();
			setState(50);
			relop();
			setState(51);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(calcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(calcParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(calcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(calcParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			multiplyingExpression();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				multiplyingExpression();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(calcParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(calcParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(calcParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(calcParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			powExpression();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				powExpression();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowExpressionContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(calcParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(calcParser.POW, i);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			signedAtom();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(70);
				match(POW);
				setState(71);
				signedAtom();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignedAtomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(calcParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(calcParser.MINUS, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedAtom);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(PLUS);
				setState(78);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(MINUS);
				setState(80);
				signedAtom();
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				func();
				}
				break;
			case LPAREN:
			case PI:
			case EULER:
			case I:
			case VARIABLE:
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(calcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calcParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				number();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				variable();
				}
				break;
			case PI:
			case EULER:
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(LPAREN);
				setState(89);
				expression();
				setState(90);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(calcParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(calcParser.PI, 0); }
		public TerminalNode EULER() { return getToken(calcParser.EULER, 0); }
		public TerminalNode I() { return getToken(calcParser.I, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(calcParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(calcParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(calcParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(calcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calcParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			funcname();
			setState(101);
			match(LPAREN);
			setState(102);
			expression();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);
				setState(104);
				expression();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(calcParser.COS, 0); }
		public TerminalNode TAN() { return getToken(calcParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(calcParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(calcParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(calcParser.ATAN, 0); }
		public TerminalNode ASIN() { return getToken(calcParser.ASIN, 0); }
		public TerminalNode LOG() { return getToken(calcParser.LOG, 0); }
		public TerminalNode LN() { return getToken(calcParser.LN, 0); }
		public TerminalNode SQRT() { return getToken(calcParser.SQRT, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(calcParser.EQ, 0); }
		public TerminalNode GT() { return getToken(calcParser.GT, 0); }
		public TerminalNode LT() { return getToken(calcParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptylineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(calcParser.EOL, 0); }
		public EmptylineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyline; }
	}

	public final EmptylineContext emptyline() throws RecognitionException {
		EmptylineContext _localctx = new EmptylineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emptyline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ew\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"9\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005A\b\u0005\n\u0005\f\u0005D\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006I\b\u0006\n\u0006\f\u0006L\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"T\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b]\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fj\b\f\n\f\f\fm\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0006\u0002\u0000\u000b\u000b"+
		"\u0014\u0014\u0001\u0000\u000e\u000f\u0001\u0000\u0010\u0011\u0001\u0000"+
		"\u0018\u001a\u0001\u0000\u0001\t\u0001\u0000\u0012\u0014s\u0000%\u0001"+
		"\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000"+
		"\u0000\u00061\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n=\u0001"+
		"\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000"+
		"\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012^\u0001\u0000\u0000\u0000"+
		"\u0014`\u0001\u0000\u0000\u0000\u0016b\u0001\u0000\u0000\u0000\u0018d"+
		"\u0001\u0000\u0000\u0000\u001ap\u0001\u0000\u0000\u0000\u001cr\u0001\u0000"+
		"\u0000\u0000\u001et\u0001\u0000\u0000\u0000 $\u0003\u0004\u0002\u0000"+
		"!$\u0003\u0002\u0001\u0000\"$\u0003\u001e\u000f\u0000# \u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001"+
		"\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u001b\u0000"+
		"\u0000)*\u0007\u0000\u0000\u0000*+\u0003\b\u0004\u0000+,\u0005\u001d\u0000"+
		"\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005\n\u0000\u0000./\u0003\b"+
		"\u0004\u0000/0\u0005\u001d\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"12\u0003\b\u0004\u000023\u0003\u001c\u000e\u000034\u0003\b\u0004\u0000"+
		"4\u0007\u0001\u0000\u0000\u00005:\u0003\n\u0005\u000067\u0007\u0001\u0000"+
		"\u000079\u0003\n\u0005\u000086\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\t\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=B\u0003\f\u0006\u0000>?\u0007\u0002"+
		"\u0000\u0000?A\u0003\f\u0006\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000b"+
		"\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EJ\u0003\u000e\u0007"+
		"\u0000FG\u0005\u0017\u0000\u0000GI\u0003\u000e\u0007\u0000HF\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MN\u0005\u000e\u0000\u0000NT\u0003\u000e\u0007\u0000OP\u0005\u000f\u0000"+
		"\u0000PT\u0003\u000e\u0007\u0000QT\u0003\u0018\f\u0000RT\u0003\u0010\b"+
		"\u0000SM\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000"+
		"U]\u0003\u0012\t\u0000V]\u0003\u0016\u000b\u0000W]\u0003\u0014\n\u0000"+
		"XY\u0005\f\u0000\u0000YZ\u0003\b\u0004\u0000Z[\u0005\r\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000"+
		"\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]\u0011\u0001\u0000"+
		"\u0000\u0000^_\u0005\u001c\u0000\u0000_\u0013\u0001\u0000\u0000\u0000"+
		"`a\u0007\u0003\u0000\u0000a\u0015\u0001\u0000\u0000\u0000bc\u0005\u001b"+
		"\u0000\u0000c\u0017\u0001\u0000\u0000\u0000de\u0003\u001a\r\u0000ef\u0005"+
		"\f\u0000\u0000fk\u0003\b\u0004\u0000gh\u0005\u0015\u0000\u0000hj\u0003"+
		"\b\u0004\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000no\u0005\r\u0000\u0000o\u0019\u0001\u0000\u0000"+
		"\u0000pq\u0007\u0004\u0000\u0000q\u001b\u0001\u0000\u0000\u0000rs\u0007"+
		"\u0005\u0000\u0000s\u001d\u0001\u0000\u0000\u0000tu\u0005\u001d\u0000"+
		"\u0000u\u001f\u0001\u0000\u0000\u0000\b#%:BJS\\k";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}