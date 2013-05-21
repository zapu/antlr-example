// Generated from src\jfk\jfkgrammar.g4 by ANTLR 4.0

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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, COMMENT=8, INT=9, 
		ID=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "'='", "';'", "'var'", "'ret'", "COMMENT", "INT", 
		"ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "INT", 
		"ID", "WS"
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
		case 7: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\rU\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\60\n\t\f\t\16\t"+
		"\63\13\t\3\t\5\t\66\n\t\3\t\3\t\3\t\3\t\3\t\7\t=\n\t\f\t\16\t@\13\t\3"+
		"\t\3\t\5\tD\n\t\3\t\3\t\3\n\6\nI\n\n\r\n\16\nJ\3\13\6\13N\n\13\r\13\16"+
		"\13O\3\f\3\f\3\f\3\f\3>\r\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\2\23\13\1\25\f\1\27\r\3\3\2\4\4\f\f\17\17\5\f\f\17\17\"\"Z\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3"+
		"\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r#\3\2\2\2\17"+
		"\'\3\2\2\2\21C\3\2\2\2\23H\3\2\2\2\25M\3\2\2\2\27Q\3\2\2\2\31\32\7+\2"+
		"\2\32\4\3\2\2\2\33\34\7.\2\2\34\6\3\2\2\2\35\36\7*\2\2\36\b\3\2\2\2\37"+
		" \7?\2\2 \n\3\2\2\2!\"\7=\2\2\"\f\3\2\2\2#$\7x\2\2$%\7c\2\2%&\7t\2\2&"+
		"\16\3\2\2\2\'(\7t\2\2()\7g\2\2)*\7v\2\2*\20\3\2\2\2+,\7\61\2\2,-\7\61"+
		"\2\2-\61\3\2\2\2.\60\n\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64\66\7\17\2\2\65\64\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\3\2\2\2\67D\7\f\2\289\7\61\2\29:\7,\2\2:>\3\2\2\2;=\13"+
		"\2\2\2<;\3\2\2\2=@\3\2\2\2>?\3\2\2\2><\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7"+
		",\2\2BD\7\61\2\2C+\3\2\2\2C8\3\2\2\2DE\3\2\2\2EF\b\t\2\2F\22\3\2\2\2G"+
		"I\4\62;\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\24\3\2\2\2LN\4c|\2"+
		"ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\26\3\2\2\2QR\t\3\2\2RS\3\2\2"+
		"\2ST\b\f\3\2T\30\3\2\2\2\t\2\61\65>CJO";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}