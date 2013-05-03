package jfk;

import org.antlr.v4.runtime.*;

public class Compiler {

    static public class VariableDefinition {
        public VariableDefinition(String name) {
            m_name = name;
        }

        private String m_name;

        public String getName() {
            return m_name;
        }
    }

    public static void main(String[] args) {
        jfkgrammarLexer lexer = new jfkgrammarLexer(new org.antlr.v4.runtime.ANTLRInputStream("var a;"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        jfkgrammarParser parser = new jfkgrammarParser(tokens);
        VariableDefinition def = parser.variable_definition().val;
    }
}
