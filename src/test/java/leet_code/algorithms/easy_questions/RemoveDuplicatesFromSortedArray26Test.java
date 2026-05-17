package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArray26Test {
    private final RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray26 = new RemoveDuplicatesFromSortedArray26();

    private final int firstAnswer = 2;
    private final int secondAnswer = 5;

    @Test
    public void removeDuplicatesUsingHashSet() {
        final int[] firstExample = {1, 1, 2};
        final int[] secondExample = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(firstAnswer, removeDuplicatesFromSortedArray26.removeDuplicatesUsingHashSet(firstExample));
        assertEquals(secondAnswer, removeDuplicatesFromSortedArray26.removeDuplicatesUsingHashSet(secondExample));
    }

    @Test
    public void removeDuplicatesDoublePointer() {
        final int[] firstExample = {1, 1, 2};
        final int[] secondExample = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(firstAnswer, removeDuplicatesFromSortedArray26.removeDuplicatesDoublePointer(firstExample));
        assertEquals(secondAnswer, removeDuplicatesFromSortedArray26.removeDuplicatesDoublePointer(secondExample));
    }
}
