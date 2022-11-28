package shop.delivery;

public enum ShippingCost {
    SPB(5),
    MSC(10),
    VDK(25);

    private final int shippingCost;

    ShippingCost (int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }
}
