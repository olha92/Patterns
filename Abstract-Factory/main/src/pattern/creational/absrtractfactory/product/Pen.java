package pattern.creational.absrtractfactory.product;

public class Pen extends AbstractProduct {
    private double depth;
    private String color;
    private boolean isAutomatic;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "Pen: " + super.toString() +
                ", " + depth +
                "mm, " + color +
                ", " + isAutomatic;
    }
}