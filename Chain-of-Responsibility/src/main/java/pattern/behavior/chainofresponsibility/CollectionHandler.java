package pattern.behavior.chainofresponsibility;

import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionHandler extends Handler{
    private static final Logger log = Logger.getLogger(CollectionHandler.class);
    protected boolean canHandle(Object request) {
        log.trace("start method canHandle with request: " + request);
        return request instanceof Collection;
    }

    protected String doHandle(Object request) {
        log.debug("start method doHandle with request: " + request);
        String result = "Collection";
        if(request instanceof List){
            result = "List";
        }else if(request instanceof Set){
            result = "Set";
        }
        return result;
    }
}
