package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefix14Test {
    final LongestCommonPrefix14 longestCommonPrefix14 = new LongestCommonPrefix14();

    final String firstAnswer = "fl";
    final String secondAnswer = "";

    @Test
    void longestCommonPrefix() {
        final String firstExample = longestCommonPrefix14.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        final String secondExample = longestCommonPrefix14.longestCommonPrefix(new String[]{"dog", "racecar", "car"});

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
    }

    @Test
    void useComparison() {
        final String firstExample = longestCommonPrefix14.useComparison(new String[]{"flower", "flow", "flight"});
        final String secondExample = longestCommonPrefix14.useComparison(new String[]{"dog", "racecar", "car"});

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
    }

    @Test
    void useSort() {
        final String firstExample = longestCommonPrefix14.useSort(new String[]{"flower", "flow", "flight"});
        final String secondExample = longestCommonPrefix14.useSort(new String[]{"dog", "racecar", "car"});

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
    }
}