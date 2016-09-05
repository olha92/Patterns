package pattern.creational.factorymethod;

import org.apache.log4j.Logger;

public abstract class BaseClass {
    private static final Logger log = Logger.getLogger(BaseClass.class);
    private String name;

    public <T> Object someMethod(T arg) {
        log.info("Method someMethod starts with arg " + arg);
        Object result = null;
        Class info = factoryMethod(arg);
        if (info == null) {
            result = "one";
        } else {
            result = "two";
        }
        log.info("Method someMethod finishes with result " + result);
        return result;
    }

    protected abstract <T> Class factoryMethod(T arg);
}
