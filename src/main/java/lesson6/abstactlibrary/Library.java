package lesson6.abstactlibrary;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void borrowBook(int id) {
        for (Book book : books) {
            if (book != null && book.getId() == id) {
                book.setAsBorrowed();
            }
        }
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book != null && book.getId() == id) {
                book.setAsReturned();
            }
        }
    }

    public void displayAllBooksInfo() {
        System.out.println("------------- Books Information -------------");
        for (Book book : books) {
            if (book != null) {
                book.displayInfo();
            }
        }
        System.out.println("-----------------------------");
    }
}
