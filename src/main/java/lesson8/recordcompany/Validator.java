package lesson8.recordcompany;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {
    public static int getIntInput(String message, Scanner scanner) {
        int selection = 0;
        try {
            System.out.println(message);
            selection = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
        }
        return selection;
    }
}
