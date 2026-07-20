package leet_code.algorithms.medium_questions;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers2 {
    /// 时间复杂度: O(max(l1的长度, l2的长度))
    ///
    /// 空间复杂度: O(1)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        final ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    /// Definition for singly-linked list.
    public static class ListNode {
        public final int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public List<Integer> toIntegerList() {
            List<Integer> result = new ArrayList<>();

            ListNode current = this;

            while (current != null) {
                result.add(current.val);
                current = current.next;
            }

            return result;
        }
    }
}
