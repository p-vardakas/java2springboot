package lesson4.booking;

public class Hotel {
    private Room room1;
    private Room room2;

    public Hotel(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void createReservation(Client client) {
        if (room1.isAvailable() && client.getRoom() == null) {
            room1.setAvailable(false);
            client.setRoom(room1);
        }

        if (room2.isAvailable() && client.getRoom() == null) {
            room2.setAvailable(false);
            client.setRoom(room2);
        }
    }

    public void removeReservation(Client client) {
        Room room = client.getRoom();

        if (room != null) {
            room.setAvailable(true);
            client.setRoom(null);
        }
    }

    public void printReceipt(Client client) {
        System.out.println("---- Receipt ----");
        System.out.println("Client name: " + client.getName());
        System.out.println("Client age: " + client.getAge());
        Room room = client.getRoom();
        if (room != null) {
            System.out.println("Room id: " + room.getId());

            double price = room.getPrice();
            double tax = 0.00;

            if (client.getAge() > 18) {
                tax = price * 0.05;
            }

            System.out.println("Room price: " + price);
            System.out.println("Tourist Tax: " + tax);
            System.out.println("Total: " + (price + tax));

        } else {
            System.out.println("Ο πελάτης δεν έχει κάποια κράτηση");
        }
    }
}
