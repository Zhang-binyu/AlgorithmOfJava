package leet_code.algorithms.medium_questions;

public class ContainerWithMostWater11 {
    /// 时间复杂度: O(n)
    ///
    /// 空间复杂度: O(1)
    public int maxArea(int[] height) {
        // 如果输入数组为空或者长度为零，则返回
        if (height == null || height.length == 0) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int maxArea = 0;

        while (leftPointer < rightPointer) {
            maxArea = Math.max(maxArea, Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer));
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxArea;
    }
}
