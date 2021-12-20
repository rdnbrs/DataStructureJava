package com.rdnbrs.question.linkedlist;

public class MergeTwoSortedList {

	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
	}

	public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode node1, SinglyLinkedListNode node2) {
		if (node1 == null)
			return node2;
		if (node2 == null)
			return node1;
		
		if(node1.data<node2.data) {
			node1.next = mergeLists(node1.next, node2);
			return node1;
		}else {
			node2.next = mergeLists(node1, node2.next);
			return node2;
		}							
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

		SinglyLinkedListNode lnode1 = new SinglyLinkedListNode();
		SinglyLinkedListNode lnode2 = new SinglyLinkedListNode();
		SinglyLinkedListNode lnode3 = new SinglyLinkedListNode();
		SinglyLinkedListNode lnode4 = new SinglyLinkedListNode();
		SinglyLinkedListNode lnode5 = new SinglyLinkedListNode();
		SinglyLinkedListNode lnode6 = new SinglyLinkedListNode();

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

		node9.data = 7;

		lnode1.data = 1;
		lnode1.next = lnode2;

		lnode2.data = 1;
		lnode2.next = lnode3;

		lnode3.data = 2;
		lnode3.next = lnode4;

		lnode4.data = 3;
		lnode4.next = lnode5;

		lnode5.data = 4;
		lnode5.next = lnode6;

		lnode6.data = 4;

		SinglyLinkedListNode response = mergeLists(node1, lnode1);

		while (response != null) {
			System.out.println(response.data);
			response = response.next;
		}
	}
}
