package library;

public class Member {
    private String name;
    private String surname;
    private Book book;

    public Member(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.book = null;
    }

    public void addBook(Book book) {
        if (book.isAvailable() && this.book == null) {
            this.book = book;
            book.setAvailable(false);
        }
    }

    public void returnBook() {
        if (this.book != null) {
            this.book.setAvailable(true);
            this.book = null;
        }
    }

    public String getMemberInformation() {
        String information;

        if (this.book != null) {
            information = this.name + ": " + this.book.getTitle();
        } else {
            information = this.name + " δεν έχει δανειστεί βιβλίο";
        }
        return information;
    }
}
