package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class PathSum {

    /**
     * https://leetcode.com/problems/path-sum/
     * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
     * <p>
     * A leaf is a node with no children.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
     * Output: true
     * Explanation: The root-to-leaf path with the target sum is shown.
     * Example 2:
     * <p>
     * <p>
     * Input: root = [1,2,3], targetSum = 5
     * Output: false
     * Explanation: There two root-to-leaf paths in the tree:
     * (1 --> 2): The sum is 3.
     * (1 --> 3): The sum is 4.
     * There is no root-to-leaf path with sum = 5.
     * Example 3:
     * <p>
     * Input: root = [], targetSum = 0
     * Output: false
     * Explanation: Since the tree is empty, there are no root-to-leaf paths.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 5000].
     * -1000 <= Node.val <= 1000
     * -1000 <= targetSum <= 1000
     */
    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(11);
        TreeNode treeNode5 = new TreeNode(13);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        treeNode6.right = treeNode9;

        System.out.println(hasPathSum(treeNode1, 22));

        TreeNode treeNode11 = new TreeNode(-2);
        TreeNode treeNode12 = new TreeNode(-3);

        treeNode11.right = treeNode12;
        System.out.println(hasPathSum(treeNode11, -5));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && targetSum - root.val == 0)
            return true;

        boolean leftPath = hasPathSum(root.left, targetSum - root.val);
        boolean rightPath = hasPathSum(root.right, targetSum - root.val);

        return leftPath || rightPath;
    }
}
