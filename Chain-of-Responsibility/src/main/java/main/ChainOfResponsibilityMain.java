package main;

import org.apache.log4j.Logger;
import pattern.behavior.chainofresponsibility.CollectionHandler;
import pattern.behavior.chainofresponsibility.Handler;
import pattern.behavior.chainofresponsibility.IntegerHandler;
import pattern.behavior.chainofresponsibility.StringHandler;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.TreeSet;

public class ChainOfResponsibilityMain {
    private static final Logger log = Logger.getLogger(ChainOfResponsibilityMain.class);
    public static void main(String[] args){
        log.info("start method main");
        Handler one = new StringHandler();
        Handler two = new IntegerHandler();
        Handler three = new CollectionHandler();
        
        bind(one, two, three);
        test(one);

        bind(one, three, two);
        test(one);

        bind(two, three, one);
        test(two);

        bind(two, one, three);
        test(two);

        bind(three, one, two);
        test(three);

        bind(three, two, one);
        test(three);
        log.info("finish method main");
    }

    static void test(Handler one) {
        log.info("start method test");
        log.info(one.handleRequest(new TreeSet()));
        log.info(one.handleRequest(Double.POSITIVE_INFINITY));
        log.info(one.handleRequest(new ArrayDeque<Object>()));
        log.info(one.handleRequest(new IdentityHashMap<Integer, String>()));
        log.info(one.handleRequest(Integer.MIN_VALUE));
        log.info(one.handleRequest(new ArrayList<Object>()));
        log.info(one.handleRequest(""));
        log.info(one.handleRequest(null));
    }

    private static void bind(Handler... handlers) {
        log.trace(String.format("start method bind with handlers: %s", handlers));
        Handler[] handlerArray = handlers.clone();
        for (int i = 0; i < handlerArray.length - 1; i++) {
            if(handlerArray[i] == null){
                break;}
            handlerArray[i].setNextHandler(handlerArray[i+1]);
        }
        handlerArray[handlerArray.length - 1].setNextHandler(null);
    }
}
