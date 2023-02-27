package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class BalancedBinaryTree {

    /**
     * Given a binary tree, determine if it is
     * height-balanced
     * .
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: true
     * Example 2:
     * <p>
     * <p>
     * Input: root = [1,2,2,3,3,null,null,4,4]
     * Output: false
     * Example 3:
     * <p>
     * Input: root = []
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 5000].
     * -104 <= Node.val <= 104
     */
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1)
            return false;
        return isLeftBalanced && isRightBalanced;
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
