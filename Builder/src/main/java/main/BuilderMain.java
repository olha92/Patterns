package main;

import org.apache.log4j.Logger;
import pattern.creational.builder.OneProductBuilder;
import pattern.creational.builder.Product;
import pattern.creational.builder.ProductBuilder;
import pattern.creational.builder.TwoProductBuilder;

public class BuilderMain {
    private static final Logger log = Logger.getLogger(BuilderMain.class);

    public static void main(String[] args) {
        log.info("[Builder] main starts");
        twoProductFactoryTest();
        oneProductFactoryTest();
        log.info("[Builder] main finishes");
    }

    private static void oneProductFactoryTest() {
        log.info("oneProductFactoryTest starts");
        ProductBuilder factory = new OneProductBuilder();
        factory.build("red");
        Product one = factory.getResult();
        log.info("product " + one);
        log.info("oneProductFactoryTest finishes");
    }

    private static void twoProductFactoryTest() {
        log.info("twoProductFactoryTest starts");
        ProductBuilder factory = new TwoProductBuilder();
        factory.build("green");
        Product two = factory.getResult();
        log.info("product " + two);
        log.info("twoProductFactoryTest finishes");
    }
}
