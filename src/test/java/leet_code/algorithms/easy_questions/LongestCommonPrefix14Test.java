package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefix14Test {
    private final LongestCommonPrefix14 mLongestCommonPrefix14 = new LongestCommonPrefix14();

    private final String mFirstAnswer = "fl";
    private final String mSecondAnswer = "";

    @Test
    void longestCommonPrefix() {
        final String firstExample = mLongestCommonPrefix14.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        final String secondExample = mLongestCommonPrefix14.longestCommonPrefix(new String[]{"dog", "racecar", "car"});

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
    }

    @Test
    void useComparison() {
        final String firstExample = mLongestCommonPrefix14.useComparison(new String[]{"flower", "flow", "flight"});
        final String secondExample = mLongestCommonPrefix14.useComparison(new String[]{"dog", "racecar", "car"});

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
    }

    @Test
    void useSort() {
        final String firstExample = mLongestCommonPrefix14.useSort(new String[]{"flower", "flow", "flight"});
        final String secondExample = mLongestCommonPrefix14.useSort(new String[]{"dog", "racecar", "car"});

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
    }
}