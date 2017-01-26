package pattern.behavior.expression;

import org.apache.log4j.Logger;
import pattern.behavior.InterpreterContext;

public class TerminalExpression implements Expression{
    private static final Logger log = Logger.getLogger(TerminalExpression.class);

    public String interpret(InterpreterContext interpreterContext) {
        log.info("Start method interpret with interpreterContext" + interpreterContext);
        return null;
    }
}
