package pattern.creational.prototype.entity;

import org.apache.log4j.Logger;

public class Circle extends Shape {
    private static final Logger log = Logger.getLogger(Circle.class);
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        log.info("Inside Circle::draw() method.");
    }
}
