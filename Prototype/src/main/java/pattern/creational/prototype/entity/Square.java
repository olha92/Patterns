package pattern.creational.prototype.entity;

import org.apache.log4j.Logger;

public class Square extends Shape {
    private static final Logger log = Logger.getLogger(Square.class);
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        log.info("Inside Square::draw() method.");
    }
}