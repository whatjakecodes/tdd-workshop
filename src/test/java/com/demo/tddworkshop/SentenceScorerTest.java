package com.demo.tddworkshop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SentenceScorerTest {
    @Test
    void lowercaseCharacters_score1PointEach() {
        SentenceScorer sentenceScorer = new SentenceScorer();
        // arrange: a string with 11 lowercase characters
        String input = "scenario one";
        // arrange: a string with 3 lowercase characters
        String input2 = "abc";

        // act: when input is scored
        int output = sentenceScorer.score(input);
        int output2 = sentenceScorer.score(input2);

        // assert: output is 11
        assertThat(output).isEqualTo(11);
        // assert: output is 3
        assertThat(output2).isEqualTo(3);
    }
}
