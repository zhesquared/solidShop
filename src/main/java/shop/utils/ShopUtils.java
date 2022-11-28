package shop.utils;

import shop.goods.Product;

import java.util.Map;

public class ShopUtils {

    public static void productsDisplay(Map<String, Product> productMap) {
        productMap.forEach((code, product) -> System.out.println("Code: " + code + "; product: " + product));
    }

    public static Product getProductByCode(Map<String, Product> productMap, String code) {
        return productMap.get(code);
    }
}
