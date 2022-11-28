package shop.orders;

import shop.basket.Basket;
import shop.goods.Product;
import shop.utils.ShopUtils;

import java.util.Map;

public class Till implements Cashbox {
    @Override
    public double getTotal(Basket basket, Map<String, Product> productMap) {
        return basket.getProductBasket().entrySet().stream().mapToDouble(
                entry -> {
                    final String code = entry.getKey();
                    final Product product = ShopUtils.getProductByCode(productMap, code);
                    final int count = entry.getValue();
                    return product.getPrice() * count;
                }
        ).sum();
    }
}
