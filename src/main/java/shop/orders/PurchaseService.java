package shop.orders;

import shop.basket.Cart;
import shop.delivery.DeliveryService;
import shop.delivery.ShippingCost;
import shop.goods.Product;
import shop.utils.ShopUtils;

import java.util.Map;

public class PurchaseService implements Cashbox, DeliveryService {

    @Override
    public void sendParcel(ShippingCost shippingCost) {
        switch (shippingCost) {
            case MSC -> shippingCost.getShippingCost();
            //logic
            case SPB -> shippingCost.getShippingCost();
            //logic
            case VDK -> shippingCost.getShippingCost();
            //logic
        }
    }

    @Override
    public double getTotal(Cart cart, Map<String, Product> productMap) {
        return cart.getProductCart().entrySet().stream().mapToDouble(
                entry -> {
                    final String code = entry.getKey();
                    final Product product = ShopUtils.getProductByCode(productMap, code);
                    final int count = entry.getValue();
                    return product.getPrice() * count;
                }
        ).sum();
    }
}
