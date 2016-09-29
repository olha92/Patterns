package pattern.creational.builder;

import java.util.List;

public class Product {
    private String name;
    private List<String> values;
    private Integer count;
    private double coefficient;

    public Product(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString(){
        return String.format("name '%s', count %s, coefficient %s, values %s", name, count, coefficient, values);
    }
}
