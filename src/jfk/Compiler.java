package jfk;

import org.antlr.v4.runtime.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Compiler {

    static public class Program {
        public List<Statement> statements = new ArrayList<Statement>();
        public List<Function> functions = new ArrayList<Function>();
    }

    static public class Function {
        private final String m_name;
        private List<String> m_arguments = new ArrayList<String>();
        private Body m_body;

        public Function(String name) {
            m_name = name;
        }

        public void addArg(String name) {
            m_arguments.add(name);
        }

        public void setBody(Body b) {
            m_body = b;
        }
    }

    static public abstract class Statement {

    }

    static public class StatementExpression extends Statement {
        private final Expression m_expr;

        public StatementExpression(Expression expr) {
            m_expr = expr;
        }
    }

    static public class VariableDefinition extends Statement {
        private final String m_name;

        public VariableDefinition(String name) {
            m_name = name;
        }

        public String getName() {
            return m_name;
        }
    }

    static public abstract class Expression {}

    static public class IntExpression extends Expression {
        private final String m_data;

        public IntExpression(String data) {
            m_data = data;
        }

        public String getData() {
            return m_data;
        }
    }

    static public class Reference extends Expression {
        private final String m_name;

        public Reference(String to) {
            m_name = to;
        }

        public String getName() {
            return m_name;
        }
    }

    static public class ArExpression extends Expression {
        private List<Expression> exps = new ArrayList<Expression>();
        public ArExpression(Expression first) {
            add(first);
        }

        public void add(Expression e) {
            exps.add(e);
        }
    }

    static public class Assignment extends Expression {
        private final Expression m_what;
        private final String m_to;

        public Assignment(String to, Expression what) {
            m_to = to;
            m_what = what;
        }
    }

    static public class Invocation extends Expression {
        private final List<Expression> params = new ArrayList<Expression>();
        private final String m_what;
        public Invocation(String what) {
            m_what = what;
        }

        public void addParam(Expression expr) {
            params.add(expr);
        }
    }

    static public class Body {
        private List<Statement> statements = new ArrayList<Statement>();

        public Body() {

        }

        public void add(Statement stmt) {
            statements.add(stmt);
        }
    }

    public static void main(String[] args) {
        //jfkgrammarLexer lexer = new jfkgrammarLexer(new org.antlr.v4.runtime.ANTLRInputStream("var a; def test() { var d; }"));
        try {
            jfkgrammarLexer lexer = new jfkgrammarLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader("test.txt")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            jfkgrammarParser parser = new jfkgrammarParser(tokens);
            Program def = parser.program().val;
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
