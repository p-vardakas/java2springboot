package ordermanagement;

public class Main {
    public static void main(String[] args) {
        Plate[] plates = {
                new Plate(1, "Burger", 10),
                new Plate(2, "Pasta", 8),
                new Plate(3, "Stake", 14)
        };

        Drink[] drinks = {
                new Drink(1, "Red Wine", 12),
                new Drink(2, "White Wine", 14),
                new Drink(3, "Beer", 6)
        };

        OrderManagement orderManagement = new OrderManagement(plates, drinks);
        orderManagement.orderOptions();
    }
}
