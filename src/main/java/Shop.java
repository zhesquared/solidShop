
import shop.basket.Cart;
import shop.goods.Product;
import shop.orders.Cashbox;
import shop.orders.PurchaseService;
import shop.orders.Till;
import shop.utils.ShopUtils;

import java.util.Map;
import java.util.Scanner;

import static shop.storage.Stock.getStock;

public class Shop {

    static final Map<String, Product> stock = getStock();

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final Cart cart = addToCart(scanner);
        printOrder(scanner, cart);
    }

    private static Cart addToCart(Scanner scanner) {
        final Cart cart = new Cart();

        while (true) {
            printMenu();

            final String action = scanner.nextLine();
            switch (action) {
                case "+" -> {
                    final String code = getProductCode(scanner);
                    final String count = scanner.nextLine();
                    cart.addProduct(stock, code, Integer.parseInt(count));
                }
                case "-" -> {
                    final String code = getProductCode(scanner);
                    cart.deleteProduct(code);
                }
                default -> {
                    return cart;
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Hello, Dear Friend! Glad to see you in our little warm online shop -=PoorMusician=-!");
        System.out.println("Please choose an action:");
        System.out.println("+ for add instrument to cart;");
        System.out.println("- for delete product from your cart");
        System.out.println("any symbol for return and order processing");
    }

    private static String getProductCode(Scanner scanner) {
        System.out.println("Please enter a product code:");
        System.out.println("All that we have:");
        ShopUtils.productsDisplay(stock);
        return scanner.nextLine();
    }

    private static void printOrder(Scanner scanner, Cart cart) {
        printOrderMenu();

        final Cashbox cashbox;
        final String operation = scanner.nextLine();

        switch (operation) {
            case "1" -> {
                cashbox = new Till();
            }
            case "2" -> {
                cashbox = new PurchaseService();
            }
            default -> {
                return;
            }
        }
        final double totalOrder = cashbox.getTotal(cart, stock);
        if (totalOrder == 0) {
            System.out.println("Your cart is empty!");
        } else {
            System.out.println("Order amount was " + totalOrder + "€");
        }
    }

    private static void printOrderMenu() {
        System.out.println("How are you going to buy the product?");
        System.out.println("Enter 1 if you want pick up instruments at the our warehouse");
        System.out.println("Enter 2 if you want arrange delivery");
        System.out.println("or any symbol to cancel purchases");
    }
}
