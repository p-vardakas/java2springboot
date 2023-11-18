package booking;

public class Booking {
    public static void main(String[] args) {
        Client clientA = new Client("John Dee", 20);
        Client clientC = new Client("Tony Dee", 10);

        Room roomA = new Room(1, 50.0);
        Room roomB = new Room(2, 70.0);

        Hotel hotel = new Hotel(roomA, roomB);

        hotel.createReservation(clientA);
        hotel.printReceipt(clientA);

        hotel.createReservation(clientC);
        hotel.printReceipt(clientC);

        hotel.removeReservation(clientC);
        hotel.printReceipt(clientC);
    }
}
