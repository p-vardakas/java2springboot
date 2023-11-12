package shop;

public class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String productName, double price) {
        this.name = productName;
        this.price = price;
        this.quantity = 1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
