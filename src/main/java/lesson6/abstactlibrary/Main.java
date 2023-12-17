package lesson6.abstactlibrary;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new PrintedBook(1, "Java Champion", "12345"),
                new PrintedBook(2, "Java For Dummies", "13579"),
                new Ebook(3, "Abstract Java", 100, true),
                new Ebook(4, "Testing in Java", 300, false),
        };

        Library library = new Library(books);
        library.borrowBook(1);
        library.borrowBook(1);
        library.returnBook(1);
        library.borrowBook(3);
        library.borrowBook(4);

        library.displayAllBooksInfo();
    }
}
