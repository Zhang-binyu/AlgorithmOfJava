package leet_code.algorithms.medium_questions;

public class LongestPalindromicSubstring5 {
    /// 马拉车算法
    ///
    /// 时间复杂度: O(n)
    ///
    /// 空间复杂度: O(n)
    public String manachersAlgorithm(String s) {
        // 处理后的字符串
        final StringBuilder stringBuilder = new StringBuilder("^");

        for (char c : s.toCharArray()) {
            stringBuilder.append("#").append(c);
        }

        stringBuilder.append("#$");

        final String t = stringBuilder.toString();

        final int n = t.length();

        final int[] p = new int[n];

        int center = 0;
        int right = 0;

        int maxCenter = 0;
        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {
            // 镜像位置
            final int mirror = 2 * center - i;

            // 利用之前的信息
            if (i < right) p[i] = Math.min(right - i, p[mirror]);

            // 中心扩展
            while (t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) p[i]++;

            // 更新最右边界
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // 记录最大
            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        // 还原字符串
        final int start = (maxCenter - maxLen) / 2;

        return s.substring(start, start + maxLen);
    }
}
