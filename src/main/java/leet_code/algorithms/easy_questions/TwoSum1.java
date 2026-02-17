package leet_code.algorithms.easy_questions;

import java.util.*;

public class TwoSum1 {
    // 暴力破解
    public int[] twoSumForce(int[] numbers, int target) {
        final int[] result = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            final int previousNumber = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                final int nextNumber = numbers[j];
                if (previousNumber + nextNumber == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // 哈希Map解法
    public int[] twoSumHashMap(int[] numbers, int target) {
        final Map<Integer, Integer> cache = new HashMap<>();

        for (int numberIndex = 0; numberIndex < numbers.length; numberIndex++) {
            final int expectedValue = target - numbers[numberIndex];

            // 如果Map已经存过另一个匹配的值时
            if (cache.containsKey(expectedValue)) {
                return new int[]{cache.get(expectedValue), numberIndex};
            }

            // 没遇到的时候，把自己存进去
            cache.put(numbers[numberIndex], numberIndex);
        }

        return new int[0];
    }

    // 排序+双指针，最强解法
    public int[] twoSumSortDoublePointers(int[] numbers, int target) {
        final List<Node> cache = new ArrayList<>();
        for (int index = 0; index < numbers.length; index++) {
            cache.add(new Node(index, numbers[index]));
        }
        cache.sort(Comparator.comparingInt(Node::getValue));
        int left = 0;
        int right = cache.size() - 1;
        while (left < right) {
            final Node leftNode = cache.get(left);
            final Node rightNode = cache.get(right);
            final int leftValue = leftNode.getValue();
            final int rightValue = rightNode.getValue();
            final int leftIndex = leftNode.getIndex();
            final int rightIndex = rightNode.getIndex();
            if (leftValue + rightValue == target) return new int[]{leftIndex, rightIndex};
            if (leftValue + rightValue < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    static final class Node {
        private final int index;
        private final int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Node) obj;
            return this.index == that.index &&
                    this.value == that.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, value);
        }

        @Override
        public String toString() {
            return "Node[" +
                    "index=" + index + ", " +
                    "value=" + value + ']';
        }
    }
}
