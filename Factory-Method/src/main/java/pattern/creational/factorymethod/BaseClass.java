package pattern.creational.factorymethod;

import org.apache.log4j.Logger;

public abstract class BaseClass {
    private static final Logger log = Logger.getLogger(BaseClass.class);
    private String name;

    public <T> Object someMethod(T arg) {
        log.info(String.format("Method someMethod starts with arg='%s'", arg));
        Object result = null;
        Class info = factoryMethod(arg);
        if (info.getMethods().length%2 == 0) {
            result = "one";
        } else {
            result = "two";
        }
        log.info(String.format("Method someMethod finishes with result='%s'", result));
        return result;
    }

    protected abstract <T> Class factoryMethod(T arg);
}
