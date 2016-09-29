package pattern.creational.builder;

import java.util.LinkedList;

public class TwoProductBuilder implements ProductBuilder{
    private Product result;

    public void build(String name) {
        result = new Product(name);
        result.setCoefficient(1.99);
        result.setCount(9);
        result.setValues(new LinkedList());
    }

    public Product getResult() {
        return result;
    }
}
