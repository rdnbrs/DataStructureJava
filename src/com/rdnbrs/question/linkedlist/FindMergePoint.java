package com.rdnbrs.question.linkedlist;

public class FindMergePoint {
	
	public static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;
	}
	
	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode node1 = head1;
        SinglyLinkedListNode node2 = head2;

        int count1=0,count2=0,dif=0;

        while(node1 != null){
            count1++;
            node1 = node1.next;
        }

        while(node2 != null){
            count2++;
            node2 = node2.next;
        }

        if(count1>count2){
            dif = count1 - count2;
            for(int i=0;i<dif; i++){
                head1 = head1.next;
            }
        }else{
            dif = count2 - count1;
            for(int i=0;i<dif; i++){
                head2 = head2.next;
            }
        }

        while (head1 != null && head2 != null) {             
            if (head1 == head2) { 
                return head1.data; 
            } 
            head1 = head1.next; 
            head2 = head2.next; 
        } 
        
        return -1;

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

		lnode1.data = 1;
		lnode1.next = lnode2;

		lnode2.data = 3;
		lnode2.next = lnode3;

		lnode3.data = 5;
		lnode3.next = node7;

		System.out.println(findMergeNode(node1, lnode1));
	}
}
