package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class MinimumDepthOfBinaryTree {

    /**
     * Given a binary tree, find its minimum depth.
     * <p>
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     * <p>
     * Note: A leaf is a node with no children.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 2
     * Example 2:
     * <p>
     * Input: root = [2,null,3,null,4,null,5,null,6]
     * Output: 5
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 105].
     * -1000 <= Node.val <= 1000
     */
    public static void main(String[] args) {

    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = minDepth(root.left);
            int rightDepth = minDepth(root.right);

            if(root.left == null && root.right == null)
                return 1;
            if(root.left == null)
                return 1 + rightDepth;
            if(root.right == null)
                return 1 + leftDepth;

            return Math.min(leftDepth, rightDepth) + 1;
        }
    }

}
