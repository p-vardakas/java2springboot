package vendingmachine;

import java.util.Scanner;

public class VendingMachine {
    private Product[] products;
    private Coin[] coins;
    private int userSelection;
    private double userAmount;


    public VendingMachine(Product[] products, Coin[] coins) {
        this.products = products;
        this.coins = coins;
        this.userAmount = 0.0;
    }

    public void sellProducts() {
        Scanner scanner = new Scanner(System.in);

        do {
            printProducts();
            userSelection = scanner.nextInt();
        } while (userSelection < 1 || userSelection > 3);

        Product selectedProduct = products[userSelection - 1];

        System.out.println("Selected product: " + selectedProduct.getName() + " "
                + selectedProduct.getPrice());

        printCoins();
        do {
            System.out.println("Enter amount of money");
            double userInput = scanner.nextDouble();

            for (Coin coin : coins) {
                if (userInput == coin.getValue()) {
                    userAmount += userInput;
                }
            }

            if (selectedProduct.getPrice() - userAmount < 0) {
                System.out.println(" ** chance: "
                        + String.format("%.2f", Math.abs(userAmount - selectedProduct.getPrice())));
            } else {
                System.out.println(" ** remaining: "
                        + String.format("%.2f", (selectedProduct.getPrice() - userAmount)));
            }

        } while (userAmount < selectedProduct.getPrice());
    }

    private void printProducts() {
        System.out.println("Choose product with 1, 2 and 3");
        for (Product product : products) {
            product.printProductDetails();
        }
    }

    private void printCoins() {
        System.out.println("Choose:");
        for (Coin coin : coins) {
            coin.printCoinDetails();
        }
    }
}
