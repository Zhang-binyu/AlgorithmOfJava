package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElement27Test {
    private final RemoveElement27 mRemoveElement27 = new RemoveElement27();

    private final int mFirstAnswer = 2;
    private final int mSecondAnswer = 5;

    @Test
    void removeElementSlowFast() {
        final int firstExample = mRemoveElement27.removeElementSlowFast(new int[]{3, 2, 2, 3}, 3);
        final int secondExample = mRemoveElement27.removeElementSlowFast(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        assertEquals(mFirstAnswer, firstExample);
        assertEquals(mSecondAnswer, secondExample);
    }
}