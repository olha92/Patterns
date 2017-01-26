package pattern.behavior.expression;

import pattern.behavior.InterpreterContext;

public class MenuExspression implements Expression {
    private String data;

    public MenuExspression(String data) {
        this.data = data;
    }

    public String interpret(InterpreterContext interpreterContext) {
        return null;
    }
}
