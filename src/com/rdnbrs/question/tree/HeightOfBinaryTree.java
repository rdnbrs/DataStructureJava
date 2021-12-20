package com.rdnbrs.question.tree;

public class HeightOfBinaryTree {
	
	public static class Node {
		int data;
		Node left;
		Node right;
	}

	public static int height(Node root) {
		if (root == null) {
			return -1;
		} else {
			int leftDepth = height(root.left);
			int rightDepth = height(root.right);

			if (leftDepth > rightDepth) {
				return leftDepth + 1;
			} else {
				return rightDepth + 1;
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
