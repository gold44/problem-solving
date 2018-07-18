package me.patrick.problems;

import me.patrick.Solution;

public class CambridgeEffect extends Solution {
    private int numberOfWords;
    private String correctSentence;
    private String misspellingSentence;


    public CambridgeEffect(int numberOfWords, String correctSentence, String misspellingSentence) {
        super("Cambridge Effect");
        this.numberOfWords = numberOfWords;
        this.correctSentence = correctSentence;
        this.misspellingSentence = misspellingSentence;
    }


    private void method1() {

    }


    @Override protected String execute() {
        System.out.printf("Given number of words: %s%n", numberOfWords);
        System.out.printf("Given correct sentence: %s%n", correctSentence);
        System.out.printf("Given misspelling sentence: %s%n", misspellingSentence);

        int totalPoints = 0;
        String[] correctWords = correctSentence.split("\\s+");
        String[] misspellingWords = misspellingSentence.split("\\s+");

        for (int i = 0; i < numberOfWords; i++) {

            if (correctWords[i].equals(misspellingWords[i])) {
                totalPoints += 2;
            }
            else {
                int lastIndex = correctWords[i].length() - 1;
                if (correctWords[i].charAt(0) == misspellingWords[i].charAt(0) && correctWords[i].charAt(lastIndex) == misspellingWords[i].charAt(lastIndex)) {
                    totalPoints += 1;
                }
            }
        }
        return String.valueOf(totalPoints);
    }
}
