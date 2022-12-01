package shop.orders;

import shop.basket.Cart;
import shop.goods.Product;

import java.util.Map;

public interface Cashbox {
    double getTotal(Cart cart, Map<String, Product> productMap);
}
