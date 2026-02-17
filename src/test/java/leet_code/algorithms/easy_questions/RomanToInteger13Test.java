package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToInteger13Test {
    final RomanToInteger13 romanToInteger13 = new RomanToInteger13();

    final int firstAnswer = 3;
    final int secondAnswer = 58;
    final int thirdAnswer = 1994;
    final int forthAnswer = 4;

    @Test
    void romanToInt() {
        final int firstExample = romanToInteger13.romanToInt("III");
        final int secondExample = romanToInteger13.romanToInt("LVIII");
        final int thirdExample = romanToInteger13.romanToInt("MCMXCIV");
        final int forthExample = romanToInteger13.romanToInt("IV");

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
    }
}