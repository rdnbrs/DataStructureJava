package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.ListNode;

public class IntersectionOfTwoLinkedLists {

    /**
     * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
     */
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        ListNode lnode1 = new ListNode(3);
        ListNode lnode2 = new ListNode(4);
        ListNode lnode3 = new ListNode(5);
        ListNode lnode4 = new ListNode(6);
        ListNode lnode5 = new ListNode(7);
        ListNode lnode6 = new ListNode(8);

        node1.next = node2;
        node2.next = lnode4;
        lnode4.next = lnode5;
        lnode5.next = lnode6;
        lnode1.next = lnode2;
        lnode2.next = lnode3;
        lnode3.next = lnode4;

        System.out.println(getIntersectionNode(node1, lnode1).val);
        System.out.println(getIntersectionNode(node1, node2).val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0, countB = 0, dif = 0;
        ListNode countNodeA = headA, countNodeB = headB;

        while (countNodeA.next != null) {
            countA++;
            countNodeA = countNodeA.next;
        }

        while (countNodeB.next != null) {
            countB++;
            countNodeB = countNodeB.next;
        }

        if (countA > countB) {
            dif = countA - countB;
            for (int i = 0; i < dif; i++) {
                headA = headA.next;
            }
        } else {
            dif = countB - countA;
            for (int i = 0; i < dif; i++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
