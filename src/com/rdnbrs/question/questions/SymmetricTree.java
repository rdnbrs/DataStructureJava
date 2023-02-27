package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class SymmetricTree {

    /**
     * https://leetcode.com/problems/symmetric-tree/
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [1,2,2,3,4,4,3]
     * Output: true
     * Example 2:
     * <p>
     * <p>
     * Input: root = [1,2,2,null,3,null,3]
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [1, 1000].
     * -100 <= Node.val <= 100
     * <p>
     * <p>
     * Follow up: Could you solve it both recursively and iteratively?
     */
    public static void main(String[] args) {
        TreeNode tree1_node1 = new TreeNode(1);
        TreeNode tree1_node2 = new TreeNode(2);
        TreeNode tree1_node3 = new TreeNode(2);
        TreeNode tree1_node4 = new TreeNode(4);
        TreeNode tree1_node5 = new TreeNode(5);

        tree1_node1.left = tree1_node2;
        tree1_node1.right = tree1_node3;
        tree1_node2.left = tree1_node4;
        tree1_node2.right = tree1_node5;
        tree1_node3.left = tree1_node5;
        tree1_node3.right = tree1_node4;

        System.out.printf(isSymmetric(tree1_node1) ? "true" : "false");
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    private static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
