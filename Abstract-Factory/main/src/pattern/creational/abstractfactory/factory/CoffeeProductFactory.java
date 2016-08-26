package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.product.AbstractProduct;
import pattern.creational.abstractfactory.product.Cup;
import pattern.creational.abstractfactory.product.Pen;

/**
 * Coffee product factory.
 */
public class CoffeeProductFactory implements ProductAbstractFactory {

    public AbstractProduct createCup() {
        Cup cup = new Cup();
        cup.setColor("white");
        cup.setVolume(100);
        cup.setWeight(50);
        cup.setType("coffee");
        return cup;
    }

    public AbstractProduct createPen() {
        Pen pen = new Pen();
        pen.setColor("black");
        pen.setDepth(1);
        pen.setAutomatic(false);
        return pen;
    }
}
