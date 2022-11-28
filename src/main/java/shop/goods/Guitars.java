package shop.goods;

public class Guitars extends Product {
    private final GuitarForm form;
    private final int stringsCount;

    public Guitars(String name, double price, String brand, GuitarForm form, int stringsCount) {
        super(name, brand, price);
        this.form = form;
        this.stringsCount = stringsCount;
    }

    @Override
    public String toString() {
        return super.toString() + "/n" +
                ", form: " + form + ", " +
                stringsCount + " strings.";
    }
}
