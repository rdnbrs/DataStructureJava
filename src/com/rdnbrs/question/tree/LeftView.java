package com.rdnbrs.question.tree;

import java.util.HashMap;

public class LeftView {

	public static class Node {
		int data;
		Node left;
		Node right;
	}

	public static void findLeftView(Node root, HashMap map, int level) {
		if (root == null)
			return;

		if (!map.containsKey(level))
			map.put(level, root);

		findLeftView(root.left, map, level + 1);
		findLeftView(root.right, map, level + 1);

	}

	public static void main(String[] args) {
		HashMap<Integer, Node> levels = new HashMap();
			
		/*					10
		 * 			9				11
		 * 		8		12		7		
		 * 3		5				17
		 * 		2						19
		 * 									21
		 * 
		 * 
		 * result should be 10,9,8,3,2,21
		 * */
		
		Node h1 = new Node();
		Node h2 = new Node();
		Node h3 = new Node();
		Node h4 = new Node();
		Node h5 = new Node();
		Node h6 = new Node();
		Node h7 = new Node();
		Node h8 = new Node();
		Node h9 = new Node();
		Node h10 = new Node();
		Node h11 = new Node();
		Node h12 = new Node();
		Node h13 = new Node();
		
		h1.data = 10;
		h2.data = 9;
		h3.data = 8;
		h4.data = 12;
		h5.data = 3;
		h6.data = 5;
		h7.data = 2;
		h9.data = 11;
		h10.data = 7;
		h11.data = 17;
		h12.data = 19;
		h13.data = 21;
				
		h1.left = h2;
		h1.right = h9;		
		h2.left = h3;
		h2.right = h4;		
		h3.left = h5;
		h3.right = h6;		
		h6.left = h7;			
		h9.left = h10;					
		h10.right = h11;
		h11.right = h12;				
		h12.right = h13;

		findLeftView(h1, levels, 0);
		
		for(int i=0;i<levels.keySet().size(); i++) {
			System.out.println(levels.get(i).data);
		}
	}

}
