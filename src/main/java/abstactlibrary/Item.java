package abstactlibrary;

public abstract class Item {
    private int id;
    private boolean isAvailable;

    public Item(int id) {
        this.id = id;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract void displayInfo();
}
