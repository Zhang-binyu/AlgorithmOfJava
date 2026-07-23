package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeNumber9Test {
    private final PalindromeNumber9 mPalindromeNumber9 = new PalindromeNumber9();

    private final boolean mFirstAnswer = true;
    private final boolean mSecondAnswer = false;
    private final boolean mThirdAnswer = false;
    private final boolean mForthAnswer = true;
    private final boolean mFifthAnswer = false;

    @Test
    void isPalindromeForce() {
        final boolean firstExample = mPalindromeNumber9.isPalindromeForce(121);
        final boolean secondExample = mPalindromeNumber9.isPalindromeForce(-121);
        final boolean thirdExample = mPalindromeNumber9.isPalindromeForce(10);
        final boolean forthExample = mPalindromeNumber9.isPalindromeForce(11);
        final boolean fifthExample = mPalindromeNumber9.isPalindromeForce(100);

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
        assertEquals(mThirdAnswer, thirdExample);
        assertEquals(mForthAnswer, forthExample);
        assertEquals(mFifthAnswer, fifthExample);
    }

    @Test
    void isPalindromeFlipHalf() {
        final boolean firstExample = mPalindromeNumber9.isPalindromeFlipHalf(121);
        final boolean secondExample = mPalindromeNumber9.isPalindromeFlipHalf(-121);
        final boolean thirdExample = mPalindromeNumber9.isPalindromeFlipHalf(10);
        final boolean forthExample = mPalindromeNumber9.isPalindromeFlipHalf(11);
        final boolean fifthExample = mPalindromeNumber9.isPalindromeFlipHalf(100);

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
        assertEquals(mThirdAnswer, thirdExample);
        assertEquals(mForthAnswer, forthExample);
        assertEquals(mFifthAnswer, fifthExample);
    }

    @Test
    void isPalindromeCompareFirstLast() {
        final boolean firstExample = mPalindromeNumber9.isPalindromeCompareFirstLast(121);
        final boolean secondExample = mPalindromeNumber9.isPalindromeCompareFirstLast(-121);
        final boolean thirdExample = mPalindromeNumber9.isPalindromeCompareFirstLast(10);
        final boolean forthExample = mPalindromeNumber9.isPalindromeCompareFirstLast(11);
        final boolean fifthExample = mPalindromeNumber9.isPalindromeCompareFirstLast(100);

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
        assertEquals(mThirdAnswer, thirdExample);
        assertEquals(mForthAnswer, forthExample);
        assertEquals(mFifthAnswer, fifthExample);
    }
}