// Generated from C:/Users/rodrigo_kassick/IdeaProjects/Test1\TestGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAME=1, LPAREN=2, RPAREN=3;
	public static final int
		RULE_sexpr = 0, RULE_slist = 1;
	public static final String[] ruleNames = {
		"sexpr", "slist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAME", "LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "TestGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SexprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TestGrammarParser.LPAREN, 0); }
		public TerminalNode NAME() { return getToken(TestGrammarParser.NAME, 0); }
		public SlistContext slist() {
			return getRuleContext(SlistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TestGrammarParser.RPAREN, 0); }
		public SexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterSexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitSexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitSexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexprContext sexpr() throws RecognitionException {
		SexprContext _localctx = new SexprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(LPAREN);
			setState(5);
			match(NAME);
			setState(6);
			slist();
			setState(7);
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

	public static class SlistContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TestGrammarParser.NAME, 0); }
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public SlistContext slist() {
			return getRuleContext(SlistContext.class,0);
		}
		public SlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterSlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitSlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitSlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlistContext slist() throws RecognitionException {
		SlistContext _localctx = new SlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_slist);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(NAME);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				sexpr();
				setState(11);
				slist();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 3);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\23\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\21\n\3\3\3\2\2\4\2\4"+
		"\2\2\2\22\2\6\3\2\2\2\4\20\3\2\2\2\6\7\7\4\2\2\7\b\7\3\2\2\b\t\5\4\3\2"+
		"\t\n\7\5\2\2\n\3\3\2\2\2\13\21\7\3\2\2\f\r\5\2\2\2\r\16\5\4\3\2\16\21"+
		"\3\2\2\2\17\21\3\2\2\2\20\13\3\2\2\2\20\f\3\2\2\2\20\17\3\2\2\2\21\5\3"+
		"\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}