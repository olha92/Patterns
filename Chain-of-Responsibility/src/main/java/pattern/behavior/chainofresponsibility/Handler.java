package pattern.behavior.chainofresponsibility;

import org.apache.log4j.Logger;

public abstract class Handler {
    private static final Logger log = Logger.getLogger(Handler.class);
    protected Handler nextHandler;

    public String handleRequest(Object request){
        String result;
        if(canHandle(request)){
            result = doHandle(request);
        }else if(nextHandler != null){
            log.debug("move to next handler request: " + request);
            result = nextHandler.handleRequest(request);
        }else {
            log.debug(String.format("Chain cannot handle this request %s", request));
            result = String.format("Chain cannot handle this request %s", request);
        }
        return result;
    }

    protected abstract boolean canHandle(Object request);
    protected abstract String doHandle(Object request);

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
}
