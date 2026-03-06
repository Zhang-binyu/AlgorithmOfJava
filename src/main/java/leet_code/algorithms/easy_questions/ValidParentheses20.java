package leet_code.algorithms.easy_questions;

import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        final int length = s.length();
        if (length == 0 || length % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (character == ')' && top != '(') return false;
                if (character == ']' && top != '[') return false;
                if (character == '}' && top != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}
