package lesson4.game;

import java.util.Random;

public class RockPaperScissors {
    private String gameResult;
    private int userSelection;

    public RockPaperScissors(int userSelection) {
        this.userSelection = userSelection;
    }

    public String playGame() {
        if (userSelection < 0 || userSelection > 3) {
            gameResult = "Error";
        } else {
            Random random = new Random();
            int pcSelection = random.nextInt(3);

            if (userSelection > pcSelection) {
                gameResult = "User";
            } else if (userSelection < pcSelection) {
                gameResult = "Pc";
            } else {
                gameResult = "None";
            }
        }
        return gameResult;
    }

    public void printResult(String gameResult) {
        switch (gameResult) {
            case "User":
            case "Pc":
                System.out.println("Ο νικητής είναι: " + gameResult);
                break;
            case "None":
                System.out.println("Ισοπαλία");
                break;
            default:
                System.out.println("Λάθος επιλογή");
        }
    }
}
