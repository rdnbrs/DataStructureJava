package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class SameTree {

    /**
     * https://leetcode.com/problems/same-tree/
     * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
     * <p>
     * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: p = [1,2,3], q = [1,2,3]
     * Output: true
     * Example 2:
     * <p>
     * <p>
     * Input: p = [1,2], q = [1,null,2]
     * Output: false
     * Example 3:
     * <p>
     * <p>
     * Input: p = [1,2,1], q = [1,1,2]
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in both trees is in the range [0, 100].
     * -104 <= Node.val <= 104
     */
    public static void main(String[] args) {
        TreeNode tree1_node1 = new TreeNode(1);
        TreeNode tree1_node2 = new TreeNode(2);
        TreeNode tree1_node3 = new TreeNode(3);

        TreeNode tree2_node1 = new TreeNode(1);
        TreeNode tree2_node2 = new TreeNode(2);
        TreeNode tree2_node3 = new TreeNode(3);

        tree1_node1.left = tree1_node2;
        tree1_node1.right = tree1_node3;

        tree2_node1.left = tree2_node2;
        tree2_node1.right = tree2_node3;

        System.out.println(isSameTree(tree1_node1, tree2_node1));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((q == null && p != null) || (q != null && p == null))
            return false;

        if (q == null && p == null)
            return true;

        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        return false;
    }
}
