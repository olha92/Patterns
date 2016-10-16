package pattern.behavior.chainofresponsibility;

import org.apache.log4j.Logger;

public class IntegerHandler extends Handler {
    private static final Logger log = Logger.getLogger(IntegerHandler.class);
    protected boolean canHandle(Object request) {
        log.trace("start method canHandle with request: " + request);
        return request instanceof Integer;
    }

    protected String doHandle(Object request) {
        log.debug("start method doHandle with request: " + request);
        return "Integer";
    }
}
