package pattern.behavior.interpreter;

import org.apache.log4j.Logger;

public class TerminalExpression extends AbstractExpression{
    private static final Logger log = Logger.getLogger(TerminalExpression.class);
    @Override
    public Object interpret() {
        log.info("Start method interpret");
        return null;
    }
}
