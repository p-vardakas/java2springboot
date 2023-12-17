package lesson7.words;

import java.util.*;

public class TextProcessor {
    private static StringBuilder getWordsAsStringBuilder(List<String> words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word).append(" ");
        }
        return stringBuilder;
    }

    private static List<String> cleanUpAndGetWords(String text) {
        String[] words = text.toLowerCase()
                .replace(".", "")
                .split(" ");
        return Arrays.asList(words);
    }

    public void printWordsAlphabetically(String text) {
        System.out.println("Print words alphabetically");

        List<String> words = cleanUpAndGetWords(text);
        words.sort(Comparator.naturalOrder());

        StringBuilder stringBuilder = getWordsAsStringBuilder(words);

        System.out.println(stringBuilder);
        System.out.println("Total words: " + words.size());
    }

    public void printDistinctWords(String text) {
        System.out.println("Print Distinct Words");

        Set<String> distinctWords = findDistinctWords(text);

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : distinctWords) {
            stringBuilder.append(word).append(" ");
        }

        System.out.println(stringBuilder);
        System.out.println("Total distinct words: " + distinctWords.size());
    }

    public void printDistinctWordsAlphabetically(String text) {
        System.out.println("Print Distinct Words Alphabetically");

        Set<String> distinctWords = findDistinctWords(text);
        List<String> sortedDistinctWords = new ArrayList<>();
        sortedDistinctWords.addAll(distinctWords);
        sortedDistinctWords.sort(Comparator.naturalOrder());

        StringBuilder stringBuilder = getWordsAsStringBuilder(sortedDistinctWords);

        System.out.println(stringBuilder);
    }

    public void printWordOccurrences(String text) {
        System.out.println("Print word occurrences");

        Map<String, Integer> duplicateWordOccurrences = findDuplicateWordOccurrences(text);
        for (Map.Entry<String, Integer> entry : duplicateWordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printTextWithReplacedWord(String text, String wordToReplace, String replacementWord) {
        System.out.println("Print text with replaced word");

        List<String> words = cleanUpAndGetWords(text);

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equalsIgnoreCase(wordToReplace)) {
                words.set(i, replacementWord);
            }
        }

        System.out.println(String.join(" ", words));
    }

    public void printWordsWithFirstCapitalLetter(String text) {
        System.out.println("Print words with first letter capital");
        List<String> words = cleanUpAndGetWords(text);
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            String wordWithCapital = word.substring(0, 1).toUpperCase() + word.substring(1);
            stringBuilder.append(wordWithCapital).append(" ");
        }
        System.out.println(stringBuilder);
    }

    private Set<String> findDistinctWords(String text) {
        List<String> words = cleanUpAndGetWords(text);
        Set<String> distinctWords = new HashSet<>(words);
        return distinctWords;
    }

    private Map<String, Integer> findDuplicateWordOccurrences(String text) {
        List<String> words = cleanUpAndGetWords(text);
        Map<String, Integer> wordOccurrences = new HashMap<>();
        for (String word : words) {
            if (wordOccurrences.containsKey(word)) {
                wordOccurrences.put(word, wordOccurrences.get(word) + 1);
            } else {
                wordOccurrences.put(word, 1);
            }
        }
        return wordOccurrences;
    }
}
