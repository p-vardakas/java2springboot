package game;

public class Game {
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors(1);
        String gameResult = game.playGame();
        game.printResult(gameResult);

        RockPaperScissors gameError = new RockPaperScissors(5);
        String gameResultError = gameError.playGame();
        game.printResult(gameResultError);
    }
}
