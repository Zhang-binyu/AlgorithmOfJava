package leet_code.algorithms.medium_questions;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    /// 使用哈希集合的方式。
    ///
    /// 时间复杂度: O(n)
    ///
    /// 空间复杂度: O(n)
    public int usingHashSet(String s) {
        final HashSet<Character> hashSet = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            final char current = s.charAt(right);

            while (hashSet.contains(current)) {
                final char leftChar = s.charAt(left);
                hashSet.remove(leftChar);
                left++;
            }

            hashSet.add(current);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /// 使用数组的方式。
    ///
    /// 时间复杂度: O(n)
    ///
    /// 空间复杂度: O(1)
    public int usingIntArray(String s) {
        // ASCII字符一共128个
        // index: 字符
        // value: 字符上一次出现的位置 + 1
        int[] lastIndex = new int[128];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            final char c = s.charAt(right);

            // 如果当前字符之前出现过
            // left直接跳到重复字符之后
            left = Math.max(left, lastIndex[c]);

            // 更新最长长度
            maxLength = Math.max(maxLength, right - left + 1);

            // 保存当前字符最新位置
            // +1 是为了区分默认值0
            lastIndex[c] = right + 1;
        }

        return maxLength;
    }
}
