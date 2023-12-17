package abstactlibrary;

public abstract class Book extends Item implements Readable, Borrowable {
    private String title;

    public Book(int id, String title) {
        super(id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printBookState(String state) {
        System.out.println("The book: " + this.getTitle() + " " + state);
    }
}
