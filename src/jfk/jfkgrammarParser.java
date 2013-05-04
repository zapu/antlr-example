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
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, COMMENT=16, INT=17, 
		ID=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "','", "'+'", "'*'", "'-'", "'('", "'int'", "'='", 
		"';'", "'var'", "'def'", "'{'", "'/'", "'}'", "'float'", "COMMENT", "INT", 
		"ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_statement = 3, 
		RULE_invocation = 4, RULE_expression = 5, RULE_ar_expression = 6, RULE_mult_expression = 7, 
		RULE_expression_atom = 8, RULE_assignment = 9, RULE_variable_definition = 10, 
		RULE_type = 11;
	public static final String[] ruleNames = {
		"program", "body", "function", "statement", "invocation", "expression", 
		"ar_expression", "mult_expression", "expression_atom", "assignment", "variable_definition", 
		"type"
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
		public Compiler.Program val;
		public StatementContext statement;
		public FunctionContext function;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
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
			 ((ProgramContext)_localctx).val =  new Compiler.Program(); 
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==9) {
				{
				{
				setState(25); match(9);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 10) | (1L << 11) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(48);
				switch (_input.LA(1)) {
				case 6:
				case 10:
				case INT:
				case ID:
					{
					{
					setState(31); ((ProgramContext)_localctx).statement = statement();
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(32); match(9);
						}
						}
						setState(35); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==9 );
					}
					 _localctx.val.statements.add(((ProgramContext)_localctx).statement.val); 
					}
					break;
				case 11:
					{
					{
					setState(39); ((ProgramContext)_localctx).function = function();
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==9) {
						{
						{
						setState(40); match(9);
						}
						}
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					 _localctx.val.functions.add(((ProgramContext)_localctx).function.val); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
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

	public static class BodyContext extends ParserRuleContext {
		public Compiler.Body val;
		public StatementContext a;
		public StatementContext b;
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
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(12);
			setState(80);
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
				setState(60); ((BodyContext)_localctx).a = statement();
				 ((BodyContext)_localctx).val =  new Compiler.Body(); _localctx.val.add(((BodyContext)_localctx).a.val); 
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(63); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(62); match(9);
							}
							}
							setState(65); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==9 );
						setState(67); ((BodyContext)_localctx).b = statement();
						 _localctx.val.add(((BodyContext)_localctx).b.val); 
						}
						} 
					}
					setState(74);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75); match(9);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==9 );
				}
			}

			setState(82); match(14);
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
		public Compiler.Function val;
		public Token name;
		public Token arg1;
		public Token arg2;
		public BodyContext body;
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
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(11);
			setState(85); ((FunctionContext)_localctx).name = match(ID);
			 ((FunctionContext)_localctx).val =  new Compiler.Function((((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null)); 
			setState(87); match(6);
			setState(98);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88); ((FunctionContext)_localctx).arg1 = match(ID);
				 _localctx.val.addArg((((FunctionContext)_localctx).arg1!=null?((FunctionContext)_localctx).arg1.getText():null)); 
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(90); match(2);
					setState(91); ((FunctionContext)_localctx).arg2 = match(ID);
					 _localctx.val.addArg((((FunctionContext)_localctx).arg2!=null?((FunctionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100); match(1);
			setState(101); ((FunctionContext)_localctx).body = body();
			 _localctx.val.setBody(((FunctionContext)_localctx).body.val); 
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
		public Compiler.Statement val;
		public InvocationContext a;
		public ExpressionContext b;
		public Variable_definitionContext c;
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); ((StatementContext)_localctx).a = invocation();
				((StatementContext)_localctx).val =  new Compiler.StatementExpression(((StatementContext)_localctx).a.val); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); ((StatementContext)_localctx).b = expression();
				((StatementContext)_localctx).val =  new Compiler.StatementExpression(((StatementContext)_localctx).b.val); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); ((StatementContext)_localctx).c = variable_definition();
				 ((StatementContext)_localctx).val =  ((StatementContext)_localctx).c.val; 
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
		public Compiler.Invocation val;
		public Token a;
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		enterRule(_localctx, 8, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); ((InvocationContext)_localctx).a = match(ID);
			setState(116); match(6);
			 ((InvocationContext)_localctx).val =  new Compiler.Invocation((((InvocationContext)_localctx).a!=null?((InvocationContext)_localctx).a.getText():null)); 
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(118); ((InvocationContext)_localctx).e1 = expression();
				 _localctx.val.addParam(((InvocationContext)_localctx).e1.val); 
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(120); match(2);
					setState(121); ((InvocationContext)_localctx).e2 = expression();
					 _localctx.val.addParam(((InvocationContext)_localctx).e2.val); 
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131); match(1);
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
		public Compiler.Expression val;
		public Token a;
		public Ar_expressionContext b;
		public InvocationContext c;
		public AssignmentContext d;
		public Ar_expressionContext ar_expression() {
			return getRuleContext(Ar_expressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode INT() { return getToken(jfkgrammarParser.INT, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); ((ExpressionContext)_localctx).a = match(INT);
				 ((ExpressionContext)_localctx).val =  new Compiler.IntExpression((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); ((ExpressionContext)_localctx).a = match(ID);
				 ((ExpressionContext)_localctx).val =  new Compiler.Reference((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); ((ExpressionContext)_localctx).b = ar_expression();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).b.val; 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); ((ExpressionContext)_localctx).c = invocation();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).c.val; 
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143); ((ExpressionContext)_localctx).d = assignment();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).d.val; 
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
		public Compiler.ArExpression val;
		public Mult_expressionContext a;
		public Mult_expressionContext b;
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
		enterRule(_localctx, 12, RULE_ar_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); ((Ar_expressionContext)_localctx).a = mult_expression();
			 ((Ar_expressionContext)_localctx).val =  new Compiler.ArExpression(((Ar_expressionContext)_localctx).a.val); 
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==5) {
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==3 || _la==5) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(151); ((Ar_expressionContext)_localctx).b = mult_expression();
				 _localctx.val.add(((Ar_expressionContext)_localctx).b.val); 
				}
				}
				setState(158);
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
		public Compiler.ArExpression val;
		public Expression_atomContext a;
		public Expression_atomContext b;
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
		enterRule(_localctx, 14, RULE_mult_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); ((Mult_expressionContext)_localctx).a = expression_atom();
			 ((Mult_expressionContext)_localctx).val =  new Compiler.ArExpression(((Mult_expressionContext)_localctx).a.val); 
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==13) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(162); ((Mult_expressionContext)_localctx).b = expression_atom();
				 _localctx.val.add(((Mult_expressionContext)_localctx).b.val); 
				}
				}
				setState(169);
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
		public Compiler.Expression val;
		public Token a;
		public ExpressionContext expression;
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
		enterRule(_localctx, 16, RULE_expression_atom);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); ((Expression_atomContext)_localctx).a = match(INT);
				 ((Expression_atomContext)_localctx).val =  new Compiler.IntExpression((((Expression_atomContext)_localctx).a!=null?((Expression_atomContext)_localctx).a.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); ((Expression_atomContext)_localctx).a = match(ID);
				 ((Expression_atomContext)_localctx).val =  new Compiler.Reference((((Expression_atomContext)_localctx).a!=null?((Expression_atomContext)_localctx).a.getText():null)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(174); match(6);
				setState(175); ((Expression_atomContext)_localctx).expression = expression();
				setState(176); match(1);
				 ((Expression_atomContext)_localctx).val =  ((Expression_atomContext)_localctx).expression.val; 
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
		public Compiler.Assignment val;
		public Token to;
		public ExpressionContext what;
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); ((AssignmentContext)_localctx).to = match(ID);
			setState(182); match(8);
			setState(183); ((AssignmentContext)_localctx).what = expression();
			 ((AssignmentContext)_localctx).val =  new Compiler.Assignment((((AssignmentContext)_localctx).to!=null?((AssignmentContext)_localctx).to.getText():null), ((AssignmentContext)_localctx).what.val); 
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
		enterRule(_localctx, 20, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(10);
			setState(187); ((Variable_definitionContext)_localctx).name = match(ID);
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		"\2\3\25\u00c3\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2"+
		" \13\2\3\2\3\2\6\2$\n\2\r\2\16\2%\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13"+
		"\2\3\2\3\2\7\2\63\n\2\f\2\16\2\66\13\2\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3"+
		"\3\3\3\3\3\3\6\3B\n\3\r\3\16\3C\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3"+
		"\3\6\3O\n\3\r\3\16\3P\5\3S\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4`\n\4\f\4\16\4c\13\4\5\4e\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\177\n\6\f\6\16\6\u0082\13\6\5\6\u0084\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a8\n"+
		"\t\f\t\16\t\u00ab\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\16\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\2\5\4\5\5\7\7\4\6\6\17\17\4\t\t\21\21\u00ce\2\32"+
		"\3\2\2\2\4\67\3\2\2\2\6V\3\2\2\2\bs\3\2\2\2\nu\3\2\2\2\f\u0094\3\2\2\2"+
		"\16\u0096\3\2\2\2\20\u00a1\3\2\2\2\22\u00b5\3\2\2\2\24\u00b7\3\2\2\2\26"+
		"\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\36\b\2\1\2\33\35\7\13\2\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\64\3\2\2\2 \36\3\2\2\2"+
		"!#\5\b\5\2\"$\7\13\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2"+
		"\2\2\'(\b\2\1\2(\63\3\2\2\2)-\5\6\4\2*,\7\13\2\2+*\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\b\2\1\2\61\63\3\2\2\2"+
		"\62!\3\2\2\2\62)\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\3\3\2\2\2\66\64\3\2\2\2\67R\7\16\2\28:\7\13\2\298\3\2\2\2:=\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5\b\5\2?J\b\3\1\2@B\7\13\2\2"+
		"A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\b\5\2FG\b\3\1\2"+
		"GI\3\2\2\2HA\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2"+
		"MO\7\13\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2R;\3\2\2"+
		"\2RS\3\2\2\2ST\3\2\2\2TU\7\20\2\2U\5\3\2\2\2VW\7\r\2\2WX\7\24\2\2XY\b"+
		"\4\1\2Yd\7\b\2\2Z[\7\24\2\2[a\b\4\1\2\\]\7\4\2\2]^\7\24\2\2^`\b\4\1\2"+
		"_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2dZ\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fg\7\3\2\2gh\5\4\3\2hi\b\4\1\2i\7\3\2\2\2jk\5\n"+
		"\6\2kl\b\5\1\2lt\3\2\2\2mn\5\f\7\2no\b\5\1\2ot\3\2\2\2pq\5\26\f\2qr\b"+
		"\5\1\2rt\3\2\2\2sj\3\2\2\2sm\3\2\2\2sp\3\2\2\2t\t\3\2\2\2uv\7\24\2\2v"+
		"w\7\b\2\2w\u0083\b\6\1\2xy\5\f\7\2y\u0080\b\6\1\2z{\7\4\2\2{|\5\f\7\2"+
		"|}\b\6\1\2}\177\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083x\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\3\2\2\u0086\13"+
		"\3\2\2\2\u0087\u0088\7\23\2\2\u0088\u0095\b\7\1\2\u0089\u008a\7\24\2\2"+
		"\u008a\u0095\b\7\1\2\u008b\u008c\5\16\b\2\u008c\u008d\b\7\1\2\u008d\u0095"+
		"\3\2\2\2\u008e\u008f\5\n\6\2\u008f\u0090\b\7\1\2\u0090\u0095\3\2\2\2\u0091"+
		"\u0092\5\24\13\2\u0092\u0093\b\7\1\2\u0093\u0095\3\2\2\2\u0094\u0087\3"+
		"\2\2\2\u0094\u0089\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008e\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097\5\20\t\2\u0097\u009e\b\b\1"+
		"\2\u0098\u0099\t\2\2\2\u0099\u009a\5\20\t\2\u009a\u009b\b\b\1\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\17\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2"+
		"\5\22\n\2\u00a2\u00a9\b\t\1\2\u00a3\u00a4\t\3\2\2\u00a4\u00a5\5\22\n\2"+
		"\u00a5\u00a6\b\t\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\21\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00b6\b\n\1\2\u00ae\u00af\7"+
		"\24\2\2\u00af\u00b6\b\n\1\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5\f\7\2\u00b2"+
		"\u00b3\7\3\2\2\u00b3\u00b4\b\n\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b8"+
		"\7\24\2\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba\5\f\7\2\u00ba\u00bb\b\13\1\2"+
		"\u00bb\25\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\7\24\2\2\u00be\u00bf"+
		"\b\f\1\2\u00bf\27\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1\31\3\2\2\2\25\36%"+
		"-\62\64;CJPRads\u0080\u0083\u0094\u009e\u00a9\u00b5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}