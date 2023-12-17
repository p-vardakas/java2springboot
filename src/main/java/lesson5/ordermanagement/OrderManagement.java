package lesson5.ordermanagement;

import java.util.Random;
import java.util.Scanner;

public class OrderManagement {
    private Order[] orders;
    private Plate[] plates;
    private Drink[] drinks;

    public OrderManagement(Plate[] plates, Drink[] drinks) {
        this.plates = plates;
        this.drinks = drinks;
        this.orders = new Order[10];
    }

    public void orderOptions() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            System.out.println("""
                    Available Options:
                     1. Add New Order
                     2. Display Order Info
                     3. Pay and Close Order
                     4. Exit
                            
                    Please select 1 - 4:
                    """);

            selection = scanner.nextInt();

            switch (selection) {
                case 1 -> addOrder(scanner);
                case 2 -> printOrderInfo(scanner);
                case 3 -> deleteOrder(scanner);
                case 4 -> System.out.println("Exiting the application...");
                default -> System.out.println("Please select 1 - 4");
            }
        } while (selection != 4);
    }

    private void addOrder(Scanner scanner) {
        printAvailablePlatesAndDrinks();

        Order order = new Order(new Random().nextInt(100));

        int plateId;
        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Enter the id of the plate:");
                plateId = scanner.nextInt();
            } while (getPlate(plateId) == null);
            order.addPlate(getPlate(plateId));
        }

        int drinkId;
        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Enter the id of the drink:");
                drinkId = scanner.nextInt();
            } while (getDrink(drinkId) == null);
            order.addDrink(getDrink(drinkId));
        }

        addOrder(order);
    }

    private void printAvailablePlatesAndDrinks() {
        System.out.println("Available Plates:");
        for (Plate plate : plates) {
            System.out.println(plate.getPlateInfo());
        }

        System.out.println("Available Drinks:");
        for (Drink drink : drinks) {
            System.out.println(drink.getDrinkInfo());
        }
    }

    private void addOrder(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                System.out.println("Order added successfully with id: " + order.getId());
                break;
            }
        }
    }

    private Plate getPlate(int plateId) {
        for (Plate plate : plates) {
            if (plate != null && plate.getId() == plateId) {
                return plate;
            }
        }
        return null;
    }

    private Drink getDrink(int drinkId) {
        for (Drink drink : drinks) {
            if (drink != null && drink.getId() == drinkId) {
                return drink;
            }
        }
        return null;
    }

    private void printOrderInfo(Scanner scanner) {
        int orderId = getOrderId(scanner);

        for (Order order : orders) {
            if (order != null && order.getId() == orderId) {
                order.printOrderInfo();
                break;
            }
        }
        System.out.println("-------------------");
    }

    private void deleteOrder(Scanner scanner) {
        int orderId = getOrderId(scanner);

        Order selectedOrder = null;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null && orders[i].getId() == orderId) {
                selectedOrder = orders[i];

                double totalPrice = selectedOrder.calculateTotalPrice();
                System.out.println("Total price: " + totalPrice);

                System.out.println("Deleting order: " + orderId);
                orders[i] = null;
                break;
            }
        }

        if (selectedOrder == null) {
            System.out.println("Order not found");
        }
    }

    private static int getOrderId(Scanner scanner) {
        System.out.println("Enter the id of the order:");
        int orderId = scanner.nextInt();
        return orderId;
    }
}
