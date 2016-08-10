package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.product.AbstractProduct;
import pattern.creational.abstractfactory.product.Cup;
import pattern.creational.abstractfactory.product.Pen;

public class ProductFactory implements ProductAbstractFactory{

    @Override
    public AbstractProduct createCup() {
        Cup cup = new Cup();
        cup.setColor("pink");
        cup.setVolume(600);
        cup.setWeight(100);
        return cup;
    }

    @Override
    public AbstractProduct createPen() {
        Pen pen = new Pen();
        pen.setColor("blue");
        pen.setDepth(0.55);
        pen.setAutomatic(true);
        return pen;
    }
}
