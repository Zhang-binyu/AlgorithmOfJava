package leet_code.algorithms.easy_questions;

public class PalindromeNumber9 {
    /// 暴力解法
    /// 时间复杂度 O(n)
    /// 空间复杂度 O(n)
    public boolean isPalindromeForce(int x) {
        if (x < 0) return false; // 负数不可能是回文
        if (x < 10) return true; // 个位数一定是回文
        final String parsedStr = Integer.toString(x);
        final char[] characters = parsedStr.toCharArray(); // 这里需要 O(n) 的空间复杂度

        // 循环需要 O(n) 的时间复杂度
        for (int index = 0; index < characters.length; index++) {
            final char firstCharacter = characters[index];
            final char secondCharacter = characters[characters.length - index - 1];
            if (firstCharacter != secondCharacter) return false;
        }

        return true;
    }

    /// 半数翻转解法
    /// 时间复杂度 O(lg(n))
    /// 空间复杂度 O(1)
    public boolean isPalindromeFlipHalf(int x) {
        // 负数不是回文
        // 如果数字最后一位是0，为了是回文，该数字本身必须是0
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int revertedNumber = 0; // 被翻转后的数字，后续与前半部分进行比较判断是否一致
        while (x > revertedNumber) {
            revertedNumber = x % 10 + revertedNumber * 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    /// 全数翻转解法
    /// 时间复杂度 O(lg(n))
    /// 空间复杂度 O(1)
    /// 优点：不需要转字符串，完全符合“首尾指针”的逻辑。
    /// 缺点：div 可能会在极端情况下接近 int 溢出边界。
    public boolean isPalindromeCompareFirstLast(int x) {
        if (x < 0) return false; // 负数不可能是回文
        if (x < 10) return true; // 个位数一定是回文

        final int xBackUp = x; // 入参副本
        int revertedNumber = 0; // 被翻转后的数字，后续与翻转前的数字进行比较
        while (x > 0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return revertedNumber == xBackUp;
    }
}
