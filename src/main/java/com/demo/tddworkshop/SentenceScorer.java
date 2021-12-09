package com.demo.tddworkshop;

public class SentenceScorer {
    public int score(String input) {
        Integer score = input.chars().map(character -> {
            if (Character.isLowerCase(character)) {
                return 1;
            }
            if (Character.isUpperCase(character)) {
                return 2;
            }
            if (Character.isWhitespace(character)) {
                return 0;
            }

            return 3;
        }).sum();

        return score;
    }
}
