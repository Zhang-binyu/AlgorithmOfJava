package leet_code.algorithms.easy_questions;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 哨兵节点，方便返回结果
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // 连接剩余部分
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    @SuppressWarnings({"unused"})
    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode setNext(ListNode next) {
            if (this.next == null) {
                this.next = next;
                return this;
            }
            this.next.next = next;
            return next;
        }
    }
}
