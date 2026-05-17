package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSum1Test {
    private final TwoSum1 mTwoSum1 = new TwoSum1();

    private final int[] mFirstAnswer = new int[]{0, 1};
    private final int[] mSecondAnswer = new int[]{0, 2};
    private final int[] mThirdAnswer = new int[]{0, 1};

    @Test
    void twoSumForce() {
        final int[] firstExample = mTwoSum1.twoSumForce(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = mTwoSum1.twoSumForce(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = mTwoSum1.twoSumForce(new int[]{3, 3}, 6);

        assertArrayEquals(mFirstAnswer, firstExample);
        assertArrayEquals(mSecondAnswer, secondExample);
        assertArrayEquals(mThirdAnswer, thirdExample);
    }

    @Test
    void twoSumHashMap() {
        final int[] firstExample = mTwoSum1.twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = mTwoSum1.twoSumHashMap(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = mTwoSum1.twoSumHashMap(new int[]{3, 3}, 6);

        assertArrayEquals(mFirstAnswer, firstExample);
        assertArrayEquals(mSecondAnswer, secondExample);
        assertArrayEquals(mThirdAnswer, thirdExample);
    }

    @Test
    void twoSumSortDoublePointers() {
        final int[] firstExample = mTwoSum1.twoSumSortDoublePointers(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = mTwoSum1.twoSumSortDoublePointers(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = mTwoSum1.twoSumSortDoublePointers(new int[]{3, 3}, 6);

        assertArrayEquals(mFirstAnswer, firstExample);
        assertArrayEquals(mSecondAnswer, secondExample);
        assertArrayEquals(mThirdAnswer, thirdExample);
    }
}