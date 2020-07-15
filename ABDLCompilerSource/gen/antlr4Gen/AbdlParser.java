// Generated from D:/dev/mybdl/Board-Description-Language_and_ABDL/ABDLCompilerSource/src/Compiler\Abdl.g4 by ANTLR 4.8
package antlr4Gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, String=54, ID=55, Int=56, Comment=57, WS=58, ERRORS=59;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_functDef = 2, RULE_onMove = 3, RULE_block = 4, 
		RULE_statements = 5, RULE_functionCallStatement = 6, RULE_forStatement = 7, 
		RULE_whileStatement = 8, RULE_ifStatement = 9, RULE_elseIf = 10, RULE_elseStatement = 11, 
		RULE_varDeclaration = 12, RULE_varAttrib = 13, RULE_functionCall = 14, 
		RULE_returnStat = 15, RULE_expr = 16, RULE_arrayDecl = 17, RULE_args = 18, 
		RULE_typedArgs = 19, RULE_board = 20, RULE_type = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "functDef", "onMove", "block", "statements", "functionCallStatement", 
			"forStatement", "whileStatement", "ifStatement", "elseIf", "elseStatement", 
			"varDeclaration", "varAttrib", "functionCall", "returnStat", "expr", 
			"arrayDecl", "args", "typedArgs", "board", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'end'", "'endmain'", "';'", "'('", "')'", "'on_move'", 
			"'for'", "'from'", "'to'", "'do'", "'done'", "'while'", "'if'", "'then'", 
			"'endif'", "'else'", "'let'", "'='", "'can_move'", "'move'", "'print'", 
			"'return'", "'-'", "'+'", "'['", "']'", "'^'", "'*'", "'/'", "'%'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'/='", "'&&'", "'||'", "'null'", "'width'", 
			"'height'", "'current_player'", "'move_count'", "','", "'board'", "'.'", 
			"'piece_name'", "'owner'", "'int'", "'string'", "'array'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "String", "ID", "Int", "Comment", 
			"WS", "ERRORS"
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
	public String getGrammarFileName() { return "Abdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AbdlParser.EOF, 0); }
		public List<FunctDefContext> functDef() {
			return getRuleContexts(FunctDefContext.class);
		}
		public FunctDefContext functDef(int i) {
			return getRuleContext(FunctDefContext.class,i);
		}
		public List<OnMoveContext> onMove() {
			return getRuleContexts(OnMoveContext.class);
		}
		public OnMoveContext onMove(int i) {
			return getRuleContext(OnMoveContext.class,i);
		}
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << ID))) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__50:
				case T__51:
				case T__52:
				case ID:
					{
					setState(44);
					functDef();
					}
					break;
				case T__7:
					{
					setState(45);
					onMove();
					}
					break;
				case T__0:
					{
					setState(46);
					main();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(56);
				statements();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(62);
				match(T__2);
				setState(63);
				match(T__0);
				}
				break;
			case T__3:
				{
				setState(64);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(67);
			match(T__4);
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

	public static class FunctDefContext extends ParserRuleContext {
		public Token funcName;
		public Token funcName2;
		public TypedArgsContext typedArgs() {
			return getRuleContext(TypedArgsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public FunctDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterFunctDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitFunctDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitFunctDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctDefContext functDef() throws RecognitionException {
		FunctDefContext _localctx = new FunctDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) {
				{
				setState(69);
				type();
				}
			}

			setState(72);
			((FunctDefContext)_localctx).funcName = match(ID);
			setState(73);
			match(T__5);
			setState(74);
			typedArgs();
			setState(75);
			match(T__6);
			setState(76);
			match(T__1);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(77);
				statements();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__2);
			{
			setState(84);
			((FunctDefContext)_localctx).funcName2 = match(ID);
			setState(85);
			if (!((((FunctDefContext)_localctx).funcName!=null?((FunctDefContext)_localctx).funcName.getText():null).equals((((FunctDefContext)_localctx).funcName2!=null?((FunctDefContext)_localctx).funcName2.getText():null)))) throw new FailedPredicateException(this, "$funcName.text.equals($funcName2.text)");
			}
			setState(87);
			match(T__4);
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

	public static class OnMoveContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public OnMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterOnMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitOnMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitOnMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnMoveContext onMove() throws RecognitionException {
		OnMoveContext _localctx = new OnMoveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_onMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);
			setState(90);
			match(T__1);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(91);
				statements();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__2);
			setState(98);
			match(T__7);
			setState(99);
			match(T__4);
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

	public static class BlockContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				whileStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				ifStatement();
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

	public static class StatementsContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAttribContext varAttrib() {
			return getRuleContext(VarAttribContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				varAttrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				functionCallStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				returnStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				block();
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			functionCall();
			setState(114);
			match(T__4);
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

	public static class ForStatementContext extends ParserRuleContext {
		public Token var;
		public ExprContext bottom;
		public ExprContext up;
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
			((ForStatementContext)_localctx).var = match(ID);
			setState(118);
			match(T__9);
			setState(119);
			((ForStatementContext)_localctx).bottom = expr(0);
			setState(120);
			match(T__10);
			setState(121);
			((ForStatementContext)_localctx).up = expr(0);
			setState(122);
			match(T__11);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(123);
				statements();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__12);
			setState(130);
			match(T__4);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__13);
			setState(133);
			expr(0);
			setState(134);
			match(T__11);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(135);
				statements();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__12);
			setState(142);
			match(T__4);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__14);
			setState(145);
			expr(0);
			setState(146);
			match(T__15);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(147);
				statements();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					elseIf();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(159);
				elseStatement();
				}
			}

			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(162);
				match(T__2);
				setState(163);
				match(T__14);
				}
				break;
			case T__16:
				{
				setState(164);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167);
			match(T__4);
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

	public static class ElseIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__17);
			setState(170);
			match(T__14);
			setState(171);
			expr(0);
			setState(172);
			match(T__15);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(173);
				statements();
				}
				}
				setState(178);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__17);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				{
				setState(180);
				statements();
				}
				}
				setState(185);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__18);
			setState(187);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(188);
				match(T__1);
				setState(189);
				type();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(192);
				match(T__19);
				setState(193);
				expr(0);
				}
			}

			setState(196);
			match(T__4);
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

	public static class VarAttribContext extends ParserRuleContext {
		public ExprContext var;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterVarAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitVarAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitVarAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAttribContext varAttrib() throws RecognitionException {
		VarAttribContext _localctx = new VarAttribContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((VarAttribContext)_localctx).var = expr(0);
			setState(199);
			match(T__19);
			setState(200);
			expr(0);
			setState(201);
			match(T__4);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CanMoveCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CanMoveCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterCanMoveCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitCanMoveCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitCanMoveCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public FuncCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrintCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public MoveCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterMoveCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitMoveCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitMoveCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new CanMoveCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((CanMoveCallContext)_localctx).funcName = match(T__20);
				setState(204);
				match(T__5);
				setState(205);
				args();
				setState(206);
				match(T__6);
				}
				break;
			case T__21:
				_localctx = new MoveCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((MoveCallContext)_localctx).funcName = match(T__21);
				setState(209);
				match(T__5);
				setState(210);
				args();
				setState(211);
				match(T__6);
				}
				break;
			case T__22:
				_localctx = new PrintCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				((PrintCallContext)_localctx).funcName = match(T__22);
				setState(214);
				match(T__5);
				setState(215);
				args();
				setState(216);
				match(T__6);
				}
				break;
			case ID:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				((FuncCallContext)_localctx).funcName = match(ID);
				setState(219);
				match(T__5);
				setState(220);
				args();
				setState(221);
				match(T__6);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__23);
			setState(226);
			expr(0);
			setState(227);
			match(T__4);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprMoveCountContext extends ExprContext {
		public ExprMoveCountContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprMoveCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprMoveCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprMoveCount(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode String() { return getToken(AbdlParser.String, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoardContext extends ExprContext {
		public BoardContext board() {
			return getRuleContext(BoardContext.class,0);
		}
		public ExprBoardContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprBoard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode Int() { return getToken(AbdlParser.Int, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprWidthContext extends ExprContext {
		public ExprWidthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnaryContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayIndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprArrayIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCurrPlayerContext extends ExprContext {
		public ExprCurrPlayerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprCurrPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprCurrPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprCurrPlayer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrDeclContext extends ExprContext {
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public ExprArrDeclContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprArrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprArrDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ExprContext {
		public ExprNullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprHeightContext extends ExprContext {
		public ExprHeightContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprHeight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				((ExprFunctionCallContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) ) {
					((ExprFunctionCallContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(T__5);
				setState(234);
				args();
				setState(235);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new ExprBoardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				board();
				}
				break;
			case 4:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(T__5);
				setState(239);
				expr(0);
				setState(240);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(Int);
				}
				break;
			case 6:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(String);
				}
				break;
			case 7:
				{
				_localctx = new ExprArrDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				arrayDecl();
				}
				break;
			case 8:
				{
				_localctx = new ExprNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(T__40);
				}
				break;
			case 9:
				{
				_localctx = new ExprWidthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(T__41);
				}
				break;
			case 10:
				{
				_localctx = new ExprHeightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(T__42);
				}
				break;
			case 11:
				{
				_localctx = new ExprCurrPlayerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(T__43);
				}
				break;
			case 12:
				{
				_localctx = new ExprMoveCountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(T__44);
				}
				break;
			case 13:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(254);
						((ExprOpContext)_localctx).op = match(T__28);
						setState(255);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(257);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(260);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(263);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(266);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprArrayIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(269);
						match(T__26);
						setState(270);
						expr(0);
						setState(271);
						match(T__27);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__26);
			setState(279);
			expr(0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(280);
				match(T__45);
				setState(281);
				expr(0);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(T__27);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				setState(289);
				expr(0);
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(292);
				match(T__45);
				setState(293);
				expr(0);
				}
				}
				setState(298);
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

	public static class TypedArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypedArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterTypedArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitTypedArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitTypedArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedArgsContext typedArgs() throws RecognitionException {
		TypedArgsContext _localctx = new TypedArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(299);
				match(ID);
				setState(300);
				match(T__1);
				setState(301);
				type();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(304);
				match(T__45);
				{
				setState(305);
				match(ID);
				setState(306);
				match(T__1);
				setState(307);
				type();
				}
				}
				}
				setState(312);
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

	public static class BoardContext extends ParserRuleContext {
		public Token prop;
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_board);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__46);
			setState(314);
			arrayDecl();
			setState(315);
			match(T__47);
			setState(316);
			((BoardContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
				((BoardContext)_localctx).prop = (Token)_errHandler.recoverInline(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(T__52);
				setState(321);
				match(T__32);
				{
				setState(322);
				type();
				}
				setState(323);
				match(T__34);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return functDef_sempred((FunctDefContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functDef_sempred(FunctDefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (((FunctDefContext)_localctx).funcName!=null?((FunctDefContext)_localctx).funcName.getText():null).equals((((FunctDefContext)_localctx).funcName2!=null?((FunctDefContext)_localctx).funcName2.getText():null));
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3"+
		"\3\3\3\3\5\3D\n\3\3\3\3\3\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n"+
		"\4\f\4\16\4T\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"r\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t"+
		"\u0082\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13"+
		"\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\5\13\u00a3\n\13\3"+
		"\13\3\13\3\13\5\13\u00a8\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00b1"+
		"\n\f\f\f\16\f\u00b4\13\f\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb\13\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00c1\n\16\3\16\3\16\5\16\u00c5\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e2\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fe"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0114\n\22\f\22\16\22\u0117\13"+
		"\22\3\23\3\23\3\23\3\23\7\23\u011d\n\23\f\23\16\23\u0120\13\23\3\23\3"+
		"\23\3\24\5\24\u0125\n\24\3\24\3\24\7\24\u0129\n\24\f\24\16\24\u012c\13"+
		"\24\3\25\3\25\3\25\5\25\u0131\n\25\3\25\3\25\3\25\3\25\7\25\u0137\n\25"+
		"\f\25\16\25\u013a\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0148\n\27\3\27\2\3\"\30\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,\2\b\3\2\33\34\4\2\27\3099\3\2 \"\3\2#(\3\2)*\3\2"+
		"\63\64\2\u0167\2\63\3\2\2\2\48\3\2\2\2\6H\3\2\2\2\b[\3\2\2\2\nj\3\2\2"+
		"\2\fq\3\2\2\2\16s\3\2\2\2\20v\3\2\2\2\22\u0086\3\2\2\2\24\u0092\3\2\2"+
		"\2\26\u00ab\3\2\2\2\30\u00b5\3\2\2\2\32\u00bc\3\2\2\2\34\u00c8\3\2\2\2"+
		"\36\u00e1\3\2\2\2 \u00e3\3\2\2\2\"\u00fd\3\2\2\2$\u0118\3\2\2\2&\u0124"+
		"\3\2\2\2(\u0130\3\2\2\2*\u013b\3\2\2\2,\u0147\3\2\2\2.\62\5\6\4\2/\62"+
		"\5\b\5\2\60\62\5\4\3\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2"+
		"\2\3\67\3\3\2\2\289\7\3\2\29=\7\4\2\2:<\5\f\7\2;:\3\2\2\2<?\3\2\2\2=;"+
		"\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@A\7\5\2\2AD\7\3\2\2BD\7\6\2\2C"+
		"@\3\2\2\2CB\3\2\2\2DE\3\2\2\2EF\7\7\2\2F\5\3\2\2\2GI\5,\27\2HG\3\2\2\2"+
		"HI\3\2\2\2IJ\3\2\2\2JK\79\2\2KL\7\b\2\2LM\5(\25\2MN\7\t\2\2NR\7\4\2\2"+
		"OQ\5\f\7\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2"+
		"UV\7\5\2\2VW\79\2\2WX\6\4\2\3XY\3\2\2\2YZ\7\7\2\2Z\7\3\2\2\2[\\\7\n\2"+
		"\2\\`\7\4\2\2]_\5\f\7\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2"+
		"\2\2b`\3\2\2\2cd\7\5\2\2de\7\n\2\2ef\7\7\2\2f\t\3\2\2\2gk\5\20\t\2hk\5"+
		"\22\n\2ik\5\24\13\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lr\5\32\16"+
		"\2mr\5\34\17\2nr\5\16\b\2or\5 \21\2pr\5\n\6\2ql\3\2\2\2qm\3\2\2\2qn\3"+
		"\2\2\2qo\3\2\2\2qp\3\2\2\2r\r\3\2\2\2st\5\36\20\2tu\7\7\2\2u\17\3\2\2"+
		"\2vw\7\13\2\2wx\79\2\2xy\7\f\2\2yz\5\"\22\2z{\7\r\2\2{|\5\"\22\2|\u0080"+
		"\7\16\2\2}\177\5\f\7\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\17"+
		"\2\2\u0084\u0085\7\7\2\2\u0085\21\3\2\2\2\u0086\u0087\7\20\2\2\u0087\u0088"+
		"\5\"\22\2\u0088\u008c\7\16\2\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\17\2\2\u0090\u0091\7\7\2\2"+
		"\u0091\23\3\2\2\2\u0092\u0093\7\21\2\2\u0093\u0094\5\"\22\2\u0094\u0098"+
		"\7\22\2\2\u0095\u0097\5\f\7\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009d\5\26\f\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a3\5\30\r\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a7\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a8\7\21\2\2\u00a6\u00a8"+
		"\7\23\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00aa\7\7\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad"+
		"\7\21\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00b2\7\22\2\2\u00af\u00b1\5\f\7"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b9\7\24\2\2\u00b6"+
		"\u00b8\5\f\7\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7\25\2\2\u00bd\u00c0\79\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c1\5,\27\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\7\26"+
		"\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7\7\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\5\"\22"+
		"\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\7\7\2\2\u00cc"+
		"\35\3\2\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5&\24"+
		"\2\u00d0\u00d1\7\t\2\2\u00d1\u00e2\3\2\2\2\u00d2\u00d3\7\30\2\2\u00d3"+
		"\u00d4\7\b\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7\t\2\2\u00d6\u00e2\3\2"+
		"\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\5&\24\2\u00da"+
		"\u00db\7\t\2\2\u00db\u00e2\3\2\2\2\u00dc\u00dd\79\2\2\u00dd\u00de\7\b"+
		"\2\2\u00de\u00df\5&\24\2\u00df\u00e0\7\t\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00cd\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00dc\3\2"+
		"\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\5\"\22\2\u00e5"+
		"\u00e6\7\7\2\2\u00e6!\3\2\2\2\u00e7\u00e8\b\22\1\2\u00e8\u00e9\t\2\2\2"+
		"\u00e9\u00fe\5\"\22\25\u00ea\u00eb\t\3\2\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed"+
		"\5&\24\2\u00ed\u00ee\7\t\2\2\u00ee\u00fe\3\2\2\2\u00ef\u00fe\5*\26\2\u00f0"+
		"\u00f1\7\b\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7\t\2\2\u00f3\u00fe\3"+
		"\2\2\2\u00f4\u00fe\7:\2\2\u00f5\u00fe\78\2\2\u00f6\u00fe\5$\23\2\u00f7"+
		"\u00fe\7+\2\2\u00f8\u00fe\7,\2\2\u00f9\u00fe\7-\2\2\u00fa\u00fe\7.\2\2"+
		"\u00fb\u00fe\7/\2\2\u00fc\u00fe\79\2\2\u00fd\u00e7\3\2\2\2\u00fd\u00ea"+
		"\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0115\3\2\2\2\u00ff\u0100\f\23\2\2\u0100\u0101\7"+
		"\37\2\2\u0101\u0114\5\"\22\23\u0102\u0103\f\22\2\2\u0103\u0104\t\4\2\2"+
		"\u0104\u0114\5\"\22\23\u0105\u0106\f\21\2\2\u0106\u0107\t\2\2\2\u0107"+
		"\u0114\5\"\22\22\u0108\u0109\f\20\2\2\u0109\u010a\t\5\2\2\u010a\u0114"+
		"\5\"\22\21\u010b\u010c\f\17\2\2\u010c\u010d\t\6\2\2\u010d\u0114\5\"\22"+
		"\20\u010e\u010f\f\24\2\2\u010f\u0110\7\35\2\2\u0110\u0111\5\"\22\2\u0111"+
		"\u0112\7\36\2\2\u0112\u0114\3\2\2\2\u0113\u00ff\3\2\2\2\u0113\u0102\3"+
		"\2\2\2\u0113\u0105\3\2\2\2\u0113\u0108\3\2\2\2\u0113\u010b\3\2\2\2\u0113"+
		"\u010e\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116#\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\35\2\2\u0119\u011e"+
		"\5\"\22\2\u011a\u011b\7\60\2\2\u011b\u011d\5\"\22\2\u011c\u011a\3\2\2"+
		"\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\36\2\2\u0122%\3\2\2\2\u0123"+
		"\u0125\5\"\22\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012a\3"+
		"\2\2\2\u0126\u0127\7\60\2\2\u0127\u0129\5\"\22\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\'\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012d\u012e\79\2\2\u012e\u012f\7\4\2\2\u012f\u0131"+
		"\5,\27\2\u0130\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0138\3\2\2\2\u0132"+
		"\u0133\7\60\2\2\u0133\u0134\79\2\2\u0134\u0135\7\4\2\2\u0135\u0137\5,"+
		"\27\2\u0136\u0132\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139)\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\61\2\2"+
		"\u013c\u013d\5$\23\2\u013d\u013e\7\62\2\2\u013e\u013f\t\7\2\2\u013f+\3"+
		"\2\2\2\u0140\u0148\7\65\2\2\u0141\u0148\7\66\2\2\u0142\u0143\7\67\2\2"+
		"\u0143\u0144\7#\2\2\u0144\u0145\5,\27\2\u0145\u0146\7%\2\2\u0146\u0148"+
		"\3\2\2\2\u0147\u0140\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0148"+
		"-\3\2\2\2\37\61\63=CHR`jq\u0080\u008c\u0098\u009e\u00a2\u00a7\u00b2\u00b9"+
		"\u00c0\u00c4\u00e1\u00fd\u0113\u0115\u011e\u0124\u012a\u0130\u0138\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}