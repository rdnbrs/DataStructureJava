package com.rdnbrs.question.linkedlist;

public class CycleDetection {
	
	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
	}

	public static void detactCycle(SinglyLinkedListNode head) {
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
		
		if(isCycle)
			System.out.println("Cycle");
		else
			System.out.println("Not Cycle");

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
		
		detactCycle(node1);
	}

}
