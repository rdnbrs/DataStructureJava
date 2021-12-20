package com.rdnbrs.question.tree;

import java.util.LinkedList;

public class PrintTree {

	public static class Node {
		int data;
		Node left;
		Node right;
	}

	public static void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);

		preOrder(root.right);
	}

	public static void levelOrder(Node root) {
		LinkedList<Node> nodes = new LinkedList<Node>();

		nodes.add(root);

		while (!nodes.isEmpty()) {
			if (nodes.peek().left != null)
				nodes.add(nodes.peek().left);

			if (nodes.peek().right != null)
				nodes.add(nodes.peek().right);

			System.out.print(nodes.poll().data + " ");
		}
	}

	public static void main(String[] args) {

	}

}
