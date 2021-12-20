package com.rdnbrs.question.tree;

public class CheckBinaryTree {

	public static class Node {
		int data;
		Node left;
		Node right;
	}

	public static boolean checkBST(Node root) {
		boolean result = false;
		if (root.left != null && root.left.data > root.data)
			return result;
		if (root.right != null && root.right.data < root.data)
			return result;
		if (root.left != null)
			result = checkBST(root.left);
		if (root.right != null)
			result = checkBST(root.right);
		return result;
	}

	public static void main(String[] args) {

	}

}
