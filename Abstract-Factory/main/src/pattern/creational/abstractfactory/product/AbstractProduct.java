package pattern.creational.abstractfactory.product;

public abstract class AbstractProduct {
    private String id;
    private String name;

    public AbstractProduct(){
        this.id = "id";
        this.name = "product";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +  ", " + name;
    }
}
