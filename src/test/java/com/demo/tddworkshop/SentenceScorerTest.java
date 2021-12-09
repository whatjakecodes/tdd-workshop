package com.demo.tddworkshop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SentenceScorerTest {
    @Test
    void lowercaseCharacters_score1PointEach() {
        // arrange: a string with 11 lowercase characters

        // act: when input is scored

        // assert: output is 11
        assertThat(output).isEqualTo(11);

        // where does "output" come from?
    }
}
