package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class MaximumDepthOfBinaryTree {

    /**
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * Given the root of a binary tree, return its maximum depth.
     * <p>
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     * Example 2:
     * <p>
     * Input: root = [1,null,2]
     * Output: 2
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 104].
     * -100 <= Node.val <= 100
     */
    public static void main(String[] args) {
        TreeNode tree1_node1 = new TreeNode(3);
        TreeNode tree1_node2 = new TreeNode(9);
        TreeNode tree1_node3 = new TreeNode(20);
        TreeNode tree1_node4 = new TreeNode(15);
        TreeNode tree1_node5 = new TreeNode(7);

        tree1_node1.left = tree1_node2;
        tree1_node1.right = tree1_node3;
        tree1_node3.left = tree1_node4;
        tree1_node3.right = tree1_node5;

        System.out.println(maxDepth(tree1_node1));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
