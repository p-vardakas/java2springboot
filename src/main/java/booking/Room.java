package booking;

public class Room {
    private int id;
    private double price;
    private boolean isAvailable;

    public Room(int id, double price) {
        this.id = id;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
