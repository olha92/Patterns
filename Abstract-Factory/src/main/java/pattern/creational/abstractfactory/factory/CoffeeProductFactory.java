package pattern.creational.abstractfactory.factory;

import org.apache.log4j.Logger;
import pattern.creational.abstractfactory.product.AbstractProduct;
import pattern.creational.abstractfactory.product.Cup;
import pattern.creational.abstractfactory.product.Pen;


/**
 * Coffee product factory.
 */
public class CoffeeProductFactory implements ProductAbstractFactory {
    private static final Logger log = Logger.getLogger(CoffeeProductFactory.class);

    public AbstractProduct createCup() {
        Cup cup = new Cup();
        cup.setColor("white");
        cup.setVolume(100);
        cup.setWeight(50);
        cup.setType("coffee");
        log.info("create cup " + cup);
        return cup;
    }

    public AbstractProduct createPen() {
        Pen pen = new Pen();
        pen.setColor("black");
        pen.setDepth(1);
        pen.setAutomatic(false);
        log.info("create pen " + pen);
        return pen;
    }
}
