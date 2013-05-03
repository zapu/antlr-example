// Generated from jfkgrammar.g4 by ANTLR 4.0

package jfk;
import jfk.Compiler;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class jfkgrammarBaseListener implements jfkgrammarListener {
	@Override public void enterExpression(jfkgrammarParser.ExpressionContext ctx) { }
	@Override public void exitExpression(jfkgrammarParser.ExpressionContext ctx) { }

	@Override public void enterStatement(jfkgrammarParser.StatementContext ctx) { }
	@Override public void exitStatement(jfkgrammarParser.StatementContext ctx) { }

	@Override public void enterAr_expression(jfkgrammarParser.Ar_expressionContext ctx) { }
	@Override public void exitAr_expression(jfkgrammarParser.Ar_expressionContext ctx) { }

	@Override public void enterBody(jfkgrammarParser.BodyContext ctx) { }
	@Override public void exitBody(jfkgrammarParser.BodyContext ctx) { }

	@Override public void enterAssignment(jfkgrammarParser.AssignmentContext ctx) { }
	@Override public void exitAssignment(jfkgrammarParser.AssignmentContext ctx) { }

	@Override public void enterVariable_definition(jfkgrammarParser.Variable_definitionContext ctx) { }
	@Override public void exitVariable_definition(jfkgrammarParser.Variable_definitionContext ctx) { }

	@Override public void enterProgram(jfkgrammarParser.ProgramContext ctx) { }
	@Override public void exitProgram(jfkgrammarParser.ProgramContext ctx) { }

	@Override public void enterInvocation(jfkgrammarParser.InvocationContext ctx) { }
	@Override public void exitInvocation(jfkgrammarParser.InvocationContext ctx) { }

	@Override public void enterMult_expression(jfkgrammarParser.Mult_expressionContext ctx) { }
	@Override public void exitMult_expression(jfkgrammarParser.Mult_expressionContext ctx) { }

	@Override public void enterType(jfkgrammarParser.TypeContext ctx) { }
	@Override public void exitType(jfkgrammarParser.TypeContext ctx) { }

	@Override public void enterExpression_atom(jfkgrammarParser.Expression_atomContext ctx) { }
	@Override public void exitExpression_atom(jfkgrammarParser.Expression_atomContext ctx) { }

	@Override public void enterProgram_block(jfkgrammarParser.Program_blockContext ctx) { }
	@Override public void exitProgram_block(jfkgrammarParser.Program_blockContext ctx) { }

	@Override public void enterFunction(jfkgrammarParser.FunctionContext ctx) { }
	@Override public void exitFunction(jfkgrammarParser.FunctionContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}