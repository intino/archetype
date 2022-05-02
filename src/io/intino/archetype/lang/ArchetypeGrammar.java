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
			null, "'in'", "'with'", "'splitted'", "'target'", "'('", "')'", "'['", 
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(25);
				match(NEWLINE);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0)) {
				{
				{
				setState(31);
				node();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(32);
					match(NEWLINE);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
			setState(45);
			match(TARGET);
			setState(46);
			match(COLON);
			setState(47);
			match(LEFT_BRACKET);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(IDENTIFIER);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(53);
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
			setState(55);
			declaration();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE_INDENT) {
				{
				setState(56);
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
			setState(59);
			starting();
			setState(60);
			match(IDENTIFIER);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PARENTHESIS:
				{
				setState(61);
				parameters();
				}
				break;
			case SPLITTED:
				{
				setState(62);
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(65);
				match(IN);
				setState(66);
				match(LABEL);
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(69);
				match(WITH);
				setState(70);
				match(LABEL);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(71);
					type();
					}
				}

				}
			}

			setState(76);
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
			setState(78);
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
			setState(80);
			match(LEFT_PARENTHESIS);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(81);
				parameter();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(82);
					match(COMMA);
					setState(83);
					parameter();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(91);
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
			setState(93);
			match(SPLITTED);
			setState(94);
			match(LEFT_SQUARE);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(95);
				match(IDENTIFIER);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					match(IDENTIFIER);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
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
			setState(107);
			match(IDENTIFIER);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(108);
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
			setState(111);
			match(NEW_LINE_INDENT);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				node();
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(NEWLINE);
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << STAR))) != 0) );
			setState(122);
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
			setState(124);
			match(AS);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEX:
				{
				setState(125);
				match(REGEX);
				}
				break;
			case TIMETAG:
				{
				{
				setState(126);
				match(TIMETAG);
				setState(127);
				match(COLON);
				setState(128);
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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNER) {
				{
				setState(131);
				match(OWNER);
				setState(132);
				match(IDENTIFIER);
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSUMER) {
				{
				setState(135);
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
			setState(138);
			match(CONSUMER);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(IDENTIFIER);
				}
				}
				setState(142); 
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
		"\u0004\u0001\"\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00012\b\u0001"+
		"\u000b\u0001\f\u00013\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0003\u0003K\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005"+
		"\u0003\u0005Z\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006"+
		"f\t\u0006\u0003\u0006h\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b\u0004\bs\b\b\u000b"+
		"\b\f\bt\u0004\bw\b\b\u000b\b\f\bx\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001\n\u0001\n\u0003\n\u0086\b\n"+
		"\u0001\n\u0003\n\u0089\b\n\u0001\u000b\u0001\u000b\u0004\u000b\u008d\b"+
		"\u000b\u000b\u000b\f\u000b\u008e\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000"+
		"\f\u000e\u0099\u0000\u0018\u0001\u0000\u0000\u0000\u0002-\u0001\u0000"+
		"\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000"+
		"\bN\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\f]\u0001\u0000"+
		"\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000"+
		"\u0012|\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016"+
		"\u008a\u0001\u0000\u0000\u0000\u0018\u001c\u0003\u0002\u0001\u0000\u0019"+
		"\u001b\u0005\u0018\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d(\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001f#\u0003\u0004\u0002\u0000 \"\u0005\u0018"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\u001f\u0001\u0000\u0000\u0000\'*\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001"+
		",\u0001\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005\u0014"+
		"\u0000\u0000/1\u0005\t\u0000\u000002\u0005\u0017\u0000\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005\n\u0000\u00006\u0003"+
		"\u0001\u0000\u0000\u000079\u0003\u0006\u0003\u00008:\u0003\u0010\b\u0000"+
		"98\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0005\u0001\u0000"+
		"\u0000\u0000;<\u0003\b\u0004\u0000<?\u0005\u0017\u0000\u0000=@\u0003\n"+
		"\u0005\u0000>@\u0003\f\u0006\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0001\u0000\u0000BD\u0005\u0016\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DJ\u0001\u0000\u0000\u0000EF\u0005\u0002\u0000"+
		"\u0000FH\u0005\u0016\u0000\u0000GI\u0003\u0012\t\u0000HG\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JE\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0003"+
		"\u0014\n\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000\u0000"+
		"O\t\u0001\u0000\u0000\u0000PY\u0005\u0005\u0000\u0000QV\u0003\u000e\u0007"+
		"\u0000RS\u0005\u000b\u0000\u0000SU\u0003\u000e\u0007\u0000TR\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YQ\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0006\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0003\u0000\u0000^g\u0005\u0007\u0000\u0000_d\u0005\u0017\u0000\u0000"+
		"`a\u0005\u000b\u0000\u0000ac\u0005\u0017\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000g_\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0005\b\u0000\u0000j\r\u0001\u0000\u0000\u0000km\u0005\u0017\u0000"+
		"\u0000ln\u0003\u0012\t\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u000f\u0001\u0000\u0000\u0000ov\u0005\u001c\u0000\u0000pr\u0003"+
		"\u0004\u0002\u0000qs\u0005\u0018\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0005\u001d\u0000\u0000{\u0011\u0001\u0000\u0000"+
		"\u0000|\u0081\u0005\u000f\u0000\u0000}\u0082\u0005\u0010\u0000\u0000~"+
		"\u007f\u0005\u0013\u0000\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080"+
		"\u0082\u0005\u0017\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\u0011\u0000\u0000\u0084\u0086\u0005\u0017\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003\u0016\u000b\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0015\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0005\u0012\u0000\u0000\u008b\u008d\u0005"+
		"\u0017\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0014\u001c#(3"+
		"9?CHJVYdgmtx\u0081\u0085\u0088\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}