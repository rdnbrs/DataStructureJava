package com.rdnbrs.question.questions;

public class AddTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    public static void main(String[] args) {

        ListNode l1_31 = new ListNode(1);
        ListNode l1_30 = new ListNode(0, l1_31);
        ListNode l1_29 = new ListNode(0, l1_30);
        ListNode l1_28 = new ListNode(0, l1_29);
        ListNode l1_27 = new ListNode(0, l1_28);
        ListNode l1_26 = new ListNode(0, l1_27);
        ListNode l1_25 = new ListNode(0, l1_26);
        ListNode l1_24 = new ListNode(0, l1_25);
        ListNode l1_23 = new ListNode(0, l1_24);
        ListNode l1_22 = new ListNode(0, l1_23);
        ListNode l1_21 = new ListNode(0, l1_22);
        ListNode l1_20 = new ListNode(0, l1_21);
        ListNode l1_19 = new ListNode(0, l1_20);
        ListNode l1_18 = new ListNode(0, l1_19);
        ListNode l1_17 = new ListNode(0, l1_18);
        ListNode l1_16 = new ListNode(0, l1_17);
        ListNode l1_15 = new ListNode(0, l1_16);
        ListNode l1_14 = new ListNode(0, l1_15);
        ListNode l1_13 = new ListNode(0, l1_14);
        ListNode l1_12 = new ListNode(0, l1_13);
        ListNode l1_11 = new ListNode(0, l1_12);
        ListNode l1_10 = new ListNode(0, l1_11);
        ListNode l1_9 = new ListNode(0, l1_10);
        ListNode l1_8 = new ListNode(0, l1_9);
        ListNode l1_7 = new ListNode(0, l1_8);
        ListNode l1_6 = new ListNode(0, l1_7);
        ListNode l1_5 = new ListNode(0, l1_6);
        ListNode l1_4 = new ListNode(0, l1_5);
        ListNode l1_3 = new ListNode(0, l1_4);
        ListNode l1_2 = new ListNode(0, l1_3);
        ListNode l1 = new ListNode(1, l1_2);

        ListNode l2_2 = new ListNode(4);
        ListNode l2_1 = new ListNode(6, l2_2);
        ListNode l2 = new ListNode(5, l2_1);

        ListNode response = addTwoNumbers(l1, l2);

        while (response != null) {
            System.out.println(response.val);
            response = response.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0; //if sum of two number bigger than 10 carry to next digit 1 (sum/10)
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}
