package pattern.creational.factorymethod;

import org.apache.log4j.Logger;

public class OtherRealization extends BaseClass {
    private static final Logger log = Logger.getLogger(OtherRealization.class);

    @Override
    protected <T> Class factoryMethod(T arg) {
        log.info("Method factoryMethod starts with arg " + arg);
        Class result = null;
        if (arg == null) {
            log.error("Illegal argument: arg =  " + result);
            throw new IllegalArgumentException();
        } else if (arg instanceof String) {
            result = Exception.class;
        } else {
            result = arg.getClass();
        }
        log.info("Method factoryMethod finishes with result " + result);
        return result;
    }
}
