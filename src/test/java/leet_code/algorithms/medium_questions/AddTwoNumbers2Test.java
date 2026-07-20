package leet_code.algorithms.medium_questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbers2Test {
    private final AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();

    private final AddTwoNumbers2.ListNode firstAnswer = new AddTwoNumbers2.ListNode(
            7,
            new AddTwoNumbers2.ListNode(
                    0,
                    new AddTwoNumbers2.ListNode(8)
            )
    );

    private final AddTwoNumbers2.ListNode secondAnswer = new AddTwoNumbers2.ListNode(0);

    private final AddTwoNumbers2.ListNode thirdAnswer = new AddTwoNumbers2.ListNode(
            8,
            new AddTwoNumbers2.ListNode(
                    9,
                    new AddTwoNumbers2.ListNode(
                            9,
                            new AddTwoNumbers2.ListNode(
                                    9,
                                    new AddTwoNumbers2.ListNode(
                                            0,
                                            new AddTwoNumbers2.ListNode(
                                                    0,
                                                    new AddTwoNumbers2.ListNode(
                                                            0,
                                                            new AddTwoNumbers2.ListNode(1)
                                                    )
                                            )
                                    )
                            )
                    )
            )
    );


    @Test
    void addTwoNumbers() {
        final AddTwoNumbers2.ListNode firstExample = addTwoNumbers2.addTwoNumbers(
                new AddTwoNumbers2.ListNode(
                        2,
                        new AddTwoNumbers2.ListNode(
                                4,
                                new AddTwoNumbers2.ListNode(
                                        3
                                )
                        )
                ),
                new AddTwoNumbers2.ListNode(
                        5,
                        new AddTwoNumbers2.ListNode(
                                6,
                                new AddTwoNumbers2.ListNode(
                                        4
                                )
                        )
                )
        );
        final AddTwoNumbers2.ListNode secondExample = addTwoNumbers2.addTwoNumbers(
                new AddTwoNumbers2.ListNode(0),
                new AddTwoNumbers2.ListNode(0)
        );
        final AddTwoNumbers2.ListNode thirdExample = addTwoNumbers2.addTwoNumbers(
                new AddTwoNumbers2.ListNode(
                        9,
                        new AddTwoNumbers2.ListNode(
                                9,
                                new AddTwoNumbers2.ListNode(
                                        9,
                                        new AddTwoNumbers2.ListNode(
                                                9,
                                                new AddTwoNumbers2.ListNode(
                                                        9,
                                                        new AddTwoNumbers2.ListNode(
                                                                9,
                                                                new AddTwoNumbers2.ListNode(
                                                                        9
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                ),
                new AddTwoNumbers2.ListNode(
                        9,
                        new AddTwoNumbers2.ListNode(
                                9,
                                new AddTwoNumbers2.ListNode(
                                        9,
                                        new AddTwoNumbers2.ListNode(
                                                9
                                        )
                                )
                        )
                )
        );
        assertEquals(firstAnswer.toIntegerList(), firstExample.toIntegerList());
        assertEquals(secondAnswer.toIntegerList(), secondExample.toIntegerList());
        assertEquals(thirdAnswer.toIntegerList(), thirdExample.toIntegerList());
    }
}