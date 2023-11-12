package shop;

public class Customer {
    private int customerId;
    private ShoppingCart shoppingCart;

    public Customer(int customerId, ShoppingCart shoppingCart) {
        this.customerId = customerId;
        this.shoppingCart = shoppingCart;
    }

    public void shoppingOptions(String option, Product product) {
        switch (option) {
            case "add":
                this.shoppingCart.addProduct(product);
                break;
            case "remove":
                this.shoppingCart.removeProduct(product);
                break;
            default:
                System.out.println("Not correct option");
        }
    }

    public void checkout() {
        this.shoppingCart.printCheckout();
        System.out.println("CustomerId: " + this.customerId);
    }
}
