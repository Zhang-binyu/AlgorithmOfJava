package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversion6Test {
    private final ZigzagConversion6 zigzagConversion = new ZigzagConversion6();

    @Test
    void convert() {
        final String firstAnswer = "PAHNAPLSIIGYIR";
        final String secondAnswer = "PINALSIGYAHRPI";
        final String thirdAnswer = "A";

        final String firstExample = zigzagConversion.convert("PAYPALISHIRING", 3);
        final String secondExample = zigzagConversion.convert("PAYPALISHIRING", 4);
        final String thirdExample = zigzagConversion.convert("A", 1);

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
    }
}