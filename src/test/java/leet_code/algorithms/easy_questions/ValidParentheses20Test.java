package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParentheses20Test {
    private final ValidParentheses20 mValidParentheses20 = new ValidParentheses20();

    private final boolean mFirstAnswer = true;
    private final boolean mSecondAnswer = true;
    private final boolean mThirdAnswer = false;
    private final boolean mForthAnswer = true;
    private final boolean mFifthAnswer = false;

    @Test
    void isValid() {
        final boolean firstExample = mValidParentheses20.isValid("()");
        final boolean secondExample = mValidParentheses20.isValid("()[]{}");
        final boolean thirdExample = mValidParentheses20.isValid("(]");
        final boolean forthExample = mValidParentheses20.isValid("([])");
        final boolean fifthExample = mValidParentheses20.isValid("([)]");

        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
        assertEquals(mThirdAnswer, thirdExample);
        assertEquals(mForthAnswer, forthExample);
        assertEquals(mFifthAnswer, fifthExample);
    }
}