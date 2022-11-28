package shop.basket;

import shop.goods.Product;
import shop.utils.ShopUtils;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final Map<String, Integer> productBasket = new HashMap<>();

    public Map<String, Integer> getProductBasket() {
        return productBasket;
    }

    public boolean addProduct(Map<String, Product> productStock,String code, int productValue) {
        if(ShopUtils.getProductByCode(productStock,code) == null) {
            System.out.println("Product is out of stock");
            return false;
        } else {
            productBasket.merge(code, productValue, Integer :: sum);
            return true;
        }
    }

    public boolean deleteProduct(String code) {
        final Integer productsCount = productBasket.get(code);
        if (productsCount == null) {
            System.out.println("There is no product with the code: " + code + " in the cart");
            return false;
        } else if (productsCount == 1){
            productBasket.remove(code);
            return true;
        } else {
            productBasket.put(code, productsCount - 1);
            return true;
        }
    }
}
