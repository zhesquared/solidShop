package shop.orders;

import shop.basket.Basket;
import shop.goods.Product;

import java.util.Map;

public interface Cashbox {
    double getTotal(Basket basket, Map<String, Product> productMap);
}
