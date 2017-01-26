package pattern.behavior.expression;

import pattern.behavior.InterpreterContext;

public interface Expression {
    String interpret(InterpreterContext interpreterContext);
}
