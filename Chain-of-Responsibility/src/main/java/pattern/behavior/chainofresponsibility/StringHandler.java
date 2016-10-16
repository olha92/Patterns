package pattern.behavior.chainofresponsibility;

import org.apache.log4j.Logger;

public class StringHandler extends Handler{
    private static final Logger log = Logger.getLogger(StringHandler.class);
    protected boolean canHandle(Object request) {
        log.trace("start method canHandle with request: " + request);
        return request instanceof String;
    }

    protected String doHandle(Object request) {
        log.debug("start method doHandle with request: " + request);
        return "String";
    }
}
