package com.Neha7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class ComparisonReport {

    private ArrayList<String> commonWords;
    private ArrayList<String> uniqueWordsA;
    private ArrayList<String> uniqueWordsB;
    private ArrayList<String> commonSentences;

    private HashMap<String, Integer> frequencyA;
    private HashMap<String, Integer> frequencyB;

    private double similarity;

    public ComparisonReport(
            ArrayList<String> commonWords,
            ArrayList<String> uniqueWordsA,
            ArrayList<String> uniqueWordsB,
            ArrayList<String> commonSentences,
            HashMap<String, Integer> frequencyA,
            HashMap<String, Integer> frequencyB,
            double similarity) {

        this.commonWords = commonWords;
        this.uniqueWordsA = uniqueWordsA;
        this.uniqueWordsB = uniqueWordsB;
        this.commonSentences = commonSentences;
        this.frequencyA = frequencyA;
        this.frequencyB = frequencyB;
        this.similarity = similarity;
    }

    public void displayReport() {

        System.out.println("\n========== COMPARISON REPORT ==========");

        System.out.println("\nCommon Words:");
        displayList(commonWords);

        System.out.println("\nWords Only in Text 1:");
        displayList(uniqueWordsA);

        System.out.println("\nWords Only in Text 2:");
        displayList(uniqueWordsB);

        System.out.println("\nCommon Sentences:");
        displayList(commonSentences);

        System.out.println("\nCommon Word Frequencies:");

        if (commonWords.isEmpty()) {
            System.out.println("No common words found.");
        } else {
            for (String word : commonWords) {
                System.out.println(
                        word + " -> Text 1: "
                                + frequencyA.get(word)
                                + ", Text 2: "
                                + frequencyB.get(word)
                );
            }
        }

        System.out.printf(
                Locale.ROOT,
                "\nWord-Set Similarity: %.2f%%%n",
                similarity
        );

        System.out.println("=======================================");
        System.out.println(
                "Note: Similarity indicates word overlap, "
                        + "not proof of plagiarism."
        );
    }

    private void displayList(ArrayList<String> list) {

        if (list.isEmpty()) {
            System.out.println("No results found.");
            return;
        }

        for (String item : list) {
            System.out.println("- " + item);
        }
    }
}