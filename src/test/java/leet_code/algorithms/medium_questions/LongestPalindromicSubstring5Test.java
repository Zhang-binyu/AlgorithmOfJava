package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstring5Test {
    private final LongestPalindromicSubstring5 longestPalindromicSubstring5 = new LongestPalindromicSubstring5();

    @Test
    void manachersAlgorithm() {
        final String firstAnswer = "bab";
        final String secondAnswer = "bb";

        final String firstExample = longestPalindromicSubstring5.manachersAlgorithm("babad");
        final String secondExample = longestPalindromicSubstring5.manachersAlgorithm("cbbd");

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
    }
}