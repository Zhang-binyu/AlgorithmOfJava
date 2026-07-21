package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharacters3Test {
    private final LongestSubstringWithoutRepeatingCharacters3 instance =
            new LongestSubstringWithoutRepeatingCharacters3();

    @Test
    void usingHashSet() {
        final int firstAnswer = 3;
        final int secondAnswer = 1;
        final int thirdAnswer = 3;
        final int forthAnswer = 2;
        final int firstExample = instance.usingHashSet("abcabcbb");
        final int secondExample = instance.usingHashSet("bbbbb");
        final int thirdExample = instance.usingHashSet("pwwkew");
        final int forthExample = instance.usingHashSet("aab");
        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
    }

    @Test
    void usingIntArray() {
        final int firstAnswer = 3;
        final int secondAnswer = 1;
        final int thirdAnswer = 3;
        final int forthAnswer = 2;
        final int firstExample = instance.usingIntArray("abcabcbb");
        final int secondExample = instance.usingIntArray("bbbbb");
        final int thirdExample = instance.usingIntArray("pwwkew");
        final int forthExample = instance.usingIntArray("aab");
        assertEquals(firstAnswer, firstExample);
        assertEquals(secondAnswer, secondExample);
        assertEquals(thirdAnswer, thirdExample);
        assertEquals(forthAnswer, forthExample);
    }
}