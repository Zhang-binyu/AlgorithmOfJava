package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseInteger7Test {
    private final ReverseInteger7 reverseInteger7 = new ReverseInteger7();

    @Test
    void reverse() {
        final int firstAnswer = 321;
        final int secondAnswer = -321;
        final int thirdAnswer = 21;
        final int forthAnswer = -201;

        final int firstExample = reverseInteger7.reverse(123);
        final int secondExample = reverseInteger7.reverse(-123);
        final int thirdExample = reverseInteger7.reverse(120);
        final int forthExample = reverseInteger7.reverse(-102);

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
    }
}