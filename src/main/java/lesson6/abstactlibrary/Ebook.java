package lesson6.abstactlibrary;

public class Ebook extends Book {
    private double fileSize;
    private boolean canBeBorrowed;

    public Ebook(int id, String title, double fileSize, boolean canBeBorrowed) {
        super(id, title);
        this.fileSize = fileSize;
        this.canBeBorrowed = canBeBorrowed;
    }

    @Override
    public void read() {
        System.out.println("Reading an e-book with title: " + this.getTitle()
                + ", size: " + this.fileSize);
    }

    @Override
    public void setAsBorrowed() {
        if (canBeBorrowed) {
            if (isAvailable()) {
                setAvailable(false);
                printBookState(IS_BORROWED);
            } else {
                printBookState(IS_NOT_AVAILABLE);
            }
        } else {
            printBookState(CANT_BE_BORROWED);
        }
    }

    @Override
    public void setAsReturned() {
        if (canBeBorrowed) {
            if (!isAvailable()) {
                setAvailable(true);
                printBookState(IS_RETURNED);
            } else {
                printBookState(IS_AVAILABLE);
            }
        } else {
            printBookState(CANT_BE_BORROWED);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Id: " + this.getId()
                + ", title: " + this.getTitle()
                + ", filesize: " + this.fileSize
                + ", can be borrowed: " + this.canBeBorrowed
                + ", is available: " + this.isAvailable());
    }
}
