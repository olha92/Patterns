package pattern.behavior.interpreter;

import pattern.behavior.InterpreterContext;

public interface Expression {
    String interpret(InterpreterContext interpreterContext);
}
