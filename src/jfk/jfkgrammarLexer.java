// Generated from jfkgrammar.g4 by ANTLR 4.0

package jfk;
import jfk.Compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jfkgrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, COMMENT=16, INT=17, 
		ID=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'+'", "'*'", "'-'", "'('", "'int'", "'='", "';'", "'var'", 
		"'def'", "'{'", "'/'", "'}'", "'float'", "COMMENT", "INT", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "INT", "ID", 
		"WS"
	};


	public jfkgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jfkgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 15: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\25{\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21V\n\21\f\21\16\21Y\13\21\3\21\5\21\\\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21c\n\21\f\21\16\21f\13\21\3\21\3\21\5\21"+
		"j\n\21\3\21\3\21\3\22\6\22o\n\22\r\22\16\22p\3\23\6\23t\n\23\r\23\16\23"+
		"u\3\24\3\24\3\24\3\24\3d\25\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\2"+
		"#\23\1%\24\1\'\25\3\3\2\4\4\f\f\17\17\5\f\f\17\17\"\"\u0080\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2"+
		"\2\2\r\63\3\2\2\2\17\65\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27"+
		"A\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35I\3\2\2\2\37K\3\2\2\2!i\3\2\2\2#n"+
		"\3\2\2\2%s\3\2\2\2\'w\3\2\2\2)*\7+\2\2*\4\3\2\2\2+,\7.\2\2,\6\3\2\2\2"+
		"-.\7-\2\2.\b\3\2\2\2/\60\7,\2\2\60\n\3\2\2\2\61\62\7/\2\2\62\f\3\2\2\2"+
		"\63\64\7*\2\2\64\16\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28\20\3"+
		"\2\2\29:\7?\2\2:\22\3\2\2\2;<\7=\2\2<\24\3\2\2\2=>\7x\2\2>?\7c\2\2?@\7"+
		"t\2\2@\26\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7h\2\2D\30\3\2\2\2EF\7}\2\2F\32"+
		"\3\2\2\2GH\7\61\2\2H\34\3\2\2\2IJ\7\177\2\2J\36\3\2\2\2KL\7h\2\2LM\7n"+
		"\2\2MN\7q\2\2NO\7c\2\2OP\7v\2\2P \3\2\2\2QR\7\61\2\2RS\7\61\2\2SW\3\2"+
		"\2\2TV\n\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2Z\\\7\17\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]j\7\f\2\2^_\7\61\2\2"+
		"_`\7,\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2"+
		"eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hj\7\61\2\2iQ\3\2\2\2i^\3\2\2\2jk\3\2\2\2"+
		"kl\b\21\2\2l\"\3\2\2\2mo\4\62;\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2q$\3\2\2\2rt\4c|\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v&\3\2\2\2"+
		"wx\t\3\2\2xy\3\2\2\2yz\b\24\3\2z(\3\2\2\2\t\2W[dipu";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}