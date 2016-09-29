package pattern.creational.factorymethod;

import org.apache.log4j.Logger;

public class OtherRealization extends BaseClass {
    private static final Logger log = Logger.getLogger(OtherRealization.class);

    @Override
    protected <T> Class factoryMethod(T arg) {
        log.info(String.format("Method factoryMethod starts with arg='%s'", arg));
        Class result = null;
        if (arg == null) {
            log.error(String.format("Illegal argument: arg = '%s'", result));
            throw new IllegalArgumentException();
        } else if (arg instanceof String) {
            result = Exception.class;
        } else {
            result = arg.getClass();
        }
        log.info(String.format("Method factoryMethod finishes with result='%s'", result.getName()));
        return result;
    }
}
