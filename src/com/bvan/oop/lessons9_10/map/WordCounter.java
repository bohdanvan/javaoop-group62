package com.bvan.oop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class WordCounter {

    public static void main(String[] args) {
        List<String> words = createLanguages();
        Map<String, Integer> wordToCount = countWords(words);

        TreeMap<String, Integer> sortedWordToCount = new TreeMap<>(wordToCount);
        System.out.println(sortedWordToCount);
    }

    private static List<String> createLanguages() {
        return Arrays.asList(
                "Java",
                "Java",
                "Kotlin",
                "Java",
                "Java",
                "Fortran",
                "Cobol",
                "Cobol",
                "Ruby",
                "Kotlin",
                "C#",
                "C#",
                "Java",
                "C#"
        );
    }

    public static Map<String, Integer> countWords(Collection<String> words) {
        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }
}
