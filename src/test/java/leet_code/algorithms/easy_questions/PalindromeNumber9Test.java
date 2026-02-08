package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeNumber9Test {
    @Test
    void isPalindromeForce() {
        final PalindromeNumber9 palindromeNumber9 = new PalindromeNumber9();

        final boolean firstExample = palindromeNumber9.isPalindromeForce(121);
        final boolean secondExample = palindromeNumber9.isPalindromeForce(-121);
        final boolean thirdExample = palindromeNumber9.isPalindromeForce(10);
        final boolean forthExample = palindromeNumber9.isPalindromeForce(11);
        final boolean fifthExample = palindromeNumber9.isPalindromeForce(100);

        final boolean firstAnswer = true;
        final boolean secondAnswer = false;
        final boolean thirdAnswer = false;
        final boolean forthAnswer = true;
        final boolean fifthAnswer = false;

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
        assertEquals(fifthAnswer, fifthExample);
    }

    @Test
    void isPalindromeFlipHalf() {
        final PalindromeNumber9 palindromeNumber9 = new PalindromeNumber9();

        final boolean firstExample = palindromeNumber9.isPalindromeFlipHalf(121);
        final boolean secondExample = palindromeNumber9.isPalindromeFlipHalf(-121);
        final boolean thirdExample = palindromeNumber9.isPalindromeFlipHalf(10);
        final boolean forthExample = palindromeNumber9.isPalindromeFlipHalf(11);
        final boolean fifthExample = palindromeNumber9.isPalindromeFlipHalf(100);

        final boolean firstAnswer = true;
        final boolean secondAnswer = false;
        final boolean thirdAnswer = false;
        final boolean forthAnswer = true;
        final boolean fifthAnswer = false;

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
        assertEquals(fifthAnswer, fifthExample);
    }

    @Test
    void isPalindromeCompareFirstLast() {
        final PalindromeNumber9 palindromeNumber9 = new PalindromeNumber9();

        final boolean firstExample = palindromeNumber9.isPalindromeCompareFirstLast(121);
        final boolean secondExample = palindromeNumber9.isPalindromeCompareFirstLast(-121);
        final boolean thirdExample = palindromeNumber9.isPalindromeCompareFirstLast(10);
        final boolean forthExample = palindromeNumber9.isPalindromeCompareFirstLast(11);
        final boolean fifthExample = palindromeNumber9.isPalindromeCompareFirstLast(100);

        final boolean firstAnswer = true;
        final boolean secondAnswer = false;
        final boolean thirdAnswer = false;
        final boolean forthAnswer = true;
        final boolean fifthAnswer = false;

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
        assertEquals(fifthAnswer, fifthExample);
    }
}