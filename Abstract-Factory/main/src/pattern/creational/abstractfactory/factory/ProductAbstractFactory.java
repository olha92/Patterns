package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.product.AbstractProduct;

public interface ProductAbstractFactory {
    AbstractProduct createCup();
    AbstractProduct createPen();
}
