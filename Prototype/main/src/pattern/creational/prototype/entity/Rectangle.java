package pattern.creational.prototype.entity;

import org.apache.log4j.Logger;

public class Rectangle extends Shape {
    private static final Logger log = Logger.getLogger(Rectangle.class);
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        log.info("Inside Rectangle::draw() method.");
    }
}