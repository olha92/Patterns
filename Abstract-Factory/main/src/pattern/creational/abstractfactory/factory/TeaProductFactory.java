package pattern.creational.abstractfactory.factory;

import org.apache.log4j.Logger;
import pattern.creational.abstractfactory.product.AbstractProduct;
import pattern.creational.abstractfactory.product.Cup;
import pattern.creational.abstractfactory.product.Pen;

public class TeaProductFactory implements ProductAbstractFactory{
    private static final Logger log = Logger.getLogger(TeaProductFactory.class);

    public AbstractProduct createCup() {
        Cup cup = new Cup();
        cup.setColor("pink");
        cup.setVolume(600);
        cup.setWeight(100);
        cup.setType("tea");
        log.info("create cup " + cup);
        return cup;
    }

    public AbstractProduct createPen() {
        Pen pen = new Pen();
        pen.setColor("blue");
        pen.setDepth(0.55);
        pen.setAutomatic(true);
        log.info("create pen " + pen);
        return pen;
    }
}
