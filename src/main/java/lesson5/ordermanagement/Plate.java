package lesson5.ordermanagement;

public class Plate {
    private int id;
    private String name;
    private double price;

    public Plate(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPlateInfo() {
        return id + ": " + name + ", " + price + " euro";
    }
}
