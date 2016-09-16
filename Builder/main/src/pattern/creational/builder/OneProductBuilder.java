package pattern.creational.builder;

import java.util.ArrayList;

public class OneProductBuilder implements ProductBuilder {
    private Product result;

    public void build(String name) {
        result = new Product(name);
        result.setCoefficient(0.99);
        result.setCount(1009);
        result.setValues(new ArrayList());
    }

    public Product getResult() {
        return result;
    }
}
