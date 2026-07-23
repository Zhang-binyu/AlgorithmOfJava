package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToInteger13Test {
    private final RomanToInteger13 mRomanToInteger13 = new RomanToInteger13();

    private final int mFirstAnswer = 3;
    private final int mSecondAnswer = 58;
    private final int mThirdAnswer = 1994;
    private final int mForthAnswer = 4;

    @Test
    void romanToInt() {
        final int firstExample = mRomanToInteger13.romanToInt("III");
        final int secondExample = mRomanToInteger13.romanToInt("LVIII");
        final int thirdExample = mRomanToInteger13.romanToInt("MCMXCIV");
        final int forthExample = mRomanToInteger13.romanToInt("IV");

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
        assertEquals(mThirdAnswer, thirdExample);
        assertEquals(mForthAnswer, forthExample);
    }
}