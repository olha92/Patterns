package pattern.creational.abstractfactory.product;

public class Cup extends AbstractProduct {
    private double volume;
    private String color;
    private double weight;
    private String type;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Cup " + type + ": " + super.toString() + ", " + volume +
                "ml , " + color +
                ", " + weight +
                "g";
    }
}
