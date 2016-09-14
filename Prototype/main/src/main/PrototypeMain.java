package main;

import org.apache.log4j.Logger;
import pattern.creational.prototype.entity.Shape;
import pattern.creational.prototype.ShapeCache;

public class PrototypeMain {
    private static final Logger log = Logger.getLogger(PrototypeMain.class);

    public static void main(String[] args) {
        log.info("[Prototype] main starts");
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("Circle");
        log.info("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("Circle");
        log.info("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("Square");
        log.info("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("Square");
        log.info("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("Rectangle");
        log.info("Shape : " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("Rectangle");
        log.info("Shape : " + clonedShape.getType());
        log.info("[Prototype] main finishes");
    }
}
