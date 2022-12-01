package shop.orders;

import shop.basket.Cart;
import shop.goods.Product;
import shop.utils.ShopUtils;

import java.util.Map;

public class Till implements Cashbox {
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
