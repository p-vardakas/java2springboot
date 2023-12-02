package vendingmachine;

public class Product {
    private String name;
    private double price;

    public void printProductDetails() {
        System.out.println( "Product name: " + name + " price: " + String.format("%.2f", price) + " euro");
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
