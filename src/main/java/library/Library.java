package library;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java -A Beginner’s Guide");
        Book book2 = new Book("Java for Dummies");

        Member member1 = new Member("John", "Dee");

        member1.addBook(book1);
        System.out.println(member1.getMemberInformation());

        member1.addBook(book2);
        System.out.println(member1.getMemberInformation());

        Member member2 = new Member("Ann", "Lee");
        member2.addBook(book1);
        System.out.println(member2.getMemberInformation());

        member1.returnBook();
        System.out.println(member1.getMemberInformation());

        member2.addBook(book1);
        System.out.println(member2.getMemberInformation());

        book1.printAvailability();
        book2.printAvailability();
    }
}
