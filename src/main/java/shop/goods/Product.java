package shop.goods;

public abstract class Product {
    private final String name;
    private String brand;
    private double price;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", brand= " + brand +
                "; price=" + price;
    }
}
