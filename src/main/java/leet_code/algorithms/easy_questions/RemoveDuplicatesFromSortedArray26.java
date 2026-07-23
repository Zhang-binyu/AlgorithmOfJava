package leet_code.algorithms.easy_questions;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray26 {
    /// 哈希集合解法
    /// 时间复杂度: O(n)
    /// 空间复杂度: O(n)
    public int removeDuplicatesUsingHashSet(int[] nums) {
        final HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : nums) {
            final boolean success = set.add(num);
            if (success) {
                nums[index++] = num;
            }
        }
        return set.size();
    }

    /// 快慢指针解法
    /// 时间复杂度: O(n)
    /// 空间复杂度: O(1)
    public int removeDuplicatesDoublePointer(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[slow]) {
                continue;
            }
            slow++;
            nums[slow] = nums[fast];
        }

        return slow + 1;
    }
}
