package pattern.creational.builder;

public interface ProductBuilder {
    void build(String name);
    Product getResult();
}
