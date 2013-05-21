package jfk;

import org.antlr.v4.runtime.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Compiler {

    public static class Program {
        private List<Statement> stmts = new ArrayList<Statement>();
        public Program() {

        }

        public void add(Statement stmt) {
            stmts.add(stmt);
        }

        public String emit() {
            FunctionBlock block = new FunctionBlock();
            block.emit("define i32 @main() nounwind {");
            for(Statement stmt : stmts) {
                stmt.emit(block);
            }
            block.emit("}");
            return block.getString();
        }
    }

    public static abstract class Statement {
        public abstract void emit(FunctionBlock block);
    }

    public static class Return extends Statement {
        private final Expression expr;

        public Return(Expression expr) {
            this.expr = expr;
        }

        @Override
        public void emit(FunctionBlock block) {
            block.emit("ret i32 0");
        }
    }

    public static class VariableDeclaration extends Statement {
        private final String name;

        public VariableDeclaration(String name) {
            this.name = name;
        }

        @Override
        public void emit(FunctionBlock block) {
            block.emit("%" + name + " = alloca i32, align 4");
        }
    }

    public static class Assignment extends Statement {
        private final String where;
        private final Expression expr;

        public Assignment(String where, Expression expr) {
            this.where = where;
            this.expr = expr;
        }

        @Override
        public void emit(FunctionBlock block) {
            int reg = expr.emit(block);
            block.emit("store i32 %" + reg + ", i32* %" + where + ", align 4");
        }
    }

    public static abstract class Expression {
        public abstract int emit(FunctionBlock block);
    }

    public static class IntExpression extends Expression {
        private final int val;
        public IntExpression(String val) {
            this.val = Integer.parseInt(val);
        }

        @Override
        public int emit(FunctionBlock block) {
            int reg = block.getRegister();
            block.emit("%" + reg + " = add i32 0, " + val);
            return reg;
        }
    }

    public static class RefExpression extends Expression {
        private final String name;

        public RefExpression(String name) {
            this.name = name;
        }

        @Override
        public int emit(FunctionBlock block) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage: java -jar jfk2013.jar INPUT_FILE [OUTPUT_FILE]");
            System.out.println("Defaulting to: test.txt");
            args = new String[] { "test.txt" };
        }


        try {
            jfkgrammarLexer lexer = new jfkgrammarLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader(args[0])));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            jfkgrammarParser parser = new jfkgrammarParser(tokens);
            Program prog = parser.program().ret;
            String str = prog.emit();
            String outputFilename = args[0] + ".ll";
            if(args.length > 1) {
                outputFilename = args[1];
            }
            FileWriter writer = new FileWriter(outputFilename);
            writer.write(str);
            writer.close();
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
