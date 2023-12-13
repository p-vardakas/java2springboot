package ordermanagement;

public class Order {
    private int id;
    private Plate[] plates;
    private Drink[] drinks;

    public Order(int id) {
        this.id = id;
        this.drinks = new Drink[5];
        this.plates = new Plate[5];
    }

    public int getId() {
        return id;
    }

    public void addPlate(Plate plate) {
        for (int i = 0; i < plates.length; i++) {
            if (plates[i] == null) {
                plates[i] = plate;
                System.out.println("Plate added in order");
                break;
            }
        }
    }

    public void addDrink(Drink drink) {
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] == null) {
                drinks[i] = drink;
                System.out.println("Drink added in order");
                break;
            }
        }
    }

    public void printOrderInfo() {
        System.out.println("--- Order ---");
        int count = 0;
        for (Plate plate : plates) {
            if (plate != null) {
                System.out.println(plate.getName() + ", " + plate.getPrice() + " euro");
                count++;
            }
        }
        for (Drink drink : drinks) {
            if (drink != null) {
                System.out.println(drink.getName() + ", " + drink.getPrice() + " euro");
                count++;
            }
        }

        System.out.println("Total items: " + count);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Plate plate : plates) {
            if (plate != null) {
                totalPrice += plate.getPrice();
            }
        }

        for (Drink drink : drinks) {
            if (drink != null) {
                totalPrice += drink.getPrice();
            }
        }
        return totalPrice;
    }
}
