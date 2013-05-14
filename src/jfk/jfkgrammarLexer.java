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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, COMMENT=7, INT=8, ID=9, 
		WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'int'", "'='", "';'", "'float'", "'var'", "'ret'", "COMMENT", "INT", 
		"ID", "WS"
	};
	public static final String[] ruleNames = {
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
		case 6: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 9: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\fW\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\62\n\b"+
		"\f\b\16\b\65\13\b\3\b\5\b8\n\b\3\b\3\b\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB"+
		"\13\b\3\b\3\b\5\bF\n\b\3\b\3\b\3\t\6\tK\n\t\r\t\16\tL\3\n\6\nP\n\n\r\n"+
		"\16\nQ\3\13\3\13\3\13\3\13\3@\f\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\2\21\n\1\23\13\1\25\f\3\3\2\4\4\f\f\17\17\5\f\f\17\17\"\"\\\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\33\3\2"+
		"\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13%\3\2\2\2\r)\3\2\2\2\17E\3\2\2\2\21J"+
		"\3\2\2\2\23O\3\2\2\2\25S\3\2\2\2\27\30\7k\2\2\30\31\7p\2\2\31\32\7v\2"+
		"\2\32\4\3\2\2\2\33\34\7?\2\2\34\6\3\2\2\2\35\36\7=\2\2\36\b\3\2\2\2\37"+
		" \7h\2\2 !\7n\2\2!\"\7q\2\2\"#\7c\2\2#$\7v\2\2$\n\3\2\2\2%&\7x\2\2&\'"+
		"\7c\2\2\'(\7t\2\2(\f\3\2\2\2)*\7t\2\2*+\7g\2\2+,\7v\2\2,\16\3\2\2\2-."+
		"\7\61\2\2./\7\61\2\2/\63\3\2\2\2\60\62\n\2\2\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\668\7\17"+
		"\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29F\7\f\2\2:;\7\61\2\2;<\7,\2\2"+
		"<@\3\2\2\2=?\13\2\2\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2\2@>\3\2\2\2AC\3\2\2"+
		"\2B@\3\2\2\2CD\7,\2\2DF\7\61\2\2E-\3\2\2\2E:\3\2\2\2FG\3\2\2\2GH\b\b\2"+
		"\2H\20\3\2\2\2IK\4\62;\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\22\3"+
		"\2\2\2NP\4c|\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\24\3\2\2\2ST\t"+
		"\3\2\2TU\3\2\2\2UV\b\13\3\2V\26\3\2\2\2\t\2\63\67@ELQ";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}