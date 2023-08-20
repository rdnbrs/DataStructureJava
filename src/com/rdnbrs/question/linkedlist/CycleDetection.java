package com.rdnbrs.question.linkedlist;

public class CycleDetection {

    /**
     * https://leetcode.com/problems/linked-list-cycle/
     * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     * <p>
     * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
     * <p>
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
     * Example 2:
     * <p>
     * <p>
     * Input: head = [1,2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
     * Example 3:
     * <p>
     * <p>
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of the nodes in the list is in the range [0, 104].
     * -105 <= Node.val <= 105
     * pos is -1 or a valid index in the linked-list.
     * <p>
     * <p>
     * Follow up: Can you solve it using O(1) (i.e. constant) memory?
     */

    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    public static boolean detectCycle(SinglyLinkedListNode head) {
        if (head == null) return false;
        boolean isCycle = false;

        SinglyLinkedListNode singleMove = head;
        while (head.next != null && head.next.next != null) {
            singleMove = singleMove.next;
            head = head.next.next;

            if (singleMove == head) {
                isCycle = true;
                break;
            }
        }

        return isCycle;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode();
        SinglyLinkedListNode node2 = new SinglyLinkedListNode();
        SinglyLinkedListNode node3 = new SinglyLinkedListNode();
        SinglyLinkedListNode node4 = new SinglyLinkedListNode();
        SinglyLinkedListNode node5 = new SinglyLinkedListNode();
        SinglyLinkedListNode node6 = new SinglyLinkedListNode();
        SinglyLinkedListNode node7 = new SinglyLinkedListNode();
        SinglyLinkedListNode node8 = new SinglyLinkedListNode();
        SinglyLinkedListNode node9 = new SinglyLinkedListNode();

        node1.data = 1;
        node1.next = node2;

        node2.data = 1;
        node2.next = node3;

        node3.data = 2;
        node3.next = node4;

        node4.data = 3;
        node4.next = node5;

        node5.data = 4;
        node5.next = node6;

        node6.data = 4;
        node6.next = node7;

        node7.data = 5;
        node7.next = node8;

        node8.data = 6;
        node8.next = node9;

        node9.data = 6;
        //node9.next = node3;

        System.out.println(detectCycle(node1));
    }

}
