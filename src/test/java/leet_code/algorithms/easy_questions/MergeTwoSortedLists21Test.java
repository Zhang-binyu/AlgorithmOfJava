package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedLists21Test {
    final MergeTwoSortedLists21 mergeTwoSortedLists21 = new MergeTwoSortedLists21();

    final MergeTwoSortedLists21.ListNode firstAnswer = new MergeTwoSortedLists21.ListNode().setValue(1)
            .setNext(new MergeTwoSortedLists21.ListNode().setValue(1))
            .setNext(new MergeTwoSortedLists21.ListNode().setValue(2))
            .setNext(new MergeTwoSortedLists21.ListNode().setValue(3))
            .setNext(new MergeTwoSortedLists21.ListNode().setValue(4))
            .setNext(new MergeTwoSortedLists21.ListNode().setValue(4));
    final MergeTwoSortedLists21.ListNode secondAnswer = null;
    final MergeTwoSortedLists21.ListNode thirdAnswer = new MergeTwoSortedLists21.ListNode().setValue(0);

    @SuppressWarnings("ConstantConditions")
    @Test
    void mergeTwoLists() {
        final MergeTwoSortedLists21.ListNode firstExampleOne = new MergeTwoSortedLists21.ListNode().setValue(1)
                .setNext(new MergeTwoSortedLists21.ListNode().setValue(2))
                .setNext(new MergeTwoSortedLists21.ListNode().setValue(4));
        final MergeTwoSortedLists21.ListNode firstExampleTwo = new MergeTwoSortedLists21.ListNode().setValue(1)
                .setNext(new MergeTwoSortedLists21.ListNode().setValue(3))
                .setNext(new MergeTwoSortedLists21.ListNode().setValue(4));
        final MergeTwoSortedLists21.ListNode secondExampleOne = null;
        final MergeTwoSortedLists21.ListNode secondExampleTwo = null;
        final MergeTwoSortedLists21.ListNode thirdExampleOne = null;
        final MergeTwoSortedLists21.ListNode thirdExampleTwo = new MergeTwoSortedLists21.ListNode().setValue(0);

        assertLinkedListEquals(firstAnswer, mergeTwoSortedLists21.mergeTwoLists(firstExampleOne, firstExampleTwo));
        assertLinkedListEquals(secondAnswer, mergeTwoSortedLists21.mergeTwoLists(secondExampleOne, secondExampleTwo));
        assertLinkedListEquals(thirdAnswer, mergeTwoSortedLists21.mergeTwoLists(thirdExampleOne, thirdExampleTwo));
    }

    // 辅助方法：比较两个链表的值是否相等
    private void assertLinkedListEquals(MergeTwoSortedLists21.ListNode expected, MergeTwoSortedLists21.ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.getVal(), actual.getVal(), "Value mismatch!");
            expected = expected.getNext();
            actual = actual.getNext();
        }
        assertEquals(expected, actual, "Lists have different lengths!");
    }
}