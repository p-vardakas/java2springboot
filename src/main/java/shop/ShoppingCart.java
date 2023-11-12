package shop;

public class ShoppingCart {
    private Product product;

    public void addProduct(Product product) {
        if (product.getQuantity() > 0 && this.product == null) {
            this.product = product;
            this.product.setQuantity(0);
            printInformation("add");
        } else {
            printInformation("error");
        }
    }

    public void removeProduct(Product product) {
        if (this.product != null && this.product.getName().equals(product.getName())) {
            this.product = null;
            this.product.setQuantity(1);
            printInformation("remove");
        } else {
            printInformation("error");
        }
    }

    private void printInformation(String option) {
        switch (option) {
            case "add":
                System.out.println(this.product.getName() + " added to cart");
                break;
            case "remove":
                System.out.println(this.product.getName() + " removed from cart");
                break;
            case "error":
                System.out.println("Sorry, your request cannot be processed");
                break;
        }
    }

    public void printCheckout() {
        if (this.product != null) {
            System.out.println("Total price: " + this.product.getPrice());
        } else {
            System.out.println("Cart is empty");
        }
    }
}
