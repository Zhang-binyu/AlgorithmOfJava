package leet_code.algorithms.easy_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedLists21Test {
    private final MergeTwoSortedLists21 mMergeTwoSortedLists21 = new MergeTwoSortedLists21();

    private final MergeTwoSortedLists21.ListNode mFirstAnswer = new MergeTwoSortedLists21.ListNode(1)
            .setNext(new MergeTwoSortedLists21.ListNode(1))
            .setNext(new MergeTwoSortedLists21.ListNode(2))
            .setNext(new MergeTwoSortedLists21.ListNode(3))
            .setNext(new MergeTwoSortedLists21.ListNode(4))
            .setNext(new MergeTwoSortedLists21.ListNode(4));
    private final MergeTwoSortedLists21.ListNode mSecondAnswer = null;
    private final MergeTwoSortedLists21.ListNode mThirdAnswer = new MergeTwoSortedLists21.ListNode(0);

    @SuppressWarnings("ConstantConditions")
    @Test
    void mergeTwoLists() {
        final MergeTwoSortedLists21.ListNode firstExampleOne = new MergeTwoSortedLists21.ListNode(1)
                .setNext(new MergeTwoSortedLists21.ListNode(2))
                .setNext(new MergeTwoSortedLists21.ListNode(4));
        final MergeTwoSortedLists21.ListNode firstExampleTwo = new MergeTwoSortedLists21.ListNode(1)
                .setNext(new MergeTwoSortedLists21.ListNode(3))
                .setNext(new MergeTwoSortedLists21.ListNode(4));
        final MergeTwoSortedLists21.ListNode secondExampleOne = null;
        final MergeTwoSortedLists21.ListNode secondExampleTwo = null;
        final MergeTwoSortedLists21.ListNode thirdExampleOne = null;
        final MergeTwoSortedLists21.ListNode thirdExampleTwo = new MergeTwoSortedLists21.ListNode(0);

        assertLinkedListEquals(mFirstAnswer, mMergeTwoSortedLists21.mergeTwoLists(firstExampleOne, firstExampleTwo));
        assertLinkedListEquals(mSecondAnswer, mMergeTwoSortedLists21.mergeTwoLists(secondExampleOne, secondExampleTwo));
        assertLinkedListEquals(mThirdAnswer, mMergeTwoSortedLists21.mergeTwoLists(thirdExampleOne, thirdExampleTwo));
    }

    // 辅助方法：比较两个链表的值是否相等
    private void assertLinkedListEquals(MergeTwoSortedLists21.ListNode expected, MergeTwoSortedLists21.ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val, "Value mismatch!");
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected, actual, "Lists have different lengths!");
    }
}