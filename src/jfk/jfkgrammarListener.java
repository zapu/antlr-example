// Generated from jfkgrammar.g4 by ANTLR 4.0

package jfk;
import jfk.Compiler;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface jfkgrammarListener extends ParseTreeListener {
	void enterExpression(jfkgrammarParser.ExpressionContext ctx);
	void exitExpression(jfkgrammarParser.ExpressionContext ctx);

	void enterStatement(jfkgrammarParser.StatementContext ctx);
	void exitStatement(jfkgrammarParser.StatementContext ctx);

	void enterAr_expression(jfkgrammarParser.Ar_expressionContext ctx);
	void exitAr_expression(jfkgrammarParser.Ar_expressionContext ctx);

	void enterBody(jfkgrammarParser.BodyContext ctx);
	void exitBody(jfkgrammarParser.BodyContext ctx);

	void enterAssignment(jfkgrammarParser.AssignmentContext ctx);
	void exitAssignment(jfkgrammarParser.AssignmentContext ctx);

	void enterVariable_definition(jfkgrammarParser.Variable_definitionContext ctx);
	void exitVariable_definition(jfkgrammarParser.Variable_definitionContext ctx);

	void enterProgram(jfkgrammarParser.ProgramContext ctx);
	void exitProgram(jfkgrammarParser.ProgramContext ctx);

	void enterInvocation(jfkgrammarParser.InvocationContext ctx);
	void exitInvocation(jfkgrammarParser.InvocationContext ctx);

	void enterMult_expression(jfkgrammarParser.Mult_expressionContext ctx);
	void exitMult_expression(jfkgrammarParser.Mult_expressionContext ctx);

	void enterType(jfkgrammarParser.TypeContext ctx);
	void exitType(jfkgrammarParser.TypeContext ctx);

	void enterExpression_atom(jfkgrammarParser.Expression_atomContext ctx);
	void exitExpression_atom(jfkgrammarParser.Expression_atomContext ctx);

	void enterProgram_block(jfkgrammarParser.Program_blockContext ctx);
	void exitProgram_block(jfkgrammarParser.Program_blockContext ctx);

	void enterFunction(jfkgrammarParser.FunctionContext ctx);
	void exitFunction(jfkgrammarParser.FunctionContext ctx);
}