package lesson5.vendingmachine;

public class Coin {
    private String name;
    private double value;

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void printCoinDetails() {
        System.out.println("value: " + String.format("%.2f", value) + " euro");
    }

    public double getValue() {
        return value;
    }
}
