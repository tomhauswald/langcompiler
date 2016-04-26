// Generated from E:/Projects/Java/intellij-ws/langparser/grammar\Lang.g4 by ANTLR 4.5.1
package lang.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, IDENT=49, STRING=50, REAL=51, SINT=52, UINT=53, 
		DIGIT=54, CHAR=55, UCHAR=56, LCHAR=57, WS=58, ENDL=59, LNCOM=60, BLKCOM=61;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_statement = 2, RULE_functionDefinition = 3, 
		RULE_arguments = 4, RULE_returnTypes = 5, RULE_variableDeclaration = 6, 
		RULE_datatype = 7, RULE_anonArguments = 8, RULE_lvalue = 9, RULE_rvalue = 10, 
		RULE_callArguments = 11, RULE_constant = 12, RULE_primitive = 13;
	public static final String[] ruleNames = {
		"program", "definition", "statement", "functionDefinition", "arguments", 
		"returnTypes", "variableDeclaration", "datatype", "anonArguments", "lvalue", 
		"rvalue", "callArguments", "constant", "primitive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'return'", "','", "'if'", "'('", "')'", "'else'", 
		"'for'", "'while'", "'do'", "'foreach'", "'=:'", "'['", "'..'", "']'", 
		"'=>'", "'='", "':='", "'::='", "'@'", "'*='", "'/='", "'%='", "'+='", 
		"'-='", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'null'", "'true'", 
		"'false'", "'void'", "'bool'", "'s8'", "'s16'", "'s32'", "'s64'", "'u8'", 
		"'u16'", "'u32'", "'u64'", "'f32'", "'f64'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDENT", "STRING", "REAL", "SINT", "UINT", "DIGIT", "CHAR", "UCHAR", 
		"LCHAR", "WS", "ENDL", "LNCOM", "BLKCOM"
	};
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(34);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					definition();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT))) != 0) );
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

	public static class DefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				variableDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public RvalueContext value;
		public RvalueContext condition;
		public StatementContext trueBody;
		public StatementContext falseBody;
		public VariableDeclarationContext decl;
		public RvalueContext update;
		public StatementContext body;
		public RvalueContext collection;
		public Token var;
		public Token open;
		public Token min;
		public Token max;
		public Token close;
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LangParser.IDENT, 0); }
		public List<TerminalNode> SINT() { return getTokens(LangParser.SINT); }
		public TerminalNode SINT(int i) {
			return getToken(LangParser.SINT, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				rvalue(0);
				setState(41);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__1);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT) | (1L << STRING) | (1L << REAL) | (1L << SINT))) != 0)) {
					{
					{
					setState(44);
					statement();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(T__3);
				setState(53);
				((StatementContext)_localctx).value = rvalue(0);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(54);
					match(T__4);
					setState(55);
					((StatementContext)_localctx).value = rvalue(0);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__5);
				setState(64);
				match(T__6);
				setState(65);
				((StatementContext)_localctx).condition = rvalue(0);
				setState(66);
				match(T__7);
				setState(67);
				((StatementContext)_localctx).trueBody = statement();
				setState(70);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(68);
					match(T__8);
					setState(69);
					((StatementContext)_localctx).falseBody = statement();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(T__9);
				setState(73);
				match(T__6);
				setState(74);
				((StatementContext)_localctx).decl = variableDeclaration();
				setState(75);
				((StatementContext)_localctx).condition = rvalue(0);
				setState(76);
				match(T__0);
				setState(77);
				((StatementContext)_localctx).update = rvalue(0);
				setState(78);
				match(T__7);
				setState(79);
				((StatementContext)_localctx).body = statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				match(T__10);
				setState(82);
				match(T__6);
				setState(83);
				((StatementContext)_localctx).condition = rvalue(0);
				setState(84);
				match(T__7);
				setState(85);
				((StatementContext)_localctx).body = statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(T__11);
				setState(88);
				((StatementContext)_localctx).body = statement();
				setState(89);
				match(T__10);
				setState(90);
				match(T__6);
				setState(91);
				((StatementContext)_localctx).condition = rvalue(0);
				setState(92);
				match(T__7);
				setState(93);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(T__12);
				setState(96);
				match(T__6);
				setState(97);
				((StatementContext)_localctx).collection = rvalue(0);
				setState(98);
				match(T__13);
				setState(99);
				((StatementContext)_localctx).var = match(IDENT);
				setState(100);
				match(T__7);
				setState(101);
				((StatementContext)_localctx).body = statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				match(T__12);
				setState(104);
				match(T__6);
				setState(105);
				((StatementContext)_localctx).open = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__14) ) {
					((StatementContext)_localctx).open = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(106);
				((StatementContext)_localctx).min = match(SINT);
				setState(107);
				match(T__15);
				setState(108);
				((StatementContext)_localctx).max = match(SINT);
				setState(109);
				((StatementContext)_localctx).close = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__16) ) {
					((StatementContext)_localctx).close = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(110);
				match(T__13);
				setState(111);
				((StatementContext)_localctx).var = match(IDENT);
				setState(112);
				match(T__7);
				setState(113);
				((StatementContext)_localctx).body = statement();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ArgumentsContext args;
		public ReturnTypesContext rvs;
		public Token name;
		public StatementContext body;
		public TerminalNode IDENT() { return getToken(LangParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ReturnTypesContext returnTypes() {
			return getRuleContext(ReturnTypesContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__6);
			setState(117);
			match(T__6);
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT))) != 0)) {
				{
				setState(118);
				((FunctionDefinitionContext)_localctx).args = arguments();
				}
			}

			setState(121);
			match(T__7);
			setState(122);
			match(T__17);
			setState(123);
			match(T__6);
			setState(125);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT))) != 0)) {
				{
				setState(124);
				((FunctionDefinitionContext)_localctx).rvs = returnTypes();
				}
			}

			setState(127);
			match(T__7);
			setState(128);
			match(T__7);
			setState(129);
			((FunctionDefinitionContext)_localctx).name = match(IDENT);
			setState(130);
			match(T__18);
			setState(131);
			match(T__1);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT) | (1L << STRING) | (1L << REAL) | (1L << SINT))) != 0)) {
				{
				{
				setState(132);
				((FunctionDefinitionContext)_localctx).body = statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__2);
			setState(139);
			match(T__0);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public DatatypeContext type;
		public Token name;
		public ArgumentsContext next;
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LangParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((ArgumentsContext)_localctx).type = datatype(0);
				setState(142);
				((ArgumentsContext)_localctx).name = match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((ArgumentsContext)_localctx).type = datatype(0);
				setState(145);
				((ArgumentsContext)_localctx).name = match(IDENT);
				setState(146);
				match(T__4);
				setState(147);
				((ArgumentsContext)_localctx).next = arguments();
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

	public static class ReturnTypesContext extends ParserRuleContext {
		public DatatypeContext type;
		public ReturnTypesContext next;
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ReturnTypesContext returnTypes() {
			return getRuleContext(ReturnTypesContext.class,0);
		}
		public ReturnTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReturnTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypesContext returnTypes() throws RecognitionException {
		ReturnTypesContext _localctx = new ReturnTypesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnTypes);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((ReturnTypesContext)_localctx).type = datatype(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((ReturnTypesContext)_localctx).type = datatype(0);
				setState(153);
				match(T__4);
				setState(154);
				((ReturnTypesContext)_localctx).next = returnTypes();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public DatatypeContext type;
		public Token name;
		public RvalueContext value;
		public Token isconst;
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LangParser.IDENT, i);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		int _la;
		try {
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((VariableDeclarationContext)_localctx).type = datatype(0);
				setState(159);
				((VariableDeclarationContext)_localctx).name = match(IDENT);
				setState(162);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(160);
					match(T__18);
					setState(161);
					((VariableDeclarationContext)_localctx).value = rvalue(0);
					}
				}

				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(164);
					match(T__4);
					setState(165);
					((VariableDeclarationContext)_localctx).name = match(IDENT);
					setState(168);
					_la = _input.LA(1);
					if (_la==T__18) {
						{
						setState(166);
						match(T__18);
						setState(167);
						((VariableDeclarationContext)_localctx).value = rvalue(0);
						}
					}

					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				((VariableDeclarationContext)_localctx).name = match(IDENT);
				setState(178);
				match(T__19);
				setState(179);
				((VariableDeclarationContext)_localctx).value = rvalue(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(180);
					match(T__4);
					setState(181);
					((VariableDeclarationContext)_localctx).name = match(IDENT);
					setState(182);
					match(T__19);
					setState(183);
					((VariableDeclarationContext)_localctx).value = rvalue(0);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(191);
					((VariableDeclarationContext)_localctx).type = datatype(0);
					}
					break;
				}
				setState(194);
				((VariableDeclarationContext)_localctx).name = match(IDENT);
				setState(195);
				((VariableDeclarationContext)_localctx).isconst = match(T__20);
				setState(196);
				((VariableDeclarationContext)_localctx).value = rvalue(0);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(197);
					match(T__4);
					setState(198);
					((VariableDeclarationContext)_localctx).name = match(IDENT);
					setState(199);
					match(T__20);
					setState(200);
					((VariableDeclarationContext)_localctx).value = rvalue(0);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(T__0);
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

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext basetype;
		public AnonArgumentsContext args;
		public ReturnTypesContext rvs;
		public Token indirections;
		public AnonArgumentsContext anonArguments() {
			return getRuleContext(AnonArgumentsContext.class,0);
		}
		public ReturnTypesContext returnTypes() {
			return getRuleContext(ReturnTypesContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LangParser.IDENT, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		return datatype(0);
	}

	private DatatypeContext datatype(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DatatypeContext _localctx = new DatatypeContext(_ctx, _parentState);
		DatatypeContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_datatype, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(211);
				match(T__6);
				setState(212);
				match(T__6);
				setState(214);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT))) != 0)) {
					{
					setState(213);
					((DatatypeContext)_localctx).args = anonArguments();
					}
				}

				setState(216);
				match(T__7);
				setState(217);
				match(T__17);
				setState(218);
				match(T__6);
				setState(220);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << IDENT))) != 0)) {
					{
					setState(219);
					((DatatypeContext)_localctx).rvs = returnTypes();
					}
				}

				setState(222);
				match(T__7);
				setState(223);
				match(T__7);
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				{
				setState(224);
				primitive();
				}
				break;
			case IDENT:
				{
				setState(225);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DatatypeContext(_parentctx, _parentState);
					_localctx.basetype = _prevctx;
					_localctx.basetype = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_datatype);
					setState(228);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(230); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(229);
							((DatatypeContext)_localctx).indirections = match(T__21);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(232); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class AnonArgumentsContext extends ParserRuleContext {
		public DatatypeContext type;
		public AnonArgumentsContext next;
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public AnonArgumentsContext anonArguments() {
			return getRuleContext(AnonArgumentsContext.class,0);
		}
		public AnonArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAnonArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonArgumentsContext anonArguments() throws RecognitionException {
		AnonArgumentsContext _localctx = new AnonArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anonArguments);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((AnonArgumentsContext)_localctx).type = datatype(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				((AnonArgumentsContext)_localctx).type = datatype(0);
				setState(241);
				match(T__4);
				setState(242);
				((AnonArgumentsContext)_localctx).next = anonArguments();
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

	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext lhs;
		public Token operator;
		public RvalueContext rhs;
		public TerminalNode IDENT() { return getToken(LangParser.IDENT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_lvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(249);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(250);
						((LvalueContext)_localctx).operator = match(T__18);
						setState(251);
						((LvalueContext)_localctx).rhs = rvalue(0);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253);
						((LvalueContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((LvalueContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(254);
						((LvalueContext)_localctx).rhs = rvalue(0);
						}
						break;
					case 3:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						((LvalueContext)_localctx).operator = match(T__24);
						setState(257);
						((LvalueContext)_localctx).rhs = rvalue(0);
						}
						break;
					case 4:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(258);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(259);
						((LvalueContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((LvalueContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(260);
						((LvalueContext)_localctx).rhs = rvalue(0);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class RvalueContext extends ParserRuleContext {
		public RvalueContext lhs;
		public Token operator;
		public RvalueContext rhs;
		public CallArgumentsContext args;
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(267);
				match(T__27);
				setState(268);
				rvalue(5);
				}
				break;
			case T__33:
			case T__34:
			case T__35:
			case STRING:
			case REAL:
			case SINT:
				{
				setState(269);
				constant();
				}
				break;
			case IDENT:
				{
				setState(270);
				lvalue(0);
				}
				break;
			case T__6:
				{
				setState(271);
				match(T__6);
				setState(272);
				rvalue(0);
				setState(273);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278);
						((RvalueContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((RvalueContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(279);
						((RvalueContext)_localctx).rhs = rvalue(4);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(281);
						((RvalueContext)_localctx).operator = match(T__30);
						setState(282);
						((RvalueContext)_localctx).rhs = rvalue(3);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(283);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(284);
						((RvalueContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((RvalueContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(285);
						((RvalueContext)_localctx).rhs = rvalue(2);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(286);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(287);
						match(T__6);
						setState(289);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << IDENT) | (1L << STRING) | (1L << REAL) | (1L << SINT))) != 0)) {
							{
							setState(288);
							((RvalueContext)_localctx).args = callArguments();
							}
						}

						setState(291);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class CallArgumentsContext extends ParserRuleContext {
		public RvalueContext argval;
		public CallArgumentsContext next;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callArguments);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((CallArgumentsContext)_localctx).argval = rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				((CallArgumentsContext)_localctx).argval = rvalue(0);
				setState(299);
				match(T__4);
				setState(300);
				((CallArgumentsContext)_localctx).next = callArguments();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode REAL() { return getToken(LangParser.REAL, 0); }
		public TerminalNode SINT() { return getToken(LangParser.SINT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << STRING) | (1L << REAL) | (1L << SINT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return datatype_sempred((DatatypeContext)_localctx, predIndex);
		case 9:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 10:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean datatype_sempred(DatatypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\5"+
		"\2%\n\2\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3"+
		"\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0088\n\5\f\5\16\5\u008b\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u0098\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\3"+
		"\b\5\b\u00a5\n\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\7\b\u00ad\n\b\f\b\16\b"+
		"\u00b0\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bb\n\b\f\b\16\b"+
		"\u00be\13\b\3\b\3\b\3\b\5\b\u00c3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00cc\n\b\f\b\16\b\u00cf\13\b\3\b\3\b\5\b\u00d3\n\b\3\t\3\t\3\t\3\t\5"+
		"\t\u00d9\n\t\3\t\3\t\3\t\3\t\5\t\u00df\n\t\3\t\3\t\3\t\3\t\5\t\u00e5\n"+
		"\t\3\t\3\t\6\t\u00e9\n\t\r\t\16\t\u00ea\7\t\u00ed\n\t\f\t\16\t\u00f0\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\5\n\u00f7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0108\n\13\f\13\16\13\u010b"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0116\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0124\n\f\3\f\7\f\u0127\n\f\f\f"+
		"\16\f\u012a\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u0131\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\2\5\20\24\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\n\4\2\t\t"+
		"\21\21\4\2\n\n\23\23\3\2\31\32\3\2\34\35\3\2\37 \3\2\"#\4\2$&\64\66\3"+
		"\2\'\62\u0158\2$\3\2\2\2\4(\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n\u0097\3\2"+
		"\2\2\f\u009e\3\2\2\2\16\u00d2\3\2\2\2\20\u00e4\3\2\2\2\22\u00f6\3\2\2"+
		"\2\24\u00f8\3\2\2\2\26\u0115\3\2\2\2\30\u0130\3\2\2\2\32\u0132\3\2\2\2"+
		"\34\u0134\3\2\2\2\36%\3\2\2\2\37!\5\4\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3"+
		"\2\2\2\"#\3\2\2\2#%\3\2\2\2$\36\3\2\2\2$ \3\2\2\2%\3\3\2\2\2&)\5\b\5\2"+
		"\')\5\16\b\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\5\26\f\2+,\7\3\2\2,u\3"+
		"\2\2\2-\61\7\4\2\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64u\7\5\2\2\65u\5\16\b\2\66\67"+
		"\7\6\2\2\67<\5\26\f\289\7\7\2\29;\5\26\f\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\3\2\2@u\3\2\2\2AB\7\b\2\2BC\7\t\2"+
		"\2CD\5\26\f\2DE\7\n\2\2EH\5\6\4\2FG\7\13\2\2GI\5\6\4\2HF\3\2\2\2HI\3\2"+
		"\2\2Iu\3\2\2\2JK\7\f\2\2KL\7\t\2\2LM\5\16\b\2MN\5\26\f\2NO\7\3\2\2OP\5"+
		"\26\f\2PQ\7\n\2\2QR\5\6\4\2Ru\3\2\2\2ST\7\r\2\2TU\7\t\2\2UV\5\26\f\2V"+
		"W\7\n\2\2WX\5\6\4\2Xu\3\2\2\2YZ\7\16\2\2Z[\5\6\4\2[\\\7\r\2\2\\]\7\t\2"+
		"\2]^\5\26\f\2^_\7\n\2\2_`\7\3\2\2`u\3\2\2\2ab\7\17\2\2bc\7\t\2\2cd\5\26"+
		"\f\2de\7\20\2\2ef\7\63\2\2fg\7\n\2\2gh\5\6\4\2hu\3\2\2\2ij\7\17\2\2jk"+
		"\7\t\2\2kl\t\2\2\2lm\7\66\2\2mn\7\22\2\2no\7\66\2\2op\t\3\2\2pq\7\20\2"+
		"\2qr\7\63\2\2rs\7\n\2\2su\5\6\4\2t*\3\2\2\2t-\3\2\2\2t\65\3\2\2\2t\66"+
		"\3\2\2\2tA\3\2\2\2tJ\3\2\2\2tS\3\2\2\2tY\3\2\2\2ta\3\2\2\2ti\3\2\2\2u"+
		"\7\3\2\2\2vw\7\t\2\2wy\7\t\2\2xz\5\n\6\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\7\n\2\2|}\7\24\2\2}\177\7\t\2\2~\u0080\5\f\7\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0083\7\n\2\2\u0083"+
		"\u0084\7\63\2\2\u0084\u0085\7\25\2\2\u0085\u0089\7\4\2\2\u0086\u0088\5"+
		"\6\4\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\5"+
		"\2\2\u008d\u008e\7\3\2\2\u008e\t\3\2\2\2\u008f\u0090\5\20\t\2\u0090\u0091"+
		"\7\63\2\2\u0091\u0098\3\2\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\63\2"+
		"\2\u0094\u0095\7\7\2\2\u0095\u0096\5\n\6\2\u0096\u0098\3\2\2\2\u0097\u008f"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0098\13\3\2\2\2\u0099\u009f\5\20\t\2\u009a"+
		"\u009b\5\20\t\2\u009b\u009c\7\7\2\2\u009c\u009d\5\f\7\2\u009d\u009f\3"+
		"\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1"+
		"\5\20\t\2\u00a1\u00a4\7\63\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a5\5\26\f"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ae\3\2\2\2\u00a6\u00a7"+
		"\7\7\2\2\u00a7\u00aa\7\63\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00ab\5\26\f"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00d3\3\2"+
		"\2\2\u00b3\u00b4\7\63\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00bc\5\26\f\2\u00b6"+
		"\u00b7\7\7\2\2\u00b7\u00b8\7\63\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00bb\5"+
		"\26\f\2\u00ba\u00b6\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\3"+
		"\2\2\u00c0\u00d3\3\2\2\2\u00c1\u00c3\5\20\t\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\63\2\2\u00c5\u00c6\7"+
		"\27\2\2\u00c6\u00cd\5\26\f\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\7\63\2\2"+
		"\u00c9\u00ca\7\27\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00a0\3\2"+
		"\2\2\u00d2\u00b3\3\2\2\2\u00d2\u00c2\3\2\2\2\u00d3\17\3\2\2\2\u00d4\u00d5"+
		"\b\t\1\2\u00d5\u00d6\7\t\2\2\u00d6\u00d8\7\t\2\2\u00d7\u00d9\5\22\n\2"+
		"\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\7\n\2\2\u00db\u00dc\7\24\2\2\u00dc\u00de\7\t\2\2\u00dd\u00df\5\f\7\2"+
		"\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\7\n\2\2\u00e1\u00e5\7\n\2\2\u00e2\u00e5\5\34\17\2\u00e3\u00e5\7\63\2"+
		"\2\u00e4\u00d4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00ee"+
		"\3\2\2\2\u00e6\u00e8\f\6\2\2\u00e7\u00e9\7\30\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\21\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f7\5\20\t"+
		"\2\u00f2\u00f3\5\20\t\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\5\22\n\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\23\3\2\2"+
		"\2\u00f8\u00f9\b\13\1\2\u00f9\u00fa\7\63\2\2\u00fa\u0109\3\2\2\2\u00fb"+
		"\u00fc\f\6\2\2\u00fc\u00fd\7\25\2\2\u00fd\u0108\5\26\f\2\u00fe\u00ff\f"+
		"\5\2\2\u00ff\u0100\t\4\2\2\u0100\u0108\5\26\f\2\u0101\u0102\f\4\2\2\u0102"+
		"\u0103\7\33\2\2\u0103\u0108\5\26\f\2\u0104\u0105\f\3\2\2\u0105\u0106\t"+
		"\5\2\2\u0106\u0108\5\26\f\2\u0107\u00fb\3\2\2\2\u0107\u00fe\3\2\2\2\u0107"+
		"\u0101\3\2\2\2\u0107\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\25\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d"+
		"\b\f\1\2\u010d\u010e\7\36\2\2\u010e\u0116\5\26\f\7\u010f\u0116\5\32\16"+
		"\2\u0110\u0116\5\24\13\2\u0111\u0112\7\t\2\2\u0112\u0113\5\26\f\2\u0113"+
		"\u0114\7\n\2\2\u0114\u0116\3\2\2\2\u0115\u010c\3\2\2\2\u0115\u010f\3\2"+
		"\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0116\u0128\3\2\2\2\u0117"+
		"\u0118\f\5\2\2\u0118\u0119\t\6\2\2\u0119\u0127\5\26\f\6\u011a\u011b\f"+
		"\4\2\2\u011b\u011c\7!\2\2\u011c\u0127\5\26\f\5\u011d\u011e\f\3\2\2\u011e"+
		"\u011f\t\7\2\2\u011f\u0127\5\26\f\4\u0120\u0121\f\6\2\2\u0121\u0123\7"+
		"\t\2\2\u0122\u0124\5\30\r\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0127\7\n\2\2\u0126\u0117\3\2\2\2\u0126\u011a\3\2"+
		"\2\2\u0126\u011d\3\2\2\2\u0126\u0120\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\27\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012b\u0131\5\26\f\2\u012c\u012d\5\26\f\2\u012d\u012e\7\7\2\2\u012e"+
		"\u012f\5\30\r\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3"+
		"\2\2\2\u0131\31\3\2\2\2\u0132\u0133\t\b\2\2\u0133\33\3\2\2\2\u0134\u0135"+
		"\t\t\2\2\u0135\35\3\2\2\2\"\"$(\61<Hty\177\u0089\u0097\u009e\u00a4\u00aa"+
		"\u00ae\u00bc\u00c2\u00cd\u00d2\u00d8\u00de\u00e4\u00ea\u00ee\u00f6\u0107"+
		"\u0109\u0115\u0123\u0126\u0128\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}