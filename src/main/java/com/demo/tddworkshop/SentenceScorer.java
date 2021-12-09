package com.demo.tddworkshop;

import java.util.stream.Collectors;

public class SentenceScorer {
    public int score(String input) {
        Integer score = input.chars().map(character -> {
            if (Character.isLowerCase(character)) {
                return 1;
            }
            if (Character.isUpperCase(character)) {
                return 2;
            }

            return 0;
        }).sum();

        return score;
    }
}
