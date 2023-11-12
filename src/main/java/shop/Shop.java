package shop;

public class Shop {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Customer customer = new Customer(1, shoppingCart);

        Product product1 = new Product("Bubble Tea", 2.0);
        Product product2 = new Product("Coca Cola", 1.0);

        customer.shoppingOptions("add", product1);
        customer.checkout();

        customer.shoppingOptions("add", product2);
        customer.shoppingOptions("remove", product2);
    }
}
