package com.Neha7;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class TextComparator {

    public ComparisonReport compare(
            TextDocument documentA,
            TextDocument documentB) {

        ArrayList<String> wordsA = documentA.getWords();
        ArrayList<String> wordsB = documentB.getWords();

        HashMap<String, Integer> frequencyA = countWords(wordsA);
        HashMap<String, Integer> frequencyB = countWords(wordsB);

        HashSet<String> setA = new HashSet<>(wordsA);
        HashSet<String> setB = new HashSet<>(wordsB);

        HashSet<String> commonSet = new HashSet<>(setA);
        commonSet.retainAll(setB);

        HashSet<String> uniqueSetA = new HashSet<>(setA);
        uniqueSetA.removeAll(setB);

        HashSet<String> uniqueSetB = new HashSet<>(setB);
        uniqueSetB.removeAll(setA);

        ArrayList<String> commonWords =
                new ArrayList<>(commonSet);

        ArrayList<String> uniqueWordsA =
                new ArrayList<>(uniqueSetA);

        ArrayList<String> uniqueWordsB =
                new ArrayList<>(uniqueSetB);

        ArrayList<String> commonSentences =
                findCommonSentences(
                        documentA.getSentences(),
                        documentB.getSentences()
                );

        // Jaccard similarity using unique words
        HashSet<String> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);

        double similarity = 0.0;

        if (!unionSet.isEmpty()) {
            similarity = (double) commonSet.size()
                    / unionSet.size() * 100;
        }

        return new ComparisonReport(
                commonWords,
                uniqueWordsA,
                uniqueWordsB,
                commonSentences,
                frequencyA,
                frequencyB,
                similarity
        );
    }

    private HashMap<String, Integer> countWords(
            ArrayList<String> words) {

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(
                    word,
                    frequency.getOrDefault(word, 0) + 1
            );
        }

        return frequency;
    }

    private ArrayList<String> findCommonSentences(
            ArrayList<String> sentencesA,
            ArrayList<String> sentencesB) {

        HashSet<String> normalizedB = new HashSet<>();

        for (String sentence : sentencesB) {
            normalizedB.add(normalizeSentence(sentence));
        }

        HashSet<String> alreadyAdded = new HashSet<>();
        ArrayList<String> commonSentences = new ArrayList<>();

        for (String sentence : sentencesA) {

            String normalized = normalizeSentence(sentence);

            if (normalizedB.contains(normalized)
                    && alreadyAdded.add(normalized)) {

                commonSentences.add(sentence);
            }
        }

        return commonSentences;
    }

    private String normalizeSentence(String sentence) {
        return sentence.toLowerCase(Locale.ROOT)
                .replaceAll("[^\\p{L}\\p{N}]+", " ")
                .trim();
    }
}