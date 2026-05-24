package leet_code.algorithms.easy_questions;

public class RemoveElement27 {
    /// 快慢指针
    /// 时间复杂度: O(n)
    /// 空间复杂度: O(1)
    public int removeElementSlowFast(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) nums[slow++] = nums[fast];
        }
        return slow;
    }
}
