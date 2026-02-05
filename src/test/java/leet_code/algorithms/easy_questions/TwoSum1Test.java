package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSum1Test {

    @Test
    void twoSum() {
        final TwoSum1 twoSum1 = new TwoSum1();

        final int[] firstExample = twoSum1.twoSum(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = twoSum1.twoSum(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = twoSum1.twoSum(new int[]{3, 3}, 6);

        final int[] firstAnswer = new int[]{0, 1};
        final int[] secondAnswer = new int[]{0, 2};
        final int[] thirdAnswer = new int[]{0, 1};

        assertArrayEquals(firstExample, firstAnswer);
        assertArrayEquals(secondExample, secondAnswer);
        assertArrayEquals(thirdExample, thirdAnswer);
    }

    @Test
    void twoSumForce() {
        final TwoSum1 twoSum1 = new TwoSum1();

        final int[] firstExample = twoSum1.twoSumForce(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = twoSum1.twoSumForce(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = twoSum1.twoSumForce(new int[]{3, 3}, 6);

        final int[] firstAnswer = new int[]{0, 1};
        final int[] secondAnswer = new int[]{0, 2};
        final int[] thirdAnswer = new int[]{0, 1};

        assertArrayEquals(firstAnswer, firstExample);
        assertArrayEquals(secondAnswer, secondExample);
        assertArrayEquals(thirdAnswer, thirdExample);
    }

    @Test
    void twoSumHashMap() {
        final TwoSum1 twoSum1 = new TwoSum1();

        final int[] firstExample = twoSum1.twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = twoSum1.twoSumHashMap(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = twoSum1.twoSumHashMap(new int[]{3, 3}, 6);

        final int[] firstAnswer = new int[]{0, 1};
        final int[] secondAnswer = new int[]{0, 2};
        final int[] thirdAnswer = new int[]{0, 1};

        assertArrayEquals(firstAnswer, firstExample);
        assertArrayEquals(secondAnswer, secondExample);
        assertArrayEquals(thirdAnswer, thirdExample);
    }

    @Test
    void twoSumSortDoublePointers() {
        final TwoSum1 twoSum1 = new TwoSum1();

        final int[] firstExample = twoSum1.twoSumSortDoublePointers(new int[]{2, 7, 11, 15}, 9);
        final int[] secondExample = twoSum1.twoSumSortDoublePointers(new int[]{3, 2, 4}, 7);
        final int[] thirdExample = twoSum1.twoSumSortDoublePointers(new int[]{3, 3}, 6);

        final int[] firstAnswer = new int[]{0, 1};
        final int[] secondAnswer = new int[]{0, 2};
        final int[] thirdAnswer = new int[]{0, 1};

        assertArrayEquals(firstAnswer, firstExample);
        assertArrayEquals(secondAnswer, secondExample);
        assertArrayEquals(thirdAnswer, thirdExample);
    }
}