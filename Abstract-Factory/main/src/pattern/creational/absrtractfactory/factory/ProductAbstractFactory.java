package pattern.creational.absrtractfactory.factory;

import pattern.creational.absrtractfactory.product.AbstractProduct;

public interface ProductAbstractFactory {
    AbstractProduct createCup();
    AbstractProduct createPen();
}
