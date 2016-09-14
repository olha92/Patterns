package pattern.creational.prototype;

import org.apache.log4j.Logger;
import pattern.creational.prototype.entity.Circle;
import pattern.creational.prototype.entity.Rectangle;
import pattern.creational.prototype.entity.Shape;
import pattern.creational.prototype.entity.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static final Logger log = Logger.getLogger(ShapeCache.class);
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        log.info(String.format("Start method getShape with id: %s", shapeId));
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        log.info("Start method loadCache");
        Circle circle = new Circle();
        circle.setId("Circle");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("Square");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("Rectangle");
        shapeMap.put(rectangle.getId(), rectangle);
        log.info("Finish method loadCache");
    }
}
