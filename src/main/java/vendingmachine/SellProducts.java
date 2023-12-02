package vendingmachine;

public class SellProducts {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Coca Cola", 0.6),
                new Product("Sprite", 0.7),
                new Product("Fanta", 0.7)
        };

        Coin[] coins = {
                new Coin("Ten Cent", 0.10),
                new Coin("Twenty Cent", 0.20),
                new Coin("Fifty Cent", 0.50),
                new Coin("One Euro", 1)
        };

        VendingMachine machine = new VendingMachine(products, coins);
        machine.sellProducts();
    }
}
