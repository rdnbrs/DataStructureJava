package com.rdnbrs.question.linkedlist;

public class DeleteNode {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
	}

	public static void deleteNode(SinglyLinkedListNode head, int position, int index) {
		if (position == index + 1) {
			head.next = head.next.next;
			return;
		}

		deleteNode(head.next, position, index + 1);
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

		deleteNode(node1, 4, 0);

		while (node1 != null) {
			System.out.println(node1.data);
			node1 = node1.next;
		}
	}

}
