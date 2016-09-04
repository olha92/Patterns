package main;

import org.apache.log4j.Logger;
import pattern.creational.abstractfactory.factory.CoffeeProductFactory;
import pattern.creational.abstractfactory.factory.ProductAbstractFactory;
import pattern.creational.abstractfactory.factory.TeaProductFactory;
import pattern.creational.abstractfactory.product.AbstractProduct;

public class AbstractFactoryMain {
    private static final Logger log = Logger.getLogger(AbstractFactoryMain.class);

    public static void main(String[] args) {
        log.info("[Abstract Factory] main starts");
        coffeeFactoryTest();
        teaFactoryTest();
        log.info("[Abstract Factory] main finishes");
    }

    private static void teaFactoryTest() {
        log.info("teaFactoryTest starts");
        ProductAbstractFactory factory = new TeaProductFactory();
        AbstractProduct teaCup = factory.createCup();
        AbstractProduct teaPen = factory.createPen();
        log.info("teaFactoryTest finishes");
    }

    private static void coffeeFactoryTest() {
        log.info("coffeeFactoryTest starts");
        ProductAbstractFactory factory = new CoffeeProductFactory();
        AbstractProduct coffeeCup = factory.createCup();
        AbstractProduct coffeePen = factory.createPen();
        log.info("coffeeFactoryTest finishes");
    }
}
