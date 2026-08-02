package leet_code.algorithms.medium_questions;

public class StringToInteger8 {
    /// 时间复杂度: O(n)
    ///
    /// 空间复杂度: O(1)
    public int myAtoi(String s) {
        final int length = s.length();
        int index = 0;

        // 去空格
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }

        // 符号
        int sign = 1;
        if (index < length && s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (index < length && s.charAt(index) == '+') {
            index++;
        }

        // 数字转换
        int ans = 0;
        while (index < length && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            // 溢出判断
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            index++;
        }

        return ans * sign;
    }
}
