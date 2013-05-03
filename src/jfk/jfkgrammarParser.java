// Generated from jfkgrammar.g4 by ANTLR 4.0

package jfk;
import jfk.Compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jfkgrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, INT=16, ID=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'*'", "'-'", "'('", "'int'", "'='", 
		"';'", "'var'", "'def'", "'{'", "'/'", "'}'", "'float'", "INT", "ID", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_program_block = 1, RULE_body = 2, RULE_function = 3, 
		RULE_statement = 4, RULE_invocation = 5, RULE_expression = 6, RULE_ar_expression = 7, 
		RULE_mult_expression = 8, RULE_expression_atom = 9, RULE_assignment = 10, 
		RULE_variable_definition = 11, RULE_type = 12;
	public static final String[] ruleNames = {
		"program", "program_block", "body", "function", "statement", "invocation", 
		"expression", "ar_expression", "mult_expression", "expression_atom", "assignment", 
		"variable_definition", "type"
	};

	@Override
	public String getGrammarFileName() { return "jfkgrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public jfkgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program_blockContext program_block(int i) {
			return getRuleContext(Program_blockContext.class,i);
		}
		public List<Program_blockContext> program_block() {
			return getRuleContexts(Program_blockContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(26); match(9);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 10) | (1L << 11) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(32); program_block();
				}
				}
				setState(37);
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

	public static class Program_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Program_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterProgram_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitProgram_block(this);
		}
	}

	public final Program_blockContext program_block() throws RecognitionException {
		Program_blockContext _localctx = new Program_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_block);
		int _la;
		try {
			setState(51);
			switch (_input.LA(1)) {
			case 6:
			case 10:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(38); statement();
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39); match(9);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==9 );
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(44); function();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(45); match(9);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(12);
			setState(77);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 10) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(54); match(9);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60); statement();
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(62); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(61); match(9);
							}
							}
							setState(64); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==9 );
						setState(66); statement();
						}
						} 
					}
					setState(71);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72); match(9);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==9 );
				}
			}

			setState(79); match(14);
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

	public static class FunctionContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(jfkgrammarParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(jfkgrammarParser.ID); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(11);
			setState(82); match(ID);
			setState(83); match(6);
			setState(92);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(84); match(ID);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(85); match(2);
					setState(86); match(ID);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94); match(1);
			setState(95); body();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); invocation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); variable_definition();
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

	public static class InvocationContext extends ParserRuleContext {
		public Token ID;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jfkgrammarParser.ID, 0); }
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitInvocation(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ((InvocationContext)_localctx).ID = match(ID);
			setState(103); match(6);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(104); expression();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(105); match(2);
					setState(106); expression();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(114); match(1);
			System.out.println("inv: " + (((InvocationContext)_localctx).ID!=null?((InvocationContext)_localctx).ID.getText():null)); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Ar_expressionContext ar_expression() {
			return getRuleContext(Ar_expressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode INT() { return getToken(jfkgrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(jfkgrammarParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(INT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); ar_expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); assignment();
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

	public static class Ar_expressionContext extends ParserRuleContext {
		public Mult_expressionContext mult_expression(int i) {
			return getRuleContext(Mult_expressionContext.class,i);
		}
		public List<Mult_expressionContext> mult_expression() {
			return getRuleContexts(Mult_expressionContext.class);
		}
		public Ar_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ar_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterAr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitAr_expression(this);
		}
	}

	public final Ar_expressionContext ar_expression() throws RecognitionException {
		Ar_expressionContext _localctx = new Ar_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ar_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); mult_expression();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==5) {
				{
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(125); mult_expression();
				}
				}
				setState(130);
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

	public static class Mult_expressionContext extends ParserRuleContext {
		public Expression_atomContext expression_atom(int i) {
			return getRuleContext(Expression_atomContext.class,i);
		}
		public List<Expression_atomContext> expression_atom() {
			return getRuleContexts(Expression_atomContext.class);
		}
		public Mult_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterMult_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitMult_expression(this);
		}
	}

	public final Mult_expressionContext mult_expression() throws RecognitionException {
		Mult_expressionContext _localctx = new Mult_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mult_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); expression_atom();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==13) {
				{
				{
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(133); expression_atom();
				}
				}
				setState(138);
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

	public static class Expression_atomContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT() { return getToken(jfkgrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(jfkgrammarParser.ID, 0); }
		public Expression_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterExpression_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitExpression_atom(this);
		}
	}

	public final Expression_atomContext expression_atom() throws RecognitionException {
		Expression_atomContext _localctx = new Expression_atomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression_atom);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(141); match(6);
				setState(142); expression();
				setState(143); match(1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(jfkgrammarParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(ID);
			setState(148); match(8);
			setState(149); expression();
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public Compiler.VariableDefinition val;
		public Token name;
		public TerminalNode ID() { return getToken(jfkgrammarParser.ID, 0); }
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterVariable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitVariable_definition(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(10);
			setState(152); ((Variable_definitionContext)_localctx).name = match(ID);
			 ((Variable_definitionContext)_localctx).val =  new Compiler.VariableDefinition((((Variable_definitionContext)_localctx).name!=null?((Variable_definitionContext)_localctx).name.getText():null)); 
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==15) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3\24\u00a0\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f"+
		"\2\16\2!\13\2\3\2\7\2$\n\2\f\2\16\2\'\13\2\3\3\3\3\6\3+\n\3\r\3\16\3,"+
		"\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3\5\3\66\n\3\3\4\3\4\7\4:\n\4\f\4\16"+
		"\4=\13\4\3\4\3\4\6\4A\n\4\r\4\16\4B\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\6"+
		"\4L\n\4\r\4\16\4M\5\4P\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5Z\n\5\f"+
		"\5\16\5]\13\5\5\5_\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\7\7n\n\7\f\7\16\7q\13\7\5\7s\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5"+
		"\b|\n\b\3\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084\13\t\3\n\3\n\3\n\7\n"+
		"\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0094"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\5\4\5\5\7\7\4\6\6\17\17\4\t\t\21\21\u00a9\2\37"+
		"\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bS\3\2\2\2\nf\3\2\2\2\fh\3\2\2\2\16"+
		"{\3\2\2\2\20}\3\2\2\2\22\u0085\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2"+
		"\2\30\u0099\3\2\2\2\32\u009d\3\2\2\2\34\36\7\13\2\2\35\34\3\2\2\2\36!"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\4\3\2#\""+
		"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2(*\5\n\6"+
		"\2)+\7\13\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\66\3\2\2\2.\62"+
		"\5\b\5\2/\61\7\13\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65(\3\2\2\2\65.\3\2\2\2\66\5\3\2\2"+
		"\2\67O\7\16\2\28:\7\13\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3"+
		"\2\2\2=;\3\2\2\2>G\5\n\6\2?A\7\13\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC"+
		"\3\2\2\2CD\3\2\2\2DF\5\n\6\2E@\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H"+
		"K\3\2\2\2IG\3\2\2\2JL\7\13\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2O;\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\20\2\2R\7\3\2\2\2ST\7\r\2"+
		"\2TU\7\23\2\2U^\7\b\2\2V[\7\23\2\2WX\7\4\2\2XZ\7\23\2\2YW\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^V\3\2\2\2^_\3\2\2\2_"+
		"`\3\2\2\2`a\7\3\2\2ab\5\6\4\2b\t\3\2\2\2cg\5\f\7\2dg\5\16\b\2eg\5\30\r"+
		"\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hi\7\23\2\2ir\7\b\2\2jo\5"+
		"\16\b\2kl\7\4\2\2ln\5\16\b\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p"+
		"s\3\2\2\2qo\3\2\2\2rj\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\3\2\2uv\b\7\1\2"+
		"v\r\3\2\2\2w|\7\22\2\2x|\7\23\2\2y|\5\20\t\2z|\5\26\f\2{w\3\2\2\2{x\3"+
		"\2\2\2{y\3\2\2\2{z\3\2\2\2|\17\3\2\2\2}\u0082\5\22\n\2~\177\t\2\2\2\177"+
		"\u0081\5\22\n\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a"+
		"\5\24\13\2\u0086\u0087\t\3\2\2\u0087\u0089\5\24\13\2\u0088\u0086\3\2\2"+
		"\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0094\7\22\2\2\u008e\u0094\7\23\2\2"+
		"\u008f\u0090\7\b\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\3\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0094"+
		"\25\3\2\2\2\u0095\u0096\7\23\2\2\u0096\u0097\7\n\2\2\u0097\u0098\5\16"+
		"\b\2\u0098\27\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\7\23\2\2\u009b\u009c"+
		"\b\r\1\2\u009c\31\3\2\2\2\u009d\u009e\t\4\2\2\u009e\33\3\2\2\2\25\37%"+
		",\62\65;BGMO[^for{\u0082\u008a\u0093";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}