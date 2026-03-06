package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParentheses20Test {
    final ValidParentheses20 validParentheses20 = new ValidParentheses20();

    final boolean firstAnswer = true;
    final boolean secondAnswer = true;
    final boolean thirdAnswer = false;
    final boolean forthAnswer = true;
    final boolean fifthAnswer = false;

    @Test
    void isValid() {
        final boolean firstExample = validParentheses20.isValid("()");
        final boolean secondExample = validParentheses20.isValid("()[]{}");
        final boolean thirdExample = validParentheses20.isValid("(]");
        final boolean forthExample = validParentheses20.isValid("([])");
        final boolean fifthExample = validParentheses20.isValid("([)]");

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
        assertEquals(fifthAnswer, fifthExample);
    }
}