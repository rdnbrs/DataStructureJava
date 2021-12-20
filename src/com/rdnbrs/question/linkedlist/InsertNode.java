package com.rdnbrs.question.linkedlist;

public class InsertNode {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
	}

	public static SinglyLinkedListNode insertNode(SinglyLinkedListNode insertNode, SinglyLinkedListNode node,
			int position) {
		SinglyLinkedListNode head = node;
		if (position == 0) {// head
			insertNode.next = node;
			return insertNode;
		} else if (position == -1) {// tail
			while (node.next != null) {
				node = node.next;
			}
			node.next = insertNode;
		} else {// specific position
			int counter = 1;
			while (counter < position) {
				node = node.next;
				counter++;
			}
			insertNode.next = node.next;
			node.next = insertNode;
		}
		return head;
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
		SinglyLinkedListNode insertNode = new SinglyLinkedListNode();

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

		insertNode.data = 10;

		// SinglyLinkedListNode response = insertNode(insertNode, node1, 0);
		// SinglyLinkedListNode response = insertNode(insertNode, node1, -1);
		SinglyLinkedListNode response = insertNode(insertNode, node1, 4);

		while (response != null) {
			System.out.println(response.data);
			response = response.next;
		}
	}

}
