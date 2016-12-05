package pattern.behavior.interpreter;

import org.apache.log4j.Logger;

public class NonterminalExpression extends AbstractExpression {
    private static final Logger log = Logger.getLogger(NonterminalExpression.class);
    @Override
    public Object interpret() {
        log.info("Start method interpret");
        return null;
    }
}
