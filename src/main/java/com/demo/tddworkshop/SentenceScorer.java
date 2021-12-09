package com.demo.tddworkshop;

public class SentenceScorer {
    public int score(String input) {
        return input.replace(" ", "").length();
    }
}
