package com.demo.tddworkshop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SentenceScorerTest {
    @Test
    void lowercaseCharacters_score1PointEach() {
        // arrange: a string with 11 lowercase characters
        SentenceScorer sentenceScorer = new SentenceScorer();
        String input = "scenario one";

        // act: when input is scored
        int output = sentenceScorer.score(input);

        // assert: output is 11
        assertThat(output).isEqualTo(11);
    }
}
