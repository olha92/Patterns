package pattern.creational.factorymethod;

import org.apache.log4j.Logger;

public class ConcreteRealization extends BaseClass {
    private static final Logger log = Logger.getLogger(ConcreteRealization.class);

    @Override
    protected <T> Class factoryMethod(T arg) {
        log.info("Method factoryMethod starts with arg " + arg);
        Class result;
        if(arg == null){
            result = Object.class;
        }else if(arg.hashCode()%2==1){
            result = Exception.class;
        }else{
            result = arg.getClass();
        }
        log.info("Method factoryMethod finishes with result " + result);
        return result;
    }
}
