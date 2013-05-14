package jfk;

public class FunctionBlock {
    private StringBuilder builder = new StringBuilder();
    private int registerId = 1;

    public FunctionBlock() {

    }

    public int getRegister() {
        return registerId++;
    }

    public void emit(String str) {
        builder.append(str + "\n");
    }

    public String getString() {
        return builder.toString();
    }
}
