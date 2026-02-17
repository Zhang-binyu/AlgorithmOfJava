package leet_code.algorithms.easy_questions;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strings) {
        return useComparison(strings);
    }

    public String useComparison(String[] strings) {
        if (strings == null || strings.length == 0) return "";
        String result = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) return "";
            }
        }
        return result;
    }

    public String useSort(String[] strings) {
        if (strings == null || strings.length == 0) return "";
        Arrays.sort(strings);
        final String first = strings[0];
        final String last = strings[strings.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) i++;
        return first.substring(0, i);
    }
}
