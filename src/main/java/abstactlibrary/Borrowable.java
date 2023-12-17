package abstactlibrary;

public interface Borrowable {
    String IS_BORROWED = "is borrowed";
    String IS_RETURNED = "is returned";
    String IS_AVAILABLE = "is available";
    String IS_NOT_AVAILABLE = "is not available";
    String CANT_BE_BORROWED = "can't be borrowed";

    void setAsBorrowed();

    void setAsReturned();
}
