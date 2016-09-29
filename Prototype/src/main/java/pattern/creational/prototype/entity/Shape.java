package pattern.creational.prototype.entity;

import org.apache.log4j.Logger;

public abstract class Shape implements Cloneable {
    private static final Logger log = Logger.getLogger(Shape.class);
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        log.info("Start method clone");
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            log.error(e);
            e.printStackTrace();
        }
        log.info(String.format("Finish method clone with result: %s", clone));
        return clone;
    }
}
