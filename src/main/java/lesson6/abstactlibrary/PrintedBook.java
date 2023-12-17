package lesson6.abstactlibrary;

public class PrintedBook extends Book {

    private String isbn;

    public PrintedBook(int id, String title, String isbn) {
        super(id, title);
        this.isbn = isbn;
    }

    @Override
    public void read() {
        System.out.println("Reading a book with title: " + this.getTitle()
                + ", isbn: " + this.isbn);
    }

    @Override
    public void setAsBorrowed() {
        if (isAvailable()) {
            setAvailable(false);
            printBookState(IS_BORROWED);
        } else {
            printBookState(IS_NOT_AVAILABLE);
        }
    }

    @Override
    public void setAsReturned() {
        if (!isAvailable()) {
            setAvailable(true);
            printBookState(IS_RETURNED);
        } else {
            printBookState(IS_NOT_AVAILABLE);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Id: " + this.getId()
                + ", title: " + this.getTitle()
                + ", isbn: " + this.isbn
                + ", is available: " + this.isAvailable());
    }
}
