package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToInteger8Test {
    private final StringToInteger8 stringToInteger8 = new StringToInteger8();

    @Test
    void myAtoi() {
        final int firstAnswer = 42;
        final int secondAnswer = -42;
        final int thirdAnswer = 1337;
        final int forthAnswer = 0;
        final int fifthAnswer = 0;

        final int firstExample = stringToInteger8.myAtoi("42");
        final int secondExample = stringToInteger8.myAtoi(" -042");
        final int thirdExample = stringToInteger8.myAtoi("1337c0d3");
        final int forthExample = stringToInteger8.myAtoi("0-1");
        final int fifthExample = stringToInteger8.myAtoi("words and 987");

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
        assertEquals(fifthAnswer, fifthExample);
    }
}