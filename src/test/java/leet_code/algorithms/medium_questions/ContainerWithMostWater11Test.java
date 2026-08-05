package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWater11Test {
    private final ContainerWithMostWater11 containerWithMostWater11 = new ContainerWithMostWater11();

    @Test
    void maxArea() {
        final int firstAnswer = 49;
        final int secondAnswer = 1;

        final int firstExample = containerWithMostWater11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7,});
        final int secondExample = containerWithMostWater11.maxArea(new int[]{1, 1,});

        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
    }
}