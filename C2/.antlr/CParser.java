// Generated from f:/Github/Javascript-Browser-Parser-ANTLR/C2/C.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Auto=20, Break=21, Case=22, Char=23, Const=24, Continue=25, 
		Default=26, Do=27, Double=28, Else=29, Enum=30, Extern=31, Float=32, For=33, 
		Goto=34, If=35, Inline=36, Int=37, Long=38, Register=39, Restrict=40, 
		Return=41, Short=42, Signed=43, Sizeof=44, Static=45, Struct=46, Switch=47, 
		Typedef=48, Union=49, Unsigned=50, Void=51, Volatile=52, While=53, Alignas=54, 
		Alignof=55, Atomic=56, Bool=57, Complex=58, Generic=59, Imaginary=60, 
		Noreturn=61, StaticAssert=62, ThreadLocal=63, LeftParen=64, RightParen=65, 
		LeftBracket=66, RightBracket=67, LeftBrace=68, RightBrace=69, Less=70, 
		LessEqual=71, Greater=72, GreaterEqual=73, LeftShift=74, RightShift=75, 
		Plus=76, PlusPlus=77, Minus=78, MinusMinus=79, Star=80, Div=81, Mod=82, 
		And=83, Or=84, AndAnd=85, OrOr=86, Caret=87, Not=88, Tilde=89, Question=90, 
		Colon=91, Semi=92, Comma=93, Assign=94, StarAssign=95, DivAssign=96, ModAssign=97, 
		PlusAssign=98, MinusAssign=99, LeftShiftAssign=100, RightShiftAssign=101, 
		AndAssign=102, XorAssign=103, OrAssign=104, Equal=105, NotEqual=106, Arrow=107, 
		Dot=108, Ellipsis=109, Identifier=110, Constant=111, DigitSequence=112, 
		StringLiteral=113, MultiLineMacro=114, Directive=115, AsmBlock=116, Whitespace=117, 
		Newline=118, BlockComment=119, BlockCommentA=120, BlockCommentNote=121, 
		LineComment=122;
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_argumentExpressionList = 5, 
		RULE_unaryExpression = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_shiftExpression = 11, 
		RULE_relationalExpression = 12, RULE_equalityExpression = 13, RULE_andExpression = 14, 
		RULE_exclusiveOrExpression = 15, RULE_inclusiveOrExpression = 16, RULE_logicalAndExpression = 17, 
		RULE_logicalOrExpression = 18, RULE_conditionalExpression = 19, RULE_assignmentExpression = 20, 
		RULE_assignmentOperator = 21, RULE_expression = 22, RULE_constantExpression = 23, 
		RULE_declaration = 24, RULE_declarationSpecifiers = 25, RULE_declarationSpecifiers2 = 26, 
		RULE_declarationSpecifier = 27, RULE_initDeclaratorList = 28, RULE_initDeclarator = 29, 
		RULE_storageClassSpecifier = 30, RULE_typeSpecifier = 31, RULE_structOrUnionSpecifier = 32, 
		RULE_structOrUnion = 33, RULE_structDeclarationList = 34, RULE_structDeclaration = 35, 
		RULE_specifierQualifierList = 36, RULE_structDeclaratorList = 37, RULE_structDeclarator = 38, 
		RULE_enumSpecifier = 39, RULE_enumeratorList = 40, RULE_enumerator = 41, 
		RULE_enumerationConstant = 42, RULE_atomicTypeSpecifier = 43, RULE_typeQualifier = 44, 
		RULE_functionSpecifier = 45, RULE_alignmentSpecifier = 46, RULE_declarator = 47, 
		RULE_directDeclarator = 48, RULE_vcSpecificModifer = 49, RULE_gccDeclaratorExtension = 50, 
		RULE_gccAttributeSpecifier = 51, RULE_gccAttributeList = 52, RULE_gccAttribute = 53, 
		RULE_nestedParenthesesBlock = 54, RULE_pointer = 55, RULE_typeQualifierList = 56, 
		RULE_parameterTypeList = 57, RULE_parameterList = 58, RULE_parameterDeclaration = 59, 
		RULE_identifierList = 60, RULE_typeName = 61, RULE_abstractDeclarator = 62, 
		RULE_directAbstractDeclarator = 63, RULE_typedefName = 64, RULE_initializer = 65, 
		RULE_initializerList = 66, RULE_designation = 67, RULE_designatorList = 68, 
		RULE_designator = 69, RULE_staticAssertDeclaration = 70, RULE_statement = 71, 
		RULE_labeledStatement = 72, RULE_compoundStatement = 73, RULE_blockItemList = 74, 
		RULE_blockItem = 75, RULE_expressionStatement = 76, RULE_selectionStatement = 77, 
		RULE_iterationStatement = 78, RULE_forCondition = 79, RULE_forDeclaration = 80, 
		RULE_forExpression = 81, RULE_jumpStatement = 82, RULE_compilationUnit = 83, 
		RULE_translationUnit = 84, RULE_externalDeclaration = 85, RULE_functionDefinition = 86, 
		RULE_declarationList = 87, RULE_blockCommentA = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
			"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
			"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
			"conditionalExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
			"vcSpecificModifer", "gccDeclaratorExtension", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
			"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "compilationUnit", "translationUnit", 
			"externalDeclaration", "functionDefinition", "declarationList", "blockCommentA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'", 
			"'__stdcall'", "'__declspec'", "'__cdecl'", "'__clrcall'", "'__fastcall'", 
			"'__thiscall'", "'__vectorcall'", "'__asm'", "'__attribute__'", "'__asm__'", 
			"'__volatile__'", "'auto'", "'break'", "'case'", "'char'", "'const'", 
			"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", 
			"'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", 
			"'register'", "'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", 
			"'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", 
			"'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
			"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
			"'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Auto", "Break", "Case", 
			"Char", "Const", "Continue", "Default", "Do", "Double", "Else", "Enum", 
			"Extern", "Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register", 
			"Restrict", "Return", "Short", "Signed", "Sizeof", "Static", "Struct", 
			"Switch", "Typedef", "Union", "Unsigned", "Void", "Volatile", "While", 
			"Alignas", "Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", 
			"Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", "Constant", 
			"DigitSequence", "StringLiteral", "MultiLineMacro", "Directive", "AsmBlock", 
			"Whitespace", "Newline", "BlockComment", "BlockCommentA", "BlockCommentNote", 
			"LineComment"
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					match(StringLiteral);
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(LeftParen);
				setState(186);
				expression();
				setState(187);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(190);
					match(T__0);
					}
				}

				setState(193);
				match(LeftParen);
				setState(194);
				compoundStatement();
				setState(195);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(T__1);
				setState(198);
				match(LeftParen);
				setState(199);
				unaryExpression();
				setState(200);
				match(Comma);
				setState(201);
				typeName();
				setState(202);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(T__2);
				setState(205);
				match(LeftParen);
				setState(206);
				typeName();
				setState(207);
				match(Comma);
				setState(208);
				unaryExpression();
				setState(209);
				match(RightParen);
				}
				break;
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
	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(CParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(Generic);
			setState(214);
			match(LeftParen);
			setState(215);
			assignmentExpression();
			setState(216);
			match(Comma);
			setState(217);
			genericAssocList();
			setState(218);
			match(RightParen);
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
	public static class GenericAssocListContext extends ParserRuleContext {
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericAssocList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			genericAssociation();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(221);
				match(Comma);
				setState(222);
				genericAssociation();
				}
				}
				setState(227);
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
	public static class GenericAssociationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				{
				setState(228);
				typeName();
				}
				break;
			case Default:
				{
				setState(229);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			match(Colon);
			setState(233);
			assignmentExpression();
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(CParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CParser.RightBracket, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(CParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(CParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(CParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(CParser.MinusMinus, i);
		}
		public List<TerminalNode> Dot() { return getTokens(CParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(CParser.Dot, i);
		}
		public List<TerminalNode> Arrow() { return getTokens(CParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(CParser.Arrow, i);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(235);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(236);
					match(T__0);
					}
				}

				setState(239);
				match(LeftParen);
				setState(240);
				typeName();
				setState(241);
				match(RightParen);
				setState(242);
				match(LeftBrace);
				setState(243);
				initializerList();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(244);
					match(Comma);
					}
				}

				setState(247);
				match(RightBrace);
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 26388279107589L) != 0)) {
				{
				setState(264);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(251);
					match(LeftBracket);
					setState(252);
					expression();
					setState(253);
					match(RightBracket);
					}
					break;
				case LeftParen:
					{
					setState(255);
					match(LeftParen);
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
						{
						setState(256);
						argumentExpressionList();
						}
					}

					setState(259);
					match(RightParen);
					}
					break;
				case Arrow:
				case Dot:
					{
					setState(260);
					_la = _input.LA(1);
					if ( !(_la==Arrow || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(261);
					match(Identifier);
					}
					break;
				case PlusPlus:
					{
					setState(262);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(263);
					match(MinusMinus);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(268);
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
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			assignmentExpression();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(270);
				match(Comma);
				setState(271);
				assignmentExpression();
				}
				}
				setState(276);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode AndAnd() { return getToken(CParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public List<TerminalNode> Sizeof() { return getTokens(CParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(CParser.Sizeof, i);
		}
		public TerminalNode Alignof() { return getToken(CParser.Alignof, 0); }
		public List<TerminalNode> PlusPlus() { return getTokens(CParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(CParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(CParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(CParser.MinusMinus, i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					_la = _input.LA(1);
					if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 42949672961L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case Generic:
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(283);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				{
				setState(284);
				unaryOperator();
				setState(285);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				match(LeftParen);
				setState(289);
				typeName();
				setState(290);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(292);
				match(AndAnd);
				setState(293);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 12437L) != 0)) ) {
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
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(298);
					match(T__0);
					}
				}

				setState(301);
				match(LeftParen);
				setState(302);
				typeName();
				setState(303);
				match(RightParen);
				setState(304);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(DigitSequence);
				}
				break;
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(CParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(CParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(CParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(CParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(CParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			castExpression();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) {
				{
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				castExpression();
				}
				}
				setState(317);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(CParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(CParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(CParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(CParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			multiplicativeExpression();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				multiplicativeExpression();
				}
				}
				setState(325);
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
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LeftShift() { return getTokens(CParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(CParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(CParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(CParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			additiveExpression();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				additiveExpression();
				}
				}
				setState(333);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(CParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(CParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(CParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(CParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(CParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(CParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			shiftExpression();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 15L) != 0)) {
				{
				{
				setState(335);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				shiftExpression();
				}
				}
				setState(341);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(CParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(CParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(CParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(CParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			relationalExpression();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				relationalExpression();
				}
				}
				setState(349);
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
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(CParser.And); }
		public TerminalNode And(int i) {
			return getToken(CParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			equalityExpression();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(351);
				match(And);
				setState(352);
				equalityExpression();
				}
				}
				setState(357);
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
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(CParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			andExpression();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(359);
				match(Caret);
				setState(360);
				andExpression();
				}
				}
				setState(365);
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
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(CParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(CParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			exclusiveOrExpression();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(367);
				match(Or);
				setState(368);
				exclusiveOrExpression();
				}
				}
				setState(373);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(CParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(CParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			inclusiveOrExpression();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(375);
				match(AndAnd);
				setState(376);
				inclusiveOrExpression();
				}
				}
				setState(381);
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(CParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(CParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			logicalAndExpression();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(383);
				match(OrOr);
				setState(384);
				logicalAndExpression();
				}
				}
				setState(389);
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
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			logicalOrExpression();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(391);
				match(Question);
				setState(392);
				expression();
				setState(393);
				match(Colon);
				setState(394);
				conditionalExpression();
				}
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				unaryExpression();
				setState(400);
				assignmentOperator();
				setState(401);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(DigitSequence);
				}
				break;
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 2047L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			assignmentExpression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(409);
				match(Comma);
				setState(410);
				assignmentExpression();
				}
				}
				setState(415);
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
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			conditionalExpression();
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaration);
		int _la;
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__16:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				declarationSpecifiers();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70368752631809L) != 0)) {
					{
					setState(419);
					initDeclaratorList();
					}
				}

				setState(422);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				staticAssertDeclaration();
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
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(427);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				declarationSpecifier();
				}
				}
				setState(435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -6386264861217519630L) != 0) || _la==Identifier );
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
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifier);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				alignmentSpecifier();
				}
				break;
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
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			initDeclarator();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(445);
				match(Comma);
				setState(446);
				initDeclarator();
				}
				}
				setState(451);
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
	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			declarator();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(453);
				match(Assign);
				setState(454);
				initializer();
				}
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
	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(CParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(CParser.Extern, 0); }
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(CParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(CParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223054825601630208L) != 0)) ) {
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
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(CParser.Void, 0); }
		public TerminalNode Char() { return getToken(CParser.Char, 0); }
		public TerminalNode Short() { return getToken(CParser.Short, 0); }
		public TerminalNode Int() { return getToken(CParser.Int, 0); }
		public TerminalNode Long() { return getToken(CParser.Long, 0); }
		public TerminalNode Float() { return getToken(CParser.Float, 0); }
		public TerminalNode Double() { return getToken(CParser.Double, 0); }
		public TerminalNode Signed() { return getToken(CParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(CParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(CParser.Complex, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeSpecifier);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(Void);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(Char);
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(Short);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				match(Int);
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				match(Long);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				match(Float);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(465);
				match(Double);
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(466);
				match(Signed);
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(467);
				match(Unsigned);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 10);
				{
				setState(468);
				match(Bool);
				}
				break;
			case Complex:
				enterOuterAlt(_localctx, 11);
				{
				setState(469);
				match(Complex);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 12);
				{
				setState(470);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 13);
				{
				setState(471);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 14);
				{
				setState(472);
				match(T__5);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 15);
				{
				setState(473);
				match(T__0);
				setState(474);
				match(LeftParen);
				setState(475);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				match(RightParen);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 16);
				{
				setState(477);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 17);
				{
				setState(478);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 18);
				{
				setState(479);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 19);
				{
				setState(480);
				typedefName();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 20);
				{
				setState(481);
				match(T__6);
				setState(482);
				match(LeftParen);
				setState(483);
				constantExpression();
				setState(484);
				match(RightParen);
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
	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				structOrUnion();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(489);
					match(Identifier);
					}
				}

				setState(492);
				match(LeftBrace);
				setState(493);
				structDeclarationList();
				setState(494);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				structOrUnion();
				setState(497);
				match(Identifier);
				}
				break;
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
	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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
	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				structDeclaration();
				}
				}
				setState(506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 5124618506368712946L) != 0) || _la==Identifier );
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclaration);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				specifierQualifierList();
				setState(509);
				structDeclaratorList();
				setState(510);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				specifierQualifierList();
				setState(513);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				staticAssertDeclaration();
				}
				break;
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
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(518);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(519);
				typeQualifier();
				}
				break;
			}
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(522);
				specifierQualifierList();
				}
				break;
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
	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			structDeclarator();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(526);
				match(Comma);
				setState(527);
				structDeclarator();
				}
				}
				setState(532);
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
	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structDeclarator);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70368752631809L) != 0)) {
					{
					setState(534);
					declarator();
					}
				}

				setState(537);
				match(Colon);
				setState(538);
				constantExpression();
				}
				break;
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
	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumSpecifier);
		int _la;
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(Enum);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(542);
					match(Identifier);
					}
				}

				setState(545);
				match(LeftBrace);
				setState(546);
				enumeratorList();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(547);
					match(Comma);
					}
				}

				setState(550);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(Enum);
				setState(553);
				match(Identifier);
				}
				break;
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
	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			enumerator();
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557);
					match(Comma);
					setState(558);
					enumerator();
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			enumerationConstant();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(565);
				match(Assign);
				setState(566);
				constantExpression();
				}
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
	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(Identifier);
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
	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(CParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(Atomic);
			setState(572);
			match(LeftParen);
			setState(573);
			typeName();
			setState(574);
			match(RightParen);
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
	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(CParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(CParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(CParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) ) {
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
	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(CParser.Noreturn, 0); }
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionSpecifier);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Inline:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(Inline);
				}
				break;
			case Noreturn:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(Noreturn);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				match(T__8);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				gccAttributeSpecifier();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(583);
				match(T__9);
				setState(584);
				match(LeftParen);
				setState(585);
				match(Identifier);
				setState(586);
				match(RightParen);
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
	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(Alignas);
			setState(590);
			match(LeftParen);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(591);
				typeName();
				}
				break;
			case 2:
				{
				setState(592);
				constantExpression();
				}
				break;
			}
			setState(595);
			match(RightParen);
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
	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(597);
				pointer();
				}
			}

			setState(600);
			directDeclarator(0);
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public VcSpecificModiferContext vcSpecificModifer() {
			return getRuleContext(VcSpecificModiferContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(608);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(609);
				match(LeftParen);
				setState(610);
				declarator();
				setState(611);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(613);
				match(Identifier);
				setState(614);
				match(Colon);
				setState(615);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(616);
				vcSpecificModifer();
				setState(617);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(619);
				match(LeftParen);
				setState(620);
				vcSpecificModifer();
				setState(621);
				declarator();
				setState(622);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(626);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(627);
						match(LeftBracket);
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
							{
							setState(628);
							typeQualifierList();
							}
						}

						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
							{
							setState(631);
							assignmentExpression();
							}
						}

						setState(634);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(635);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(636);
						match(LeftBracket);
						setState(637);
						match(Static);
						setState(639);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
							{
							setState(638);
							typeQualifierList();
							}
						}

						setState(641);
						assignmentExpression();
						setState(642);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(644);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(645);
						match(LeftBracket);
						setState(646);
						typeQualifierList();
						setState(647);
						match(Static);
						setState(648);
						assignmentExpression();
						setState(649);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(651);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(652);
						match(LeftBracket);
						setState(654);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
							{
							setState(653);
							typeQualifierList();
							}
						}

						setState(656);
						match(Star);
						setState(657);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(658);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(659);
						match(LeftParen);
						setState(660);
						parameterTypeList();
						setState(661);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(663);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(664);
						match(LeftParen);
						setState(666);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(665);
							identifierList();
							}
						}

						setState(668);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VcSpecificModiferContext extends ParserRuleContext {
		public VcSpecificModiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vcSpecificModifer; }
	}

	public final VcSpecificModiferContext vcSpecificModifer() throws RecognitionException {
		VcSpecificModiferContext _localctx = new VcSpecificModiferContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_vcSpecificModifer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64000L) != 0)) ) {
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
	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(T__15);
				setState(677);
				match(LeftParen);
				setState(679); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(678);
					match(StringLiteral);
					}
					}
					setState(681); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(683);
				match(RightParen);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				gccAttributeSpecifier();
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
	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__16);
			setState(688);
			match(LeftParen);
			setState(689);
			match(LeftParen);
			setState(690);
			gccAttributeList();
			setState(691);
			match(RightParen);
			setState(692);
			match(RightParen);
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
	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 144115187941638143L) != 0)) {
				{
				setState(694);
				gccAttribute();
				}
			}

			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(697);
				match(Comma);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 144115187941638143L) != 0)) {
					{
					setState(698);
					gccAttribute();
					}
				}

				}
				}
				setState(705);
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
	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gccAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 536870915L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(707);
				match(LeftParen);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
					{
					setState(708);
					argumentExpressionList();
					}
				}

				setState(711);
				match(RightParen);
				}
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
	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 576460752303423485L) != 0)) {
				{
				setState(719);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case MultiLineMacro:
				case Directive:
				case AsmBlock:
				case Whitespace:
				case Newline:
				case BlockComment:
				case BlockCommentA:
				case BlockCommentNote:
				case LineComment:
					{
					setState(714);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(715);
					match(LeftParen);
					setState(716);
					nestedParenthesesBlock();
					setState(717);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(723);
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
	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(CParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CParser.Star, i);
		}
		public List<TerminalNode> Caret() { return getTokens(CParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CParser.Caret, i);
		}
		public List<TypeQualifierListContext> typeQualifierList() {
			return getRuleContexts(TypeQualifierListContext.class);
		}
		public TypeQualifierListContext typeQualifierList(int i) {
			return getRuleContext(TypeQualifierListContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(724);
				_la = _input.LA(1);
				if ( !(_la==Star || _la==Caret) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
					{
					setState(725);
					typeQualifierList();
					}
				}

				}
				}
				setState(730); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Star || _la==Caret );
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
	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(732);
				typeQualifier();
				}
				}
				setState(735); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0) );
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
	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			parameterList();
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(738);
				match(Comma);
				setState(739);
				match(Ellipsis);
				}
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			parameterDeclaration();
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					match(Comma);
					setState(744);
					parameterDeclaration();
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameterDeclaration);
		int _la;
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				declarationSpecifiers();
				setState(751);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				declarationSpecifiers2();
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8454149L) != 0)) {
					{
					setState(754);
					abstractDeclarator();
					}
				}

				}
				break;
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
	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(Identifier);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(760);
				match(Comma);
				setState(761);
				match(Identifier);
				}
				}
				setState(766);
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
	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			specifierQualifierList();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8454149L) != 0)) {
				{
				setState(768);
				abstractDeclarator();
				}
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
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_abstractDeclarator);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(772);
					pointer();
					}
				}

				setState(775);
				directAbstractDeclarator(0);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15 || _la==T__16) {
					{
					{
					setState(776);
					gccDeclaratorExtension();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(785);
				match(LeftParen);
				setState(786);
				abstractDeclarator();
				setState(787);
				match(RightParen);
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(788);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(793);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(794);
				match(LeftBracket);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
					{
					setState(795);
					typeQualifierList();
					}
				}

				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
					{
					setState(798);
					assignmentExpression();
					}
				}

				setState(801);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(802);
				match(LeftBracket);
				setState(803);
				match(Static);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
					{
					setState(804);
					typeQualifierList();
					}
				}

				setState(807);
				assignmentExpression();
				setState(808);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(810);
				match(LeftBracket);
				setState(811);
				typeQualifierList();
				setState(812);
				match(Static);
				setState(813);
				assignmentExpression();
				setState(814);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(816);
				match(LeftBracket);
				setState(817);
				match(Star);
				setState(818);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(819);
				match(LeftParen);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6386264861217519630L) != 0) || _la==Identifier) {
					{
					setState(820);
					parameterTypeList();
					}
				}

				setState(823);
				match(RightParen);
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(824);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(873);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(832);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(833);
						match(LeftBracket);
						setState(835);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
							{
							setState(834);
							typeQualifierList();
							}
						}

						setState(838);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
							{
							setState(837);
							assignmentExpression();
							}
						}

						setState(840);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(841);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(842);
						match(LeftBracket);
						setState(843);
						match(Static);
						setState(845);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76562293193703424L) != 0)) {
							{
							setState(844);
							typeQualifierList();
							}
						}

						setState(847);
						assignmentExpression();
						setState(848);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(850);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(851);
						match(LeftBracket);
						setState(852);
						typeQualifierList();
						setState(853);
						match(Static);
						setState(854);
						assignmentExpression();
						setState(855);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(857);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(858);
						match(LeftBracket);
						setState(859);
						match(Star);
						setState(860);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(861);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(862);
						match(LeftParen);
						setState(864);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6386264861217519630L) != 0) || _la==Identifier) {
							{
							setState(863);
							parameterTypeList();
							}
						}

						setState(866);
						match(RightParen);
						setState(870);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(867);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(872);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(Identifier);
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
	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_initializer);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case Sizeof:
			case Alignof:
			case Generic:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(LeftBrace);
				setState(882);
				initializerList();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(883);
					match(Comma);
					}
				}

				setState(886);
				match(RightBrace);
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
	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(890);
				designation();
				}
			}

			setState(893);
			initializer();
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(894);
					match(Comma);
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(895);
						designation();
						}
					}

					setState(898);
					initializer();
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			designatorList();
			setState(905);
			match(Assign);
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
	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(907);
				designator();
				}
				}
				setState(910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
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
	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_designator);
		try {
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				match(LeftBracket);
				setState(913);
				constantExpression();
				setState(914);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(Dot);
				setState(917);
				match(Identifier);
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
	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(CParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(StaticAssert);
			setState(921);
			match(LeftParen);
			setState(922);
			constantExpression();
			setState(923);
			match(Comma);
			setState(925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(924);
				match(StringLiteral);
				}
				}
				setState(927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(929);
			match(RightParen);
			setState(930);
			match(Semi);
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
	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode Volatile() { return getToken(CParser.Volatile, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(CParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(935);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(936);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(937);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(938);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(939);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(940);
				match(LeftParen);
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
					{
					setState(941);
					logicalOrExpression();
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(942);
						match(Comma);
						setState(943);
						logicalOrExpression();
						}
						}
						setState(948);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(951);
					match(Colon);
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
						{
						setState(952);
						logicalOrExpression();
						setState(957);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(953);
							match(Comma);
							setState(954);
							logicalOrExpression();
							}
							}
							setState(959);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(967);
				match(RightParen);
				setState(968);
				match(Semi);
				}
				break;
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
	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labeledStatement);
		try {
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(Identifier);
				setState(972);
				match(Colon);
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(973);
					statement();
					}
					break;
				}
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(Case);
				setState(977);
				constantExpression();
				setState(978);
				match(Colon);
				setState(979);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				match(Default);
				setState(982);
				match(Colon);
				setState(983);
				statement();
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(LeftBrace);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921505144305666L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531484180497L) != 0)) {
				{
				setState(987);
				blockItemList();
				}
			}

			setState(990);
			match(RightBrace);
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
	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(992);
				blockItem();
				}
				}
				setState(995); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921505144305666L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531484180497L) != 0) );
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
	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blockItem);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				declaration();
				}
				break;
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
				{
				setState(1001);
				expression();
				}
			}

			setState(1004);
			match(Semi);
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
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_selectionStatement);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				match(If);
				setState(1007);
				match(LeftParen);
				setState(1008);
				expression();
				setState(1009);
				match(RightParen);
				setState(1010);
				statement();
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1011);
					match(Else);
					setState(1012);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				match(Switch);
				setState(1016);
				match(LeftParen);
				setState(1017);
				expression();
				setState(1018);
				match(RightParen);
				setState(1019);
				statement();
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
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CParser.Do, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode For() { return getToken(CParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_iterationStatement);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				match(While);
				setState(1024);
				match(LeftParen);
				setState(1025);
				expression();
				setState(1026);
				match(RightParen);
				setState(1027);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(Do);
				setState(1030);
				statement();
				setState(1031);
				match(While);
				setState(1032);
				match(LeftParen);
				setState(1033);
				expression();
				setState(1034);
				match(RightParen);
				setState(1035);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				match(For);
				setState(1038);
				match(LeftParen);
				setState(1039);
				forCondition();
				setState(1040);
				match(RightParen);
				setState(1041);
				statement();
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
	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1045);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
					{
					setState(1046);
					expression();
					}
				}

				}
				break;
			}
			setState(1051);
			match(Semi);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
				{
				setState(1052);
				forExpression();
				}
			}

			setState(1055);
			match(Semi);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
				{
				setState(1056);
				forExpression();
				}
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
	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			declarationSpecifiers();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64000L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70368752631809L) != 0)) {
				{
				setState(1060);
				initDeclaratorList();
				}
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
	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			assignmentExpression();
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1064);
				match(Comma);
				setState(1065);
				assignmentExpression();
				}
				}
				setState(1070);
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
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode Goto() { return getToken(CParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Continue() { return getToken(CParser.Continue, 0); }
		public TerminalNode Break() { return getToken(CParser.Break, 0); }
		public TerminalNode Return() { return getToken(CParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1071);
				match(Goto);
				setState(1072);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1073);
				match(Continue);
				}
				break;
			case 3:
				{
				setState(1074);
				match(Break);
				}
				break;
			case 4:
				{
				setState(1075);
				match(Return);
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612507141508431886L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1055531215745025L) != 0)) {
					{
					setState(1076);
					expression();
					}
				}

				}
				break;
			case 5:
				{
				setState(1079);
				match(Goto);
				setState(1080);
				unaryExpression();
				}
				break;
			}
			setState(1083);
			match(Semi);
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
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1774578842790068238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70369021067265L) != 0)) {
				{
				setState(1085);
				translationUnit();
				}
			}

			setState(1088);
			match(EOF);
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
	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1090);
				externalDeclaration();
				}
				}
				setState(1093); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -1774578842790068238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70369021067265L) != 0) );
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
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_externalDeclaration);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(Semi);
				}
				break;
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1100);
				declarationSpecifiers();
				}
				break;
			}
			setState(1103);
			declarator();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1774578842790131726L) != 0) || _la==Identifier) {
				{
				setState(1104);
				declarationList();
				}
			}

			setState(1107);
			compoundStatement();
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
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1109);
				declaration();
				}
				}
				setState(1112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -1774578842790131726L) != 0) || _la==Identifier );
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
	public static class BlockCommentAContext extends ParserRuleContext {
		public TerminalNode BlockCommentA() { return getToken(CParser.BlockCommentA, 0); }
		public BlockCommentAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCommentA; }
	}

	public final BlockCommentAContext blockCommentA() throws RecognitionException {
		BlockCommentAContext _localctx = new BlockCommentAContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_blockCommentA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(BlockCommentA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 63:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001z\u045d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000\u00b6\b\u0000\u000b\u0000\f\u0000\u00b7\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u00c0\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u00d4\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u00e0\b\u0002\n\u0002\f\u0002\u00e3\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00e7\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00ee\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00f6\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00fa\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0102\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0109\b\u0004\n\u0004\f\u0004\u010c\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0111\b\u0005\n\u0005\f\u0005\u0114"+
		"\t\u0005\u0001\u0006\u0005\u0006\u0117\b\u0006\n\u0006\f\u0006\u011a\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0127\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u012c\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0135"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u013a\b\t\n\t\f\t\u013d\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0142\b\n\n\n\f\n\u0145\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u014a\b\u000b\n\u000b\f\u000b\u014d\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0152\b\f\n\f\f\f\u0155\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u015a\b\r\n\r\f\r\u015d\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0162\b\u000e\n\u000e\f\u000e\u0165\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u016a\b\u000f\n\u000f\f\u000f"+
		"\u016d\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0172\b"+
		"\u0010\n\u0010\f\u0010\u0175\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u017a\b\u0011\n\u0011\f\u0011\u017d\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0182\b\u0012\n\u0012\f\u0012\u0185\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u018d\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0195\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u019c\b\u0016\n\u0016"+
		"\f\u0016\u019f\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01a5\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01aa\b\u0018\u0001\u0019\u0004\u0019\u01ad\b\u0019\u000b\u0019\f\u0019"+
		"\u01ae\u0001\u001a\u0004\u001a\u01b2\b\u001a\u000b\u001a\f\u001a\u01b3"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01bb\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01c0\b"+
		"\u001c\n\u001c\f\u001c\u01c3\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01c8\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01e7\b\u001f\u0001 \u0001 \u0003 \u01eb\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01f4\b \u0001!\u0001"+
		"!\u0001\"\u0004\"\u01f9\b\"\u000b\"\f\"\u01fa\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u0205\b#\u0001$\u0001$\u0003$\u0209"+
		"\b$\u0001$\u0003$\u020c\b$\u0001%\u0001%\u0001%\u0005%\u0211\b%\n%\f%"+
		"\u0214\t%\u0001&\u0001&\u0003&\u0218\b&\u0001&\u0001&\u0003&\u021c\b&"+
		"\u0001\'\u0001\'\u0003\'\u0220\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u0225"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u022b\b\'\u0001(\u0001(\u0001"+
		"(\u0005(\u0230\b(\n(\f(\u0233\t(\u0001)\u0001)\u0001)\u0003)\u0238\b)"+
		"\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u024c"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0003.\u0252\b.\u0001.\u0001.\u0001/\u0003"+
		"/\u0257\b/\u0001/\u0001/\u0005/\u025b\b/\n/\f/\u025e\t/\u00010\u00010"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00030\u0271\b0\u00010\u00010\u0001"+
		"0\u00030\u0276\b0\u00010\u00030\u0279\b0\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u0280\b0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00030\u028f\b0\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u029b\b0\u0001"+
		"0\u00050\u029e\b0\n0\f0\u02a1\t0\u00011\u00011\u00012\u00012\u00012\u0004"+
		"2\u02a8\b2\u000b2\f2\u02a9\u00012\u00012\u00032\u02ae\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00014\u00034\u02b8\b4\u00014\u0001"+
		"4\u00034\u02bc\b4\u00054\u02be\b4\n4\f4\u02c1\t4\u00015\u00015\u00015"+
		"\u00035\u02c6\b5\u00015\u00035\u02c9\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00056\u02d0\b6\n6\f6\u02d3\t6\u00017\u00017\u00037\u02d7\b7\u00047"+
		"\u02d9\b7\u000b7\f7\u02da\u00018\u00048\u02de\b8\u000b8\f8\u02df\u0001"+
		"9\u00019\u00019\u00039\u02e5\b9\u0001:\u0001:\u0001:\u0005:\u02ea\b:\n"+
		":\f:\u02ed\t:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02f4\b;\u0003"+
		";\u02f6\b;\u0001<\u0001<\u0001<\u0005<\u02fb\b<\n<\f<\u02fe\t<\u0001="+
		"\u0001=\u0003=\u0302\b=\u0001>\u0001>\u0003>\u0306\b>\u0001>\u0001>\u0005"+
		">\u030a\b>\n>\f>\u030d\t>\u0003>\u030f\b>\u0001?\u0001?\u0001?\u0001?"+
		"\u0001?\u0005?\u0316\b?\n?\f?\u0319\t?\u0001?\u0001?\u0003?\u031d\b?\u0001"+
		"?\u0003?\u0320\b?\u0001?\u0001?\u0001?\u0001?\u0003?\u0326\b?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u0336\b?\u0001?\u0001?\u0005?\u033a\b?\n?\f?\u033d"+
		"\t?\u0003?\u033f\b?\u0001?\u0001?\u0001?\u0003?\u0344\b?\u0001?\u0003"+
		"?\u0347\b?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u034e\b?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0361\b?\u0001?\u0001?\u0005"+
		"?\u0365\b?\n?\f?\u0368\t?\u0005?\u036a\b?\n?\f?\u036d\t?\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0003A\u0375\bA\u0001A\u0001A\u0003A\u0379"+
		"\bA\u0001B\u0003B\u037c\bB\u0001B\u0001B\u0001B\u0003B\u0381\bB\u0001"+
		"B\u0005B\u0384\bB\nB\fB\u0387\tB\u0001C\u0001C\u0001C\u0001D\u0004D\u038d"+
		"\bD\u000bD\fD\u038e\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0397"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0004F\u039e\bF\u000bF\fF\u039f"+
		"\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u03b1\bG\nG\fG\u03b4\tG\u0003"+
		"G\u03b6\bG\u0001G\u0001G\u0001G\u0001G\u0005G\u03bc\bG\nG\fG\u03bf\tG"+
		"\u0003G\u03c1\bG\u0005G\u03c3\bG\nG\fG\u03c6\tG\u0001G\u0001G\u0003G\u03ca"+
		"\bG\u0001H\u0001H\u0001H\u0003H\u03cf\bH\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u03d9\bH\u0001I\u0001I\u0003I\u03dd\bI\u0001"+
		"I\u0001I\u0001J\u0004J\u03e2\bJ\u000bJ\fJ\u03e3\u0001K\u0001K\u0003K\u03e8"+
		"\bK\u0001L\u0003L\u03eb\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0003M\u03f6\bM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0003M\u03fe\bM\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u0414\bN\u0001O\u0001O\u0003O\u0418\bO\u0003O\u041a"+
		"\bO\u0001O\u0001O\u0003O\u041e\bO\u0001O\u0001O\u0003O\u0422\bO\u0001"+
		"P\u0001P\u0003P\u0426\bP\u0001Q\u0001Q\u0001Q\u0005Q\u042b\bQ\nQ\fQ\u042e"+
		"\tQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0436\bR\u0001R\u0001"+
		"R\u0003R\u043a\bR\u0001R\u0001R\u0001S\u0003S\u043f\bS\u0001S\u0001S\u0001"+
		"T\u0004T\u0444\bT\u000bT\fT\u0445\u0001U\u0001U\u0001U\u0003U\u044b\b"+
		"U\u0001V\u0003V\u044e\bV\u0001V\u0001V\u0003V\u0452\bV\u0001V\u0001V\u0001"+
		"W\u0004W\u0457\bW\u000bW\fW\u0458\u0001X\u0001X\u0001X\u0000\u0002`~Y"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u0000"+
		"\u0014\u0001\u0000kl\u0003\u0000,,MMOO\u0002\u0000,,77\u0005\u0000LLN"+
		"NPPSSXY\u0001\u0000PR\u0002\u0000LLNN\u0001\u0000JK\u0001\u0000FI\u0001"+
		"\u0000ij\u0001\u0000^h\u0006\u0000\u0014\u0014\u001f\u001f\'\'--00??\u0001"+
		"\u0000\u0004\u0006\u0002\u0000..11\u0004\u0000\u0018\u0018((4488\u0002"+
		"\u0000\t\t\u000b\u000f\u0002\u0000@A]]\u0001\u0000@A\u0002\u0000PPWW\u0002"+
		"\u0000\u0010\u0010\u0012\u0012\u0002\u0000\u0013\u001344\u04ca\u0000\u00d3"+
		"\u0001\u0000\u0000\u0000\u0002\u00d5\u0001\u0000\u0000\u0000\u0004\u00dc"+
		"\u0001\u0000\u0000\u0000\u0006\u00e6\u0001\u0000\u0000\u0000\b\u00f9\u0001"+
		"\u0000\u0000\u0000\n\u010d\u0001\u0000\u0000\u0000\f\u0118\u0001\u0000"+
		"\u0000\u0000\u000e\u0128\u0001\u0000\u0000\u0000\u0010\u0134\u0001\u0000"+
		"\u0000\u0000\u0012\u0136\u0001\u0000\u0000\u0000\u0014\u013e\u0001\u0000"+
		"\u0000\u0000\u0016\u0146\u0001\u0000\u0000\u0000\u0018\u014e\u0001\u0000"+
		"\u0000\u0000\u001a\u0156\u0001\u0000\u0000\u0000\u001c\u015e\u0001\u0000"+
		"\u0000\u0000\u001e\u0166\u0001\u0000\u0000\u0000 \u016e\u0001\u0000\u0000"+
		"\u0000\"\u0176\u0001\u0000\u0000\u0000$\u017e\u0001\u0000\u0000\u0000"+
		"&\u0186\u0001\u0000\u0000\u0000(\u0194\u0001\u0000\u0000\u0000*\u0196"+
		"\u0001\u0000\u0000\u0000,\u0198\u0001\u0000\u0000\u0000.\u01a0\u0001\u0000"+
		"\u0000\u00000\u01a9\u0001\u0000\u0000\u00002\u01ac\u0001\u0000\u0000\u0000"+
		"4\u01b1\u0001\u0000\u0000\u00006\u01ba\u0001\u0000\u0000\u00008\u01bc"+
		"\u0001\u0000\u0000\u0000:\u01c4\u0001\u0000\u0000\u0000<\u01c9\u0001\u0000"+
		"\u0000\u0000>\u01e6\u0001\u0000\u0000\u0000@\u01f3\u0001\u0000\u0000\u0000"+
		"B\u01f5\u0001\u0000\u0000\u0000D\u01f8\u0001\u0000\u0000\u0000F\u0204"+
		"\u0001\u0000\u0000\u0000H\u0208\u0001\u0000\u0000\u0000J\u020d\u0001\u0000"+
		"\u0000\u0000L\u021b\u0001\u0000\u0000\u0000N\u022a\u0001\u0000\u0000\u0000"+
		"P\u022c\u0001\u0000\u0000\u0000R\u0234\u0001\u0000\u0000\u0000T\u0239"+
		"\u0001\u0000\u0000\u0000V\u023b\u0001\u0000\u0000\u0000X\u0240\u0001\u0000"+
		"\u0000\u0000Z\u024b\u0001\u0000\u0000\u0000\\\u024d\u0001\u0000\u0000"+
		"\u0000^\u0256\u0001\u0000\u0000\u0000`\u0270\u0001\u0000\u0000\u0000b"+
		"\u02a2\u0001\u0000\u0000\u0000d\u02ad\u0001\u0000\u0000\u0000f\u02af\u0001"+
		"\u0000\u0000\u0000h\u02b7\u0001\u0000\u0000\u0000j\u02c2\u0001\u0000\u0000"+
		"\u0000l\u02d1\u0001\u0000\u0000\u0000n\u02d8\u0001\u0000\u0000\u0000p"+
		"\u02dd\u0001\u0000\u0000\u0000r\u02e1\u0001\u0000\u0000\u0000t\u02e6\u0001"+
		"\u0000\u0000\u0000v\u02f5\u0001\u0000\u0000\u0000x\u02f7\u0001\u0000\u0000"+
		"\u0000z\u02ff\u0001\u0000\u0000\u0000|\u030e\u0001\u0000\u0000\u0000~"+
		"\u033e\u0001\u0000\u0000\u0000\u0080\u036e\u0001\u0000\u0000\u0000\u0082"+
		"\u0378\u0001\u0000\u0000\u0000\u0084\u037b\u0001\u0000\u0000\u0000\u0086"+
		"\u0388\u0001\u0000\u0000\u0000\u0088\u038c\u0001\u0000\u0000\u0000\u008a"+
		"\u0396\u0001\u0000\u0000\u0000\u008c\u0398\u0001\u0000\u0000\u0000\u008e"+
		"\u03c9\u0001\u0000\u0000\u0000\u0090\u03d8\u0001\u0000\u0000\u0000\u0092"+
		"\u03da\u0001\u0000\u0000\u0000\u0094\u03e1\u0001\u0000\u0000\u0000\u0096"+
		"\u03e7\u0001\u0000\u0000\u0000\u0098\u03ea\u0001\u0000\u0000\u0000\u009a"+
		"\u03fd\u0001\u0000\u0000\u0000\u009c\u0413\u0001\u0000\u0000\u0000\u009e"+
		"\u0419\u0001\u0000\u0000\u0000\u00a0\u0423\u0001\u0000\u0000\u0000\u00a2"+
		"\u0427\u0001\u0000\u0000\u0000\u00a4\u0439\u0001\u0000\u0000\u0000\u00a6"+
		"\u043e\u0001\u0000\u0000\u0000\u00a8\u0443\u0001\u0000\u0000\u0000\u00aa"+
		"\u044a\u0001\u0000\u0000\u0000\u00ac\u044d\u0001\u0000\u0000\u0000\u00ae"+
		"\u0456\u0001\u0000\u0000\u0000\u00b0\u045a\u0001\u0000\u0000\u0000\u00b2"+
		"\u00d4\u0005n\u0000\u0000\u00b3\u00d4\u0005o\u0000\u0000\u00b4\u00b6\u0005"+
		"q\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00d4\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005@\u0000"+
		"\u0000\u00ba\u00bb\u0003,\u0016\u0000\u00bb\u00bc\u0005A\u0000\u0000\u00bc"+
		"\u00d4\u0001\u0000\u0000\u0000\u00bd\u00d4\u0003\u0002\u0001\u0000\u00be"+
		"\u00c0\u0005\u0001\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005@\u0000\u0000\u00c2\u00c3\u0003\u0092I\u0000\u00c3\u00c4\u0005"+
		"A\u0000\u0000\u00c4\u00d4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0002"+
		"\u0000\u0000\u00c6\u00c7\u0005@\u0000\u0000\u00c7\u00c8\u0003\f\u0006"+
		"\u0000\u00c8\u00c9\u0005]\u0000\u0000\u00c9\u00ca\u0003z=\u0000\u00ca"+
		"\u00cb\u0005A\u0000\u0000\u00cb\u00d4\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0003\u0000\u0000\u00cd\u00ce\u0005@\u0000\u0000\u00ce\u00cf\u0003"+
		"z=\u0000\u00cf\u00d0\u0005]\u0000\u0000\u00d0\u00d1\u0003\f\u0006\u0000"+
		"\u00d1\u00d2\u0005A\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00d3\u00b3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00b5\u0001\u0000\u0000\u0000\u00d3\u00b9\u0001\u0000\u0000\u0000\u00d3"+
		"\u00bd\u0001\u0000\u0000\u0000\u00d3\u00bf\u0001\u0000\u0000\u0000\u00d3"+
		"\u00c5\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000\u00d4"+
		"\u0001\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005;\u0000\u0000\u00d6\u00d7"+
		"\u0005@\u0000\u0000\u00d7\u00d8\u0003(\u0014\u0000\u00d8\u00d9\u0005]"+
		"\u0000\u0000\u00d9\u00da\u0003\u0004\u0002\u0000\u00da\u00db\u0005A\u0000"+
		"\u0000\u00db\u0003\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003\u0006\u0003"+
		"\u0000\u00dd\u00de\u0005]\u0000\u0000\u00de\u00e0\u0003\u0006\u0003\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u0005\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0003z=\u0000\u00e5\u00e7\u0005\u001a\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005[\u0000\u0000\u00e9\u00ea\u0003"+
		"(\u0014\u0000\u00ea\u0007\u0001\u0000\u0000\u0000\u00eb\u00fa\u0003\u0000"+
		"\u0000\u0000\u00ec\u00ee\u0005\u0001\u0000\u0000\u00ed\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0005@\u0000\u0000\u00f0\u00f1\u0003z=\u0000"+
		"\u00f1\u00f2\u0005A\u0000\u0000\u00f2\u00f3\u0005D\u0000\u0000\u00f3\u00f5"+
		"\u0003\u0084B\u0000\u00f4\u00f6\u0005]\u0000\u0000\u00f5\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005E\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00eb\u0001\u0000\u0000\u0000\u00f9\u00ed\u0001\u0000\u0000"+
		"\u0000\u00fa\u010a\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005B\u0000\u0000"+
		"\u00fc\u00fd\u0003,\u0016\u0000\u00fd\u00fe\u0005C\u0000\u0000\u00fe\u0109"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0005@\u0000\u0000\u0100\u0102\u0003"+
		"\n\u0005\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0109\u0005A\u0000"+
		"\u0000\u0104\u0105\u0007\u0000\u0000\u0000\u0105\u0109\u0005n\u0000\u0000"+
		"\u0106\u0109\u0005M\u0000\u0000\u0107\u0109\u0005O\u0000\u0000\u0108\u00fb"+
		"\u0001\u0000\u0000\u0000\u0108\u00ff\u0001\u0000\u0000\u0000\u0108\u0104"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\t\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0112\u0003"+
		"(\u0014\u0000\u010e\u010f\u0005]\u0000\u0000\u010f\u0111\u0003(\u0014"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u000b\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0007\u0001\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0126\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u0127\u0003\b\u0004\u0000"+
		"\u011c\u011d\u0003\u000e\u0007\u0000\u011d\u011e\u0003\u0010\b\u0000\u011e"+
		"\u0127\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0002\u0000\u0000\u0120"+
		"\u0121\u0005@\u0000\u0000\u0121\u0122\u0003z=\u0000\u0122\u0123\u0005"+
		"A\u0000\u0000\u0123\u0127\u0001\u0000\u0000\u0000\u0124\u0125\u0005U\u0000"+
		"\u0000\u0125\u0127\u0005n\u0000\u0000\u0126\u011b\u0001\u0000\u0000\u0000"+
		"\u0126\u011c\u0001\u0000\u0000\u0000\u0126\u011f\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\r\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0007\u0003\u0000\u0000\u0129\u000f\u0001\u0000\u0000\u0000\u012a"+
		"\u012c\u0005\u0001\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005@\u0000\u0000\u012e\u012f\u0003z=\u0000\u012f\u0130\u0005"+
		"A\u0000\u0000\u0130\u0131\u0003\u0010\b\u0000\u0131\u0135\u0001\u0000"+
		"\u0000\u0000\u0132\u0135\u0003\f\u0006\u0000\u0133\u0135\u0005p\u0000"+
		"\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0011\u0001\u0000\u0000"+
		"\u0000\u0136\u013b\u0003\u0010\b\u0000\u0137\u0138\u0007\u0004\u0000\u0000"+
		"\u0138\u013a\u0003\u0010\b\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a"+
		"\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u0013\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u0143\u0003\u0012\t\u0000\u013f\u0140"+
		"\u0007\u0005\u0000\u0000\u0140\u0142\u0003\u0012\t\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0015\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u014b\u0003"+
		"\u0014\n\u0000\u0147\u0148\u0007\u0006\u0000\u0000\u0148\u014a\u0003\u0014"+
		"\n\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u0017\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000"+
		"\u0000\u014e\u0153\u0003\u0016\u000b\u0000\u014f\u0150\u0007\u0007\u0000"+
		"\u0000\u0150\u0152\u0003\u0016\u000b\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0019\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015b\u0003\u0018\f\u0000"+
		"\u0157\u0158\u0007\b\u0000\u0000\u0158\u015a\u0003\u0018\f\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u001b\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e"+
		"\u0163\u0003\u001a\r\u0000\u015f\u0160\u0005S\u0000\u0000\u0160\u0162"+
		"\u0003\u001a\r\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u001d\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0166\u016b\u0003\u001c\u000e\u0000\u0167\u0168\u0005"+
		"W\u0000\u0000\u0168\u016a\u0003\u001c\u000e\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u001f\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0173\u0003\u001e"+
		"\u000f\u0000\u016f\u0170\u0005T\u0000\u0000\u0170\u0172\u0003\u001e\u000f"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174!\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0176\u017b\u0003 \u0010\u0000\u0177\u0178\u0005U\u0000\u0000\u0178\u017a"+
		"\u0003 \u0010\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c#\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017e\u0183\u0003\"\u0011\u0000\u017f\u0180\u0005V\u0000"+
		"\u0000\u0180\u0182\u0003\"\u0011\u0000\u0181\u017f\u0001\u0000\u0000\u0000"+
		"\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184%\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u018c\u0003$\u0012\u0000\u0187\u0188"+
		"\u0005Z\u0000\u0000\u0188\u0189\u0003,\u0016\u0000\u0189\u018a\u0005["+
		"\u0000\u0000\u018a\u018b\u0003&\u0013\u0000\u018b\u018d\u0001\u0000\u0000"+
		"\u0000\u018c\u0187\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\'\u0001\u0000\u0000\u0000\u018e\u0195\u0003&\u0013\u0000"+
		"\u018f\u0190\u0003\f\u0006\u0000\u0190\u0191\u0003*\u0015\u0000\u0191"+
		"\u0192\u0003(\u0014\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0195"+
		"\u0005p\u0000\u0000\u0194\u018e\u0001\u0000\u0000\u0000\u0194\u018f\u0001"+
		"\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195)\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0007\t\u0000\u0000\u0197+\u0001\u0000\u0000"+
		"\u0000\u0198\u019d\u0003(\u0014\u0000\u0199\u019a\u0005]\u0000\u0000\u019a"+
		"\u019c\u0003(\u0014\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e-\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0003&\u0013\u0000\u01a1/\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a4\u00032\u0019\u0000\u01a3\u01a5\u00038\u001c\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\\\u0000\u0000\u01a7\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003\u008cF\u0000\u01a9\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa1\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u00036\u001b\u0000\u01ac\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af3\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u00036\u001b\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b45\u0001\u0000\u0000\u0000\u01b5\u01bb"+
		"\u0003<\u001e\u0000\u01b6\u01bb\u0003>\u001f\u0000\u01b7\u01bb\u0003X"+
		",\u0000\u01b8\u01bb\u0003Z-\u0000\u01b9\u01bb\u0003\\.\u0000\u01ba\u01b5"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b6\u0001\u0000\u0000\u0000\u01ba\u01b7"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb7\u0001\u0000\u0000\u0000\u01bc\u01c1\u0003"+
		":\u001d\u0000\u01bd\u01be\u0005]\u0000\u0000\u01be\u01c0\u0003:\u001d"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c29\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c7\u0003^/\u0000\u01c5\u01c6\u0005^\u0000\u0000\u01c6\u01c8"+
		"\u0003\u0082A\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8;\u0001\u0000\u0000\u0000\u01c9\u01ca\u0007\n"+
		"\u0000\u0000\u01ca=\u0001\u0000\u0000\u0000\u01cb\u01e7\u00053\u0000\u0000"+
		"\u01cc\u01e7\u0005\u0017\u0000\u0000\u01cd\u01e7\u0005*\u0000\u0000\u01ce"+
		"\u01e7\u0005%\u0000\u0000\u01cf\u01e7\u0005&\u0000\u0000\u01d0\u01e7\u0005"+
		" \u0000\u0000\u01d1\u01e7\u0005\u001c\u0000\u0000\u01d2\u01e7\u0005+\u0000"+
		"\u0000\u01d3\u01e7\u00052\u0000\u0000\u01d4\u01e7\u00059\u0000\u0000\u01d5"+
		"\u01e7\u0005:\u0000\u0000\u01d6\u01e7\u0005\u0004\u0000\u0000\u01d7\u01e7"+
		"\u0005\u0005\u0000\u0000\u01d8\u01e7\u0005\u0006\u0000\u0000\u01d9\u01da"+
		"\u0005\u0001\u0000\u0000\u01da\u01db\u0005@\u0000\u0000\u01db\u01dc\u0007"+
		"\u000b\u0000\u0000\u01dc\u01e7\u0005A\u0000\u0000\u01dd\u01e7\u0003V+"+
		"\u0000\u01de\u01e7\u0003@ \u0000\u01df\u01e7\u0003N\'\u0000\u01e0\u01e7"+
		"\u0003\u0080@\u0000\u01e1\u01e2\u0005\u0007\u0000\u0000\u01e2\u01e3\u0005"+
		"@\u0000\u0000\u01e3\u01e4\u0003.\u0017\u0000\u01e4\u01e5\u0005A\u0000"+
		"\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01cb\u0001\u0000\u0000"+
		"\u0000\u01e6\u01cc\u0001\u0000\u0000\u0000\u01e6\u01cd\u0001\u0000\u0000"+
		"\u0000\u01e6\u01ce\u0001\u0000\u0000\u0000\u01e6\u01cf\u0001\u0000\u0000"+
		"\u0000\u01e6\u01d0\u0001\u0000\u0000\u0000\u01e6\u01d1\u0001\u0000\u0000"+
		"\u0000\u01e6\u01d2\u0001\u0000\u0000\u0000\u01e6\u01d3\u0001\u0000\u0000"+
		"\u0000\u01e6\u01d4\u0001\u0000\u0000\u0000\u01e6\u01d5\u0001\u0000\u0000"+
		"\u0000\u01e6\u01d6\u0001\u0000\u0000\u0000\u01e6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01e6\u01d8\u0001\u0000\u0000\u0000\u01e6\u01d9\u0001\u0000\u0000"+
		"\u0000\u01e6\u01dd\u0001\u0000\u0000\u0000\u01e6\u01de\u0001\u0000\u0000"+
		"\u0000\u01e6\u01df\u0001\u0000\u0000\u0000\u01e6\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e1\u0001\u0000\u0000\u0000\u01e7?\u0001\u0000\u0000\u0000"+
		"\u01e8\u01ea\u0003B!\u0000\u01e9\u01eb\u0005n\u0000\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005D\u0000\u0000\u01ed\u01ee\u0003"+
		"D\"\u0000\u01ee\u01ef\u0005E\u0000\u0000\u01ef\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0003B!\u0000\u01f1\u01f2\u0005n\u0000\u0000\u01f2"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f3\u01e8\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f4A\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0007\f\u0000\u0000\u01f6C\u0001\u0000\u0000\u0000\u01f7\u01f9\u0003"+
		"F#\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fbE\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003H$\u0000\u01fd"+
		"\u01fe\u0003J%\u0000\u01fe\u01ff\u0005\\\u0000\u0000\u01ff\u0205\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0003H$\u0000\u0201\u0202\u0005\\\u0000"+
		"\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0205\u0003\u008cF\u0000"+
		"\u0204\u01fc\u0001\u0000\u0000\u0000\u0204\u0200\u0001\u0000\u0000\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0205G\u0001\u0000\u0000\u0000\u0206"+
		"\u0209\u0003>\u001f\u0000\u0207\u0209\u0003X,\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020b\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0003H$\u0000\u020b\u020a\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020cI\u0001\u0000\u0000\u0000"+
		"\u020d\u0212\u0003L&\u0000\u020e\u020f\u0005]\u0000\u0000\u020f\u0211"+
		"\u0003L&\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0214\u0001\u0000"+
		"\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000"+
		"\u0000\u0000\u0213K\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000"+
		"\u0000\u0215\u021c\u0003^/\u0000\u0216\u0218\u0003^/\u0000\u0217\u0216"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0005[\u0000\u0000\u021a\u021c\u0003"+
		".\u0017\u0000\u021b\u0215\u0001\u0000\u0000\u0000\u021b\u0217\u0001\u0000"+
		"\u0000\u0000\u021cM\u0001\u0000\u0000\u0000\u021d\u021f\u0005\u001e\u0000"+
		"\u0000\u021e\u0220\u0005n\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005D\u0000\u0000\u0222\u0224\u0003P(\u0000\u0223\u0225"+
		"\u0005]\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224\u0225\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0005"+
		"E\u0000\u0000\u0227\u022b\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u001e"+
		"\u0000\u0000\u0229\u022b\u0005n\u0000\u0000\u022a\u021d\u0001\u0000\u0000"+
		"\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022bO\u0001\u0000\u0000\u0000"+
		"\u022c\u0231\u0003R)\u0000\u022d\u022e\u0005]\u0000\u0000\u022e\u0230"+
		"\u0003R)\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000"+
		"\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000"+
		"\u0000\u0000\u0232Q\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000"+
		"\u0000\u0234\u0237\u0003T*\u0000\u0235\u0236\u0005^\u0000\u0000\u0236"+
		"\u0238\u0003.\u0017\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238S\u0001\u0000\u0000\u0000\u0239\u023a\u0005"+
		"n\u0000\u0000\u023aU\u0001\u0000\u0000\u0000\u023b\u023c\u00058\u0000"+
		"\u0000\u023c\u023d\u0005@\u0000\u0000\u023d\u023e\u0003z=\u0000\u023e"+
		"\u023f\u0005A\u0000\u0000\u023fW\u0001\u0000\u0000\u0000\u0240\u0241\u0007"+
		"\r\u0000\u0000\u0241Y\u0001\u0000\u0000\u0000\u0242\u024c\u0005$\u0000"+
		"\u0000\u0243\u024c\u0005=\u0000\u0000\u0244\u024c\u0005\b\u0000\u0000"+
		"\u0245\u024c\u0005\t\u0000\u0000\u0246\u024c\u0003f3\u0000\u0247\u0248"+
		"\u0005\n\u0000\u0000\u0248\u0249\u0005@\u0000\u0000\u0249\u024a\u0005"+
		"n\u0000\u0000\u024a\u024c\u0005A\u0000\u0000\u024b\u0242\u0001\u0000\u0000"+
		"\u0000\u024b\u0243\u0001\u0000\u0000\u0000\u024b\u0244\u0001\u0000\u0000"+
		"\u0000\u024b\u0245\u0001\u0000\u0000\u0000\u024b\u0246\u0001\u0000\u0000"+
		"\u0000\u024b\u0247\u0001\u0000\u0000\u0000\u024c[\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u00056\u0000\u0000\u024e\u0251\u0005@\u0000\u0000\u024f\u0252"+
		"\u0003z=\u0000\u0250\u0252\u0003.\u0017\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0005A\u0000\u0000\u0254]\u0001\u0000\u0000\u0000"+
		"\u0255\u0257\u0003n7\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025c"+
		"\u0003`0\u0000\u0259\u025b\u0003d2\u0000\u025a\u0259\u0001\u0000\u0000"+
		"\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d_\u0001\u0000\u0000\u0000"+
		"\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0260\u00060\uffff\uffff\u0000"+
		"\u0260\u0271\u0005n\u0000\u0000\u0261\u0262\u0005@\u0000\u0000\u0262\u0263"+
		"\u0003^/\u0000\u0263\u0264\u0005A\u0000\u0000\u0264\u0271\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0005n\u0000\u0000\u0266\u0267\u0005[\u0000\u0000"+
		"\u0267\u0271\u0005p\u0000\u0000\u0268\u0269\u0003b1\u0000\u0269\u026a"+
		"\u0005n\u0000\u0000\u026a\u0271\u0001\u0000\u0000\u0000\u026b\u026c\u0005"+
		"@\u0000\u0000\u026c\u026d\u0003b1\u0000\u026d\u026e\u0003^/\u0000\u026e"+
		"\u026f\u0005A\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u025f"+
		"\u0001\u0000\u0000\u0000\u0270\u0261\u0001\u0000\u0000\u0000\u0270\u0265"+
		"\u0001\u0000\u0000\u0000\u0270\u0268\u0001\u0000\u0000\u0000\u0270\u026b"+
		"\u0001\u0000\u0000\u0000\u0271\u029f\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\n\t\u0000\u0000\u0273\u0275\u0005B\u0000\u0000\u0274\u0276\u0003p8\u0000"+
		"\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0278\u0001\u0000\u0000\u0000\u0277\u0279\u0003(\u0014\u0000\u0278"+
		"\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027a\u029e\u0005C\u0000\u0000\u027b\u027c"+
		"\n\b\u0000\u0000\u027c\u027d\u0005B\u0000\u0000\u027d\u027f\u0005-\u0000"+
		"\u0000\u027e\u0280\u0003p8\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0003(\u0014\u0000\u0282\u0283\u0005C\u0000\u0000\u0283\u029e\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\n\u0007\u0000\u0000\u0285\u0286\u0005B"+
		"\u0000\u0000\u0286\u0287\u0003p8\u0000\u0287\u0288\u0005-\u0000\u0000"+
		"\u0288\u0289\u0003(\u0014\u0000\u0289\u028a\u0005C\u0000\u0000\u028a\u029e"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\n\u0006\u0000\u0000\u028c\u028e\u0005"+
		"B\u0000\u0000\u028d\u028f\u0003p8\u0000\u028e\u028d\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0005P\u0000\u0000\u0291\u029e\u0005C\u0000\u0000\u0292"+
		"\u0293\n\u0005\u0000\u0000\u0293\u0294\u0005@\u0000\u0000\u0294\u0295"+
		"\u0003r9\u0000\u0295\u0296\u0005A\u0000\u0000\u0296\u029e\u0001\u0000"+
		"\u0000\u0000\u0297\u0298\n\u0004\u0000\u0000\u0298\u029a\u0005@\u0000"+
		"\u0000\u0299\u029b\u0003x<\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a"+
		"\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c"+
		"\u029e\u0005A\u0000\u0000\u029d\u0272\u0001\u0000\u0000\u0000\u029d\u027b"+
		"\u0001\u0000\u0000\u0000\u029d\u0284\u0001\u0000\u0000\u0000\u029d\u028b"+
		"\u0001\u0000\u0000\u0000\u029d\u0292\u0001\u0000\u0000\u0000\u029d\u0297"+
		"\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0a\u0001"+
		"\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a3\u0007"+
		"\u000e\u0000\u0000\u02a3c\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005\u0010"+
		"\u0000\u0000\u02a5\u02a7\u0005@\u0000\u0000\u02a6\u02a8\u0005q\u0000\u0000"+
		"\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000"+
		"\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ae\u0005A\u0000\u0000\u02ac"+
		"\u02ae\u0003f3\u0000\u02ad\u02a4\u0001\u0000\u0000\u0000\u02ad\u02ac\u0001"+
		"\u0000\u0000\u0000\u02aee\u0001\u0000\u0000\u0000\u02af\u02b0\u0005\u0011"+
		"\u0000\u0000\u02b0\u02b1\u0005@\u0000\u0000\u02b1\u02b2\u0005@\u0000\u0000"+
		"\u02b2\u02b3\u0003h4\u0000\u02b3\u02b4\u0005A\u0000\u0000\u02b4\u02b5"+
		"\u0005A\u0000\u0000\u02b5g\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003j"+
		"5\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b8\u02bf\u0001\u0000\u0000\u0000\u02b9\u02bb\u0005]\u0000\u0000"+
		"\u02ba\u02bc\u0003j5\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02b9"+
		"\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0i\u0001"+
		"\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c8\b\u000f"+
		"\u0000\u0000\u02c3\u02c5\u0005@\u0000\u0000\u02c4\u02c6\u0003\n\u0005"+
		"\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c9\u0005A\u0000\u0000"+
		"\u02c8\u02c3\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000"+
		"\u02c9k\u0001\u0000\u0000\u0000\u02ca\u02d0\b\u0010\u0000\u0000\u02cb"+
		"\u02cc\u0005@\u0000\u0000\u02cc\u02cd\u0003l6\u0000\u02cd\u02ce\u0005"+
		"A\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02ca\u0001\u0000"+
		"\u0000\u0000\u02cf\u02cb\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d2m\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d6\u0007\u0011\u0000\u0000\u02d5\u02d7\u0003p8\u0000\u02d6"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d9\u0001\u0000\u0000\u0000\u02d8\u02d4\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u0001\u0000\u0000\u0000\u02dbo\u0001\u0000\u0000\u0000\u02dc\u02de"+
		"\u0003X,\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
		"\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e0q\u0001\u0000\u0000\u0000\u02e1\u02e4\u0003t:\u0000"+
		"\u02e2\u02e3\u0005]\u0000\u0000\u02e3\u02e5\u0005m\u0000\u0000\u02e4\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5s\u0001"+
		"\u0000\u0000\u0000\u02e6\u02eb\u0003v;\u0000\u02e7\u02e8\u0005]\u0000"+
		"\u0000\u02e8\u02ea\u0003v;\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ecu\u0001\u0000\u0000\u0000\u02ed\u02eb"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ef\u00032\u0019\u0000\u02ef\u02f0\u0003"+
		"^/\u0000\u02f0\u02f6\u0001\u0000\u0000\u0000\u02f1\u02f3\u00034\u001a"+
		"\u0000\u02f2\u02f4\u0003|>\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f6\u0001\u0000\u0000\u0000\u02f5"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f5\u02f1\u0001\u0000\u0000\u0000\u02f6"+
		"w\u0001\u0000\u0000\u0000\u02f7\u02fc\u0005n\u0000\u0000\u02f8\u02f9\u0005"+
		"]\u0000\u0000\u02f9\u02fb\u0005n\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fdy\u0001\u0000\u0000\u0000"+
		"\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0301\u0003H$\u0000\u0300\u0302"+
		"\u0003|>\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000"+
		"\u0000\u0000\u0302{\u0001\u0000\u0000\u0000\u0303\u030f\u0003n7\u0000"+
		"\u0304\u0306\u0003n7\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u030b"+
		"\u0003~?\u0000\u0308\u030a\u0003d2\u0000\u0309\u0308\u0001\u0000\u0000"+
		"\u0000\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000"+
		"\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030e\u0303\u0001\u0000\u0000"+
		"\u0000\u030e\u0305\u0001\u0000\u0000\u0000\u030f}\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0006?\uffff\uffff\u0000\u0311\u0312\u0005@\u0000\u0000\u0312"+
		"\u0313\u0003|>\u0000\u0313\u0317\u0005A\u0000\u0000\u0314\u0316\u0003"+
		"d2\u0000\u0315\u0314\u0001\u0000\u0000\u0000\u0316\u0319\u0001\u0000\u0000"+
		"\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000"+
		"\u0000\u0318\u033f\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000"+
		"\u0000\u031a\u031c\u0005B\u0000\u0000\u031b\u031d\u0003p8\u0000\u031c"+
		"\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d"+
		"\u031f\u0001\u0000\u0000\u0000\u031e\u0320\u0003(\u0014\u0000\u031f\u031e"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0001\u0000\u0000\u0000\u0321\u033f\u0005C\u0000\u0000\u0322\u0323\u0005"+
		"B\u0000\u0000\u0323\u0325\u0005-\u0000\u0000\u0324\u0326\u0003p8\u0000"+
		"\u0325\u0324\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0003(\u0014\u0000\u0328"+
		"\u0329\u0005C\u0000\u0000\u0329\u033f\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0005B\u0000\u0000\u032b\u032c\u0003p8\u0000\u032c\u032d\u0005-\u0000"+
		"\u0000\u032d\u032e\u0003(\u0014\u0000\u032e\u032f\u0005C\u0000\u0000\u032f"+
		"\u033f\u0001\u0000\u0000\u0000\u0330\u0331\u0005B\u0000\u0000\u0331\u0332"+
		"\u0005P\u0000\u0000\u0332\u033f\u0005C\u0000\u0000\u0333\u0335\u0005@"+
		"\u0000\u0000\u0334\u0336\u0003r9\u0000\u0335\u0334\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000"+
		"\u0337\u033b\u0005A\u0000\u0000\u0338\u033a\u0003d2\u0000\u0339\u0338"+
		"\u0001\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000\u0000\u033b\u0339"+
		"\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033f"+
		"\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033e\u0310"+
		"\u0001\u0000\u0000\u0000\u033e\u031a\u0001\u0000\u0000\u0000\u033e\u0322"+
		"\u0001\u0000\u0000\u0000\u033e\u032a\u0001\u0000\u0000\u0000\u033e\u0330"+
		"\u0001\u0000\u0000\u0000\u033e\u0333\u0001\u0000\u0000\u0000\u033f\u036b"+
		"\u0001\u0000\u0000\u0000\u0340\u0341\n\u0005\u0000\u0000\u0341\u0343\u0005"+
		"B\u0000\u0000\u0342\u0344\u0003p8\u0000\u0343\u0342\u0001\u0000\u0000"+
		"\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0346\u0001\u0000\u0000"+
		"\u0000\u0345\u0347\u0003(\u0014\u0000\u0346\u0345\u0001\u0000\u0000\u0000"+
		"\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000"+
		"\u0348\u036a\u0005C\u0000\u0000\u0349\u034a\n\u0004\u0000\u0000\u034a"+
		"\u034b\u0005B\u0000\u0000\u034b\u034d\u0005-\u0000\u0000\u034c\u034e\u0003"+
		"p8\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0350\u0003(\u0014\u0000"+
		"\u0350\u0351\u0005C\u0000\u0000\u0351\u036a\u0001\u0000\u0000\u0000\u0352"+
		"\u0353\n\u0003\u0000\u0000\u0353\u0354\u0005B\u0000\u0000\u0354\u0355"+
		"\u0003p8\u0000\u0355\u0356\u0005-\u0000\u0000\u0356\u0357\u0003(\u0014"+
		"\u0000\u0357\u0358\u0005C\u0000\u0000\u0358\u036a\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\n\u0002\u0000\u0000\u035a\u035b\u0005B\u0000\u0000\u035b"+
		"\u035c\u0005P\u0000\u0000\u035c\u036a\u0005C\u0000\u0000\u035d\u035e\n"+
		"\u0001\u0000\u0000\u035e\u0360\u0005@\u0000\u0000\u035f\u0361\u0003r9"+
		"\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000"+
		"\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0366\u0005A\u0000\u0000"+
		"\u0363\u0365\u0003d2\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0365\u0368"+
		"\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366"+
		"\u0001\u0000\u0000\u0000\u0369\u0340\u0001\u0000\u0000\u0000\u0369\u0349"+
		"\u0001\u0000\u0000\u0000\u0369\u0352\u0001\u0000\u0000\u0000\u0369\u0359"+
		"\u0001\u0000\u0000\u0000\u0369\u035d\u0001\u0000\u0000\u0000\u036a\u036d"+
		"\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036b\u036c"+
		"\u0001\u0000\u0000\u0000\u036c\u007f\u0001\u0000\u0000\u0000\u036d\u036b"+
		"\u0001\u0000\u0000\u0000\u036e\u036f\u0005n\u0000\u0000\u036f\u0081\u0001"+
		"\u0000\u0000\u0000\u0370\u0379\u0003(\u0014\u0000\u0371\u0372\u0005D\u0000"+
		"\u0000\u0372\u0374\u0003\u0084B\u0000\u0373\u0375\u0005]\u0000\u0000\u0374"+
		"\u0373\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375"+
		"\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0005E\u0000\u0000\u0377\u0379"+
		"\u0001\u0000\u0000\u0000\u0378\u0370\u0001\u0000\u0000\u0000\u0378\u0371"+
		"\u0001\u0000\u0000\u0000\u0379\u0083\u0001\u0000\u0000\u0000\u037a\u037c"+
		"\u0003\u0086C\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037b\u037c\u0001"+
		"\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u0385\u0003"+
		"\u0082A\u0000\u037e\u0380\u0005]\u0000\u0000\u037f\u0381\u0003\u0086C"+
		"\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000"+
		"\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0384\u0003\u0082A\u0000"+
		"\u0383\u037e\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000"+
		"\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000"+
		"\u0386\u0085\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000"+
		"\u0388\u0389\u0003\u0088D\u0000\u0389\u038a\u0005^\u0000\u0000\u038a\u0087"+
		"\u0001\u0000\u0000\u0000\u038b\u038d\u0003\u008aE\u0000\u038c\u038b\u0001"+
		"\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038c\u0001"+
		"\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u0089\u0001"+
		"\u0000\u0000\u0000\u0390\u0391\u0005B\u0000\u0000\u0391\u0392\u0003.\u0017"+
		"\u0000\u0392\u0393\u0005C\u0000\u0000\u0393\u0397\u0001\u0000\u0000\u0000"+
		"\u0394\u0395\u0005l\u0000\u0000\u0395\u0397\u0005n\u0000\u0000\u0396\u0390"+
		"\u0001\u0000\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0397\u008b"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0005>\u0000\u0000\u0399\u039a\u0005"+
		"@\u0000\u0000\u039a\u039b\u0003.\u0017\u0000\u039b\u039d\u0005]\u0000"+
		"\u0000\u039c\u039e\u0005q\u0000\u0000\u039d\u039c\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000"+
		"\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0005A\u0000\u0000\u03a2\u03a3\u0005\\\u0000\u0000\u03a3"+
		"\u008d\u0001\u0000\u0000\u0000\u03a4\u03ca\u0003\u0090H\u0000\u03a5\u03ca"+
		"\u0003\u0092I\u0000\u03a6\u03ca\u0003\u0098L\u0000\u03a7\u03ca\u0003\u009a"+
		"M\u0000\u03a8\u03ca\u0003\u009cN\u0000\u03a9\u03ca\u0003\u00a4R\u0000"+
		"\u03aa\u03ab\u0007\u0012\u0000\u0000\u03ab\u03ac\u0007\u0013\u0000\u0000"+
		"\u03ac\u03b5\u0005@\u0000\u0000\u03ad\u03b2\u0003$\u0012\u0000\u03ae\u03af"+
		"\u0005]\u0000\u0000\u03af\u03b1\u0003$\u0012\u0000\u03b0\u03ae\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b5\u03ad\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03c4\u0001\u0000"+
		"\u0000\u0000\u03b7\u03c0\u0005[\u0000\u0000\u03b8\u03bd\u0003$\u0012\u0000"+
		"\u03b9\u03ba\u0005]\u0000\u0000\u03ba\u03bc\u0003$\u0012\u0000\u03bb\u03b9"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb"+
		"\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c1"+
		"\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03b8"+
		"\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c2\u03b7\u0001\u0000\u0000\u0000\u03c3\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c7\u0001\u0000\u0000\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005A\u0000\u0000\u03c8\u03ca\u0005"+
		"\\\u0000\u0000\u03c9\u03a4\u0001\u0000\u0000\u0000\u03c9\u03a5\u0001\u0000"+
		"\u0000\u0000\u03c9\u03a6\u0001\u0000\u0000\u0000\u03c9\u03a7\u0001\u0000"+
		"\u0000\u0000\u03c9\u03a8\u0001\u0000\u0000\u0000\u03c9\u03a9\u0001\u0000"+
		"\u0000\u0000\u03c9\u03aa\u0001\u0000\u0000\u0000\u03ca\u008f\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cc\u0005n\u0000\u0000\u03cc\u03ce\u0005[\u0000\u0000"+
		"\u03cd\u03cf\u0003\u008eG\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d9\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d1\u0005\u0016\u0000\u0000\u03d1\u03d2\u0003.\u0017\u0000\u03d2\u03d3"+
		"\u0005[\u0000\u0000\u03d3\u03d4\u0003\u008eG\u0000\u03d4\u03d9\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0005\u001a\u0000\u0000\u03d6\u03d7\u0005[\u0000"+
		"\u0000\u03d7\u03d9\u0003\u008eG\u0000\u03d8\u03cb\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d0\u0001\u0000\u0000\u0000\u03d8\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d9\u0091\u0001\u0000\u0000\u0000\u03da\u03dc\u0005D\u0000\u0000\u03db"+
		"\u03dd\u0003\u0094J\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03df"+
		"\u0005E\u0000\u0000\u03df\u0093\u0001\u0000\u0000\u0000\u03e0\u03e2\u0003"+
		"\u0096K\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e4\u0095\u0001\u0000\u0000\u0000\u03e5\u03e8\u0003\u008e"+
		"G\u0000\u03e6\u03e8\u00030\u0018\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e8\u0097\u0001\u0000\u0000\u0000"+
		"\u03e9\u03eb\u0003,\u0016\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea"+
		"\u03eb\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec"+
		"\u03ed\u0005\\\u0000\u0000\u03ed\u0099\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0005#\u0000\u0000\u03ef\u03f0\u0005@\u0000\u0000\u03f0\u03f1\u0003,"+
		"\u0016\u0000\u03f1\u03f2\u0005A\u0000\u0000\u03f2\u03f5\u0003\u008eG\u0000"+
		"\u03f3\u03f4\u0005\u001d\u0000\u0000\u03f4\u03f6\u0003\u008eG\u0000\u03f5"+
		"\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6"+
		"\u03fe\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005/\u0000\u0000\u03f8\u03f9"+
		"\u0005@\u0000\u0000\u03f9\u03fa\u0003,\u0016\u0000\u03fa\u03fb\u0005A"+
		"\u0000\u0000\u03fb\u03fc\u0003\u008eG\u0000\u03fc\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fd\u03ee\u0001\u0000\u0000\u0000\u03fd\u03f7\u0001\u0000\u0000"+
		"\u0000\u03fe\u009b\u0001\u0000\u0000\u0000\u03ff\u0400\u00055\u0000\u0000"+
		"\u0400\u0401\u0005@\u0000\u0000\u0401\u0402\u0003,\u0016\u0000\u0402\u0403"+
		"\u0005A\u0000\u0000\u0403\u0404\u0003\u008eG\u0000\u0404\u0414\u0001\u0000"+
		"\u0000\u0000\u0405\u0406\u0005\u001b\u0000\u0000\u0406\u0407\u0003\u008e"+
		"G\u0000\u0407\u0408\u00055\u0000\u0000\u0408\u0409\u0005@\u0000\u0000"+
		"\u0409\u040a\u0003,\u0016\u0000\u040a\u040b\u0005A\u0000\u0000\u040b\u040c"+
		"\u0005\\\u0000\u0000\u040c\u0414\u0001\u0000\u0000\u0000\u040d\u040e\u0005"+
		"!\u0000\u0000\u040e\u040f\u0005@\u0000\u0000\u040f\u0410\u0003\u009eO"+
		"\u0000\u0410\u0411\u0005A\u0000\u0000\u0411\u0412\u0003\u008eG\u0000\u0412"+
		"\u0414\u0001\u0000\u0000\u0000\u0413\u03ff\u0001\u0000\u0000\u0000\u0413"+
		"\u0405\u0001\u0000\u0000\u0000\u0413\u040d\u0001\u0000\u0000\u0000\u0414"+
		"\u009d\u0001\u0000\u0000\u0000\u0415\u041a\u0003\u00a0P\u0000\u0416\u0418"+
		"\u0003,\u0016\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0417\u0418\u0001"+
		"\u0000\u0000\u0000\u0418\u041a\u0001\u0000\u0000\u0000\u0419\u0415\u0001"+
		"\u0000\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u041a\u041b\u0001"+
		"\u0000\u0000\u0000\u041b\u041d\u0005\\\u0000\u0000\u041c\u041e\u0003\u00a2"+
		"Q\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000"+
		"\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u0421\u0005\\\u0000\u0000"+
		"\u0420\u0422\u0003\u00a2Q\u0000\u0421\u0420\u0001\u0000\u0000\u0000\u0421"+
		"\u0422\u0001\u0000\u0000\u0000\u0422\u009f\u0001\u0000\u0000\u0000\u0423"+
		"\u0425\u00032\u0019\u0000\u0424\u0426\u00038\u001c\u0000\u0425\u0424\u0001"+
		"\u0000\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426\u00a1\u0001"+
		"\u0000\u0000\u0000\u0427\u042c\u0003(\u0014\u0000\u0428\u0429\u0005]\u0000"+
		"\u0000\u0429\u042b\u0003(\u0014\u0000\u042a\u0428\u0001\u0000\u0000\u0000"+
		"\u042b\u042e\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u00a3\u0001\u0000\u0000\u0000"+
		"\u042e\u042c\u0001\u0000\u0000\u0000\u042f\u0430\u0005\"\u0000\u0000\u0430"+
		"\u043a\u0005n\u0000\u0000\u0431\u043a\u0005\u0019\u0000\u0000\u0432\u043a"+
		"\u0005\u0015\u0000\u0000\u0433\u0435\u0005)\u0000\u0000\u0434\u0436\u0003"+
		",\u0016\u0000\u0435\u0434\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000"+
		"\u0000\u0000\u0436\u043a\u0001\u0000\u0000\u0000\u0437\u0438\u0005\"\u0000"+
		"\u0000\u0438\u043a\u0003\f\u0006\u0000\u0439\u042f\u0001\u0000\u0000\u0000"+
		"\u0439\u0431\u0001\u0000\u0000\u0000\u0439\u0432\u0001\u0000\u0000\u0000"+
		"\u0439\u0433\u0001\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000"+
		"\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043c\u0005\\\u0000\u0000\u043c"+
		"\u00a5\u0001\u0000\u0000\u0000\u043d\u043f\u0003\u00a8T\u0000\u043e\u043d"+
		"\u0001\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0440"+
		"\u0001\u0000\u0000\u0000\u0440\u0441\u0005\u0000\u0000\u0001\u0441\u00a7"+
		"\u0001\u0000\u0000\u0000\u0442\u0444\u0003\u00aaU\u0000\u0443\u0442\u0001"+
		"\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0443\u0001"+
		"\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u00a9\u0001"+
		"\u0000\u0000\u0000\u0447\u044b\u0003\u00acV\u0000\u0448\u044b\u00030\u0018"+
		"\u0000\u0449\u044b\u0005\\\u0000\u0000\u044a\u0447\u0001\u0000\u0000\u0000"+
		"\u044a\u0448\u0001\u0000\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000"+
		"\u044b\u00ab\u0001\u0000\u0000\u0000\u044c\u044e\u00032\u0019\u0000\u044d"+
		"\u044c\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e"+
		"\u044f\u0001\u0000\u0000\u0000\u044f\u0451\u0003^/\u0000\u0450\u0452\u0003"+
		"\u00aeW\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000"+
		"\u0000\u0000\u0452\u0453\u0001\u0000\u0000\u0000\u0453\u0454\u0003\u0092"+
		"I\u0000\u0454\u00ad\u0001\u0000\u0000\u0000\u0455\u0457\u00030\u0018\u0000"+
		"\u0456\u0455\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000"+
		"\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000"+
		"\u0459\u00af\u0001\u0000\u0000\u0000\u045a\u045b\u0005x\u0000\u0000\u045b"+
		"\u00b1\u0001\u0000\u0000\u0000\u0087\u00b7\u00bf\u00d3\u00e1\u00e6\u00ed"+
		"\u00f5\u00f9\u0101\u0108\u010a\u0112\u0118\u0126\u012b\u0134\u013b\u0143"+
		"\u014b\u0153\u015b\u0163\u016b\u0173\u017b\u0183\u018c\u0194\u019d\u01a4"+
		"\u01a9\u01ae\u01b3\u01ba\u01c1\u01c7\u01e6\u01ea\u01f3\u01fa\u0204\u0208"+
		"\u020b\u0212\u0217\u021b\u021f\u0224\u022a\u0231\u0237\u024b\u0251\u0256"+
		"\u025c\u0270\u0275\u0278\u027f\u028e\u029a\u029d\u029f\u02a9\u02ad\u02b7"+
		"\u02bb\u02bf\u02c5\u02c8\u02cf\u02d1\u02d6\u02da\u02df\u02e4\u02eb\u02f3"+
		"\u02f5\u02fc\u0301\u0305\u030b\u030e\u0317\u031c\u031f\u0325\u0335\u033b"+
		"\u033e\u0343\u0346\u034d\u0360\u0366\u0369\u036b\u0374\u0378\u037b\u0380"+
		"\u0385\u038e\u0396\u039f\u03b2\u03b5\u03bd\u03c0\u03c4\u03c9\u03ce\u03d8"+
		"\u03dc\u03e3\u03e7\u03ea\u03f5\u03fd\u0413\u0417\u0419\u041d\u0421\u0425"+
		"\u042c\u0435\u0439\u043e\u0445\u044a\u044d\u0451\u0458";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}