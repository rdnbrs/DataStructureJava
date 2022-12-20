package com.rdnbrs.question.linkedlist;

public class Reverse {

    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null)
            return head;

        SinglyLinkedListNode newHeadNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
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

        node2.data = 2;
        node2.next = node3;

        node3.data = 3;
        node3.next = node4;

        node4.data = 4;
        node4.next = node5;

        node5.data = 5;
        node5.next = node6;

        node6.data = 6;
        node6.next = node7;

        node7.data = 7;
        node7.next = node8;

        node8.data = 8;
        node8.next = node9;

        node9.data = 9;

        SinglyLinkedListNode response = reverse(node1);

        while (response != null) {
            System.out.println(response.data);
            response = response.next;
        }
    }
}
