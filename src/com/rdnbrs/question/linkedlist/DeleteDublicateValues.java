package com.rdnbrs.question.linkedlist;

import java.util.ArrayList;

public class DeleteDublicateValues {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
	}

	public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
		// Write your code here
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(llist.data);
		SinglyLinkedListNode nNode = llist;
		while (llist.next != null) {
			if (values.contains(llist.next.data)) {
				llist.next = llist.next.next;
			} else {
				values.add(llist.next.data);
				llist = llist.next;
			}
		}
		return nNode;
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

		SinglyLinkedListNode response = removeDuplicates(node1);

		while (response != null) {
			System.out.println(response.data);
			response = response.next;
		}

	}

}
