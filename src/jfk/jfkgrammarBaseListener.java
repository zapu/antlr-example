// Generated from src\jfk\jfkgrammar.g4 by ANTLR 4.0

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

	@Override public void enterProgram(jfkgrammarParser.ProgramContext ctx) { }
	@Override public void exitProgram(jfkgrammarParser.ProgramContext ctx) { }

	@Override public void enterInvocation(jfkgrammarParser.InvocationContext ctx) { }
	@Override public void exitInvocation(jfkgrammarParser.InvocationContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}