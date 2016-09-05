package main;

import org.apache.log4j.Logger;
import pattern.creational.factorymethod.BaseClass;
import pattern.creational.factorymethod.ConcreteRealization;
import pattern.creational.factorymethod.OtherRealization;

public class FactoryMethodMain {
    private static final Logger log = Logger.getLogger(FactoryMethodMain.class);

    public static void main(String[] args) {
        log.info("[Factory Method] main starts");
        BaseClass one = new ConcreteRealization();
        BaseClass two = new OtherRealization();
        one.someMethod(null);
        try{
        two.someMethod(null);}catch(Exception e){
            e.getStackTrace();
        }
        one.someMethod("");
        two.someMethod("");
        one.someMethod(5);
        two.someMethod(5);
        log.info("[Factory Method] main finishes");
    }
}
