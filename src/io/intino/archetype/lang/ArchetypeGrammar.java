// Generated from /Users/oroncal/workspace/archetype/src/io/intino/archetype/lang/ArchetypeGrammar.g4 by ANTLR 4.10.1
package io.intino.archetype.lang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArchetypeGrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IN=1, WITH=2, SPLITTED=3, TARGET=4, LEFT_PARENTHESIS=5, RIGHT_PARENTHESIS=6, 
		LEFT_SQUARE=7, RIGHT_SQUARE=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, COMMA=11, 
		MINUS=12, PLUS=13, STAR=14, AS=15, REGEX=16, OWNER=17, CONSUMER=18, TIMETAG=19, 
		COLON=20, LINE_COMMENT=21, LABEL=22, IDENTIFIER=23, NEWLINE=24, SPACES=25, 
		SP=26, NL=27, NEW_LINE_INDENT=28, DEDENT=29, UNKNOWN_TOKEN=30, QUOTE_BEGIN=31, 
		QUOTE_END=32, EXPRESSION_BEGIN=33, EXPRESSION_END=34;
	public static final int
		RULE_root = 0, RULE_header = 1, RULE_node = 2, RULE_declaration = 3, RULE_starting = 4, 
		RULE_parameters = 5, RULE_splitted = 6, RULE_parameter = 7, RULE_body = 8, 
		RULE_type = 9, RULE_ownerAndConsumer = 10, RULE_uses = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "header", "node", "declaration", "starting", "parameters", "splitted", 
			"parameter", "body", "type", "ownerAndConsumer", "uses"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'in'", "'with'", "'splitted'", "'TARGETS'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "','", "'-'", "'+'", "'*'", "'as'", "'regex'", "'owner'", 
			"'consumer'", "'timetag'", "':'", null, null, null, null, null, null, 
			null, "'indent'", "'dedent'", null, "'%QUOTE_BEGIN%'", "'%QUOTE_END%'", 
			"'%EXPRESSION_BEGIN%'", "'%EXPRESSION_END%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IN", "WITH", "SPLITTED", "TARGET", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_BRACKET", "RIGHT_BRACKET", "COMMA", 
			"MINUS", "PLUS", "STAR", "AS", "REGEX", "OWNER", "CONSUMER", "TIMETAG", 
			"COLON", "LINE_COMMENT", "LABEL", "IDENTIFIER", "NEWLINE", "SPACES", 
			"SP", "NL", "NEW_LINE_INDENT", "DEDENT", "UNKNOWN_TOKEN", "QUOTE_BEGIN", 
			"QUOTE_END", "EXPRESSION_BEGIN", "EXPRESSION_END"
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
	public String getGrammarFileName() { return "ArchetypeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArchetypeGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArchetypeGrammar.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ArchetypeGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArchetypeGrammar.NEWLINE, i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			header();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				match(NEWLINE);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0)) {
				{
				{
				setState(30);
				node();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(31);
					match(NEWLINE);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(ArchetypeGrammar.TARGET, 0); }
		public TerminalNode COLON() { return getToken(ArchetypeGrammar.COLON, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ArchetypeGrammar.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ArchetypeGrammar.RIGHT_BRACKET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ArchetypeGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArchetypeGrammar.NEWLINE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArchetypeGrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArchetypeGrammar.IDENTIFIER, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(44);
				match(NEWLINE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(TARGET);
			setState(51);
			match(COLON);
			setState(52);
			match(LEFT_BRACKET);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				match(IDENTIFIER);
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(58);
			match(RIGHT_BRACKET);
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

	public static class NodeContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			declaration();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE_INDENT) {
				{
				setState(61);
				body();
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

	public static class DeclarationContext extends ParserRuleContext {
		public StartingContext starting() {
			return getRuleContext(StartingContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArchetypeGrammar.IDENTIFIER, 0); }
		public OwnerAndConsumerContext ownerAndConsumer() {
			return getRuleContext(OwnerAndConsumerContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SplittedContext splitted() {
			return getRuleContext(SplittedContext.class,0);
		}
		public TerminalNode IN() { return getToken(ArchetypeGrammar.IN, 0); }
		public List<TerminalNode> LABEL() { return getTokens(ArchetypeGrammar.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(ArchetypeGrammar.LABEL, i);
		}
		public TerminalNode WITH() { return getToken(ArchetypeGrammar.WITH, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			starting();
			setState(65);
			match(IDENTIFIER);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PARENTHESIS:
				{
				setState(66);
				parameters();
				}
				break;
			case SPLITTED:
				{
				setState(67);
				splitted();
				}
				break;
			case EOF:
			case IN:
			case WITH:
			case MINUS:
			case PLUS:
			case STAR:
			case OWNER:
			case CONSUMER:
			case NEWLINE:
			case NEW_LINE_INDENT:
				break;
			default:
				break;
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(70);
				match(IN);
				setState(71);
				match(LABEL);
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(74);
				match(WITH);
				setState(75);
				match(LABEL);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(76);
					type();
					}
				}

				}
			}

			setState(81);
			ownerAndConsumer();
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

	public static class StartingContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ArchetypeGrammar.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ArchetypeGrammar.PLUS, 0); }
		public TerminalNode STAR() { return getToken(ArchetypeGrammar.STAR, 0); }
		public StartingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterStarting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitStarting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitStarting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartingContext starting() throws RecognitionException {
		StartingContext _localctx = new StartingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_starting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0)) ) {
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ArchetypeGrammar.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ArchetypeGrammar.RIGHT_PARENTHESIS, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArchetypeGrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArchetypeGrammar.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LEFT_PARENTHESIS);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(86);
				parameter();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(87);
					match(COMMA);
					setState(88);
					parameter();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(96);
			match(RIGHT_PARENTHESIS);
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

	public static class SplittedContext extends ParserRuleContext {
		public TerminalNode SPLITTED() { return getToken(ArchetypeGrammar.SPLITTED, 0); }
		public TerminalNode LEFT_SQUARE() { return getToken(ArchetypeGrammar.LEFT_SQUARE, 0); }
		public TerminalNode RIGHT_SQUARE() { return getToken(ArchetypeGrammar.RIGHT_SQUARE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArchetypeGrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArchetypeGrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArchetypeGrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArchetypeGrammar.COMMA, i);
		}
		public SplittedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterSplitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitSplitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitSplitted(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplittedContext splitted() throws RecognitionException {
		SplittedContext _localctx = new SplittedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_splitted);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(SPLITTED);
			setState(99);
			match(LEFT_SQUARE);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(100);
				match(IDENTIFIER);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(101);
					match(COMMA);
					setState(102);
					match(IDENTIFIER);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(RIGHT_SQUARE);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArchetypeGrammar.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IDENTIFIER);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(113);
				type();
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode NEW_LINE_INDENT() { return getToken(ArchetypeGrammar.NEW_LINE_INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(ArchetypeGrammar.DEDENT, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ArchetypeGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArchetypeGrammar.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NEW_LINE_INDENT);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				node();
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					match(NEWLINE);
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0) );
			setState(127);
			match(DEDENT);
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
		public TerminalNode AS() { return getToken(ArchetypeGrammar.AS, 0); }
		public TerminalNode REGEX() { return getToken(ArchetypeGrammar.REGEX, 0); }
		public TerminalNode TIMETAG() { return getToken(ArchetypeGrammar.TIMETAG, 0); }
		public TerminalNode COLON() { return getToken(ArchetypeGrammar.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArchetypeGrammar.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(AS);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX:
				{
				setState(130);
				match(REGEX);
				}
				break;
			case TIMETAG:
				{
				{
				setState(131);
				match(TIMETAG);
				setState(132);
				match(COLON);
				setState(133);
				match(IDENTIFIER);
				}
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

	public static class OwnerAndConsumerContext extends ParserRuleContext {
		public TerminalNode OWNER() { return getToken(ArchetypeGrammar.OWNER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArchetypeGrammar.IDENTIFIER, 0); }
		public UsesContext uses() {
			return getRuleContext(UsesContext.class,0);
		}
		public OwnerAndConsumerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerAndConsumer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterOwnerAndConsumer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitOwnerAndConsumer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitOwnerAndConsumer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerAndConsumerContext ownerAndConsumer() throws RecognitionException {
		OwnerAndConsumerContext _localctx = new OwnerAndConsumerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ownerAndConsumer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNER) {
				{
				setState(136);
				match(OWNER);
				setState(137);
				match(IDENTIFIER);
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSUMER) {
				{
				setState(140);
				uses();
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

	public static class UsesContext extends ParserRuleContext {
		public TerminalNode CONSUMER() { return getToken(ArchetypeGrammar.CONSUMER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArchetypeGrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArchetypeGrammar.IDENTIFIER, i);
		}
		public UsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).enterUses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArchetypeGrammarListener ) ((ArchetypeGrammarListener)listener).exitUses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArchetypeGrammarVisitor ) return ((ArchetypeGrammarVisitor<? extends T>)visitor).visitUses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsesContext uses() throws RecognitionException {
		UsesContext _localctx = new UsesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_uses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CONSUMER);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				match(IDENTIFIER);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
		"\u0004\u0001\"\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000\u001c"+
		"\u0001\u0000\u0001\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000"+
		"\u0005\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00017\b\u0001\u000b\u0001"+
		"\f\u00018\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"E\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0003\u0003P\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0003\u0005"+
		"_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t\u0006"+
		"\u0003\u0006m\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007s\b\u0007\u0001\b\u0001\b\u0001\b\u0004\bx\b\b\u000b\b\f\b"+
		"y\u0004\b|\b\b\u000b\b\f\b}\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0087\b\t\u0001\n\u0001\n\u0003\n\u008b\b\n\u0001\n"+
		"\u0003\n\u008e\b\n\u0001\u000b\u0001\u000b\u0004\u000b\u0092\b\u000b\u000b"+
		"\u000b\f\u000b\u0093\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000\f\u000e\u009f"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004"+
		"<\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bS\u0001\u0000"+
		"\u0000\u0000\nU\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000e"+
		"p\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012\u0081\u0001"+
		"\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u008f\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u001b\u0005"+
		"\u0018\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\'\u0001\u0000\u0000\u0000\u001e\"\u0003\u0004"+
		"\u0002\u0000\u001f!\u0005\u0018\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u001e\u0001"+
		"\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,.\u0005"+
		"\u0018\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u000034\u0005\u0014"+
		"\u0000\u000046\u0005\t\u0000\u000057\u0005\u0017\u0000\u000065\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000;\u0003"+
		"\u0001\u0000\u0000\u0000<>\u0003\u0006\u0003\u0000=?\u0003\u0010\b\u0000"+
		">=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0005\u0001\u0000"+
		"\u0000\u0000@A\u0003\b\u0004\u0000AD\u0005\u0017\u0000\u0000BE\u0003\n"+
		"\u0005\u0000CE\u0003\f\u0006\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0001\u0000\u0000GI\u0005\u0016\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IO\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000"+
		"\u0000KM\u0005\u0016\u0000\u0000LN\u0003\u0012\t\u0000ML\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OJ\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0003"+
		"\u0014\n\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0007\u0000\u0000\u0000"+
		"T\t\u0001\u0000\u0000\u0000U^\u0005\u0005\u0000\u0000V[\u0003\u000e\u0007"+
		"\u0000WX\u0005\u000b\u0000\u0000XZ\u0003\u000e\u0007\u0000YW\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^V\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0006\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0003\u0000\u0000cl\u0005\u0007\u0000\u0000di\u0005\u0017\u0000\u0000"+
		"ef\u0005\u000b\u0000\u0000fh\u0005\u0017\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000ld\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0005\b\u0000\u0000o\r\u0001\u0000\u0000\u0000pr\u0005\u0017\u0000"+
		"\u0000qs\u0003\u0012\t\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000s\u000f\u0001\u0000\u0000\u0000t{\u0005\u001c\u0000\u0000uw\u0003"+
		"\u0004\u0002\u0000vx\u0005\u0018\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u001d\u0000\u0000\u0080\u0011"+
		"\u0001\u0000\u0000\u0000\u0081\u0086\u0005\u000f\u0000\u0000\u0082\u0087"+
		"\u0005\u0010\u0000\u0000\u0083\u0084\u0005\u0013\u0000\u0000\u0084\u0085"+
		"\u0005\u0014\u0000\u0000\u0085\u0087\u0005\u0017\u0000\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u0013"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089\u008b"+
		"\u0005\u0017\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0003\u0016\u000b\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0005\u0012\u0000\u0000\u0090\u0092\u0005\u0017\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u001c\"\'/8>DHMO[^ilry}\u0086\u008a\u008d"+
		"\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}