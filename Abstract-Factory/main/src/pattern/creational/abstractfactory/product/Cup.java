package pattern.creational.abstractfactory.product;

public class Cup extends AbstractProduct {
    private double volume;
    private String color;
    private double weight;

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

    @Override
    public String toString() {
        return "Cup: " + super.toString() + ", "+ volume +
                "ml , " + color +
                ", " + weight +
                "g";
    }
}
