package lesson4.library;

public class Book {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void printAvailability() {
        if (isAvailable) {
            System.out.println(title + ": Διαθέσιμο για ενοικίαση");
        } else {
            System.out.println(title + ": Μη διαθέσιμο για ενοικίαση");
        }
    }
}
