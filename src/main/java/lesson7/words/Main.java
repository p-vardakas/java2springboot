package lesson7.words;

public class Main {
    public static void main(String[] args) {
        String text = "Dude Java is like the rockstar of programming languages and " +
                "here is why I'm totally into it. First off it is the ultimate multi tasker write " +
                "code once run it anywhere. No platform drama just smooth compatibility. " +
                "Java is the best.";

        TextProcessor textProcessor = new TextProcessor();
        textProcessor.printWordsAlphabetically(text);
        System.out.println("------------------------------");
        textProcessor.printDistinctWords(text);
        System.out.println("------------------------------");
        textProcessor.printDistinctWordsAlphabetically(text);
        System.out.println("------------------------------");
        textProcessor.printTextWithReplacedWord(text, "Java", "Lava");
        System.out.println("------------------------------");
        textProcessor.printWordOccurrences(text);
        System.out.println("------------------------------");
        textProcessor.printWordsWithFirstCapitalLetter(text);
    }
}
