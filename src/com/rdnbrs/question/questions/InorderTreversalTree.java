package com.rdnbrs.question.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InorderTreversalTree {

    /**
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [1,null,2,3]
     * Output: [1,3,2]
     * Example 2:
     * <p>
     * Input: root = []
     * Output: []
     * Example 3:
     * <p>
     * Input: root = [1]
     * Output: [1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [0, 100].
     * -100 <= Node.val <= 100
     * <p>
     * <p>
     * Follow up: Recursive solution is trivial, could you do it iteratively?
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.right = node2;
        node2.left = node3;


        List<Integer> response = inorderTraversal(node1);
        response.stream().forEach(item -> {
            System.out.println(item);
        });
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> response = new ArrayList<>();

        /* Recursive solution
        if (root.left != null)
            response.addAll(inorderTraversal(root.left));
        response.add(root.val);
        if (root.right != null)
            response.addAll(inorderTraversal(root.right));

        return response;*/

        HashMap<TreeNode, Integer> visitedRoot = new HashMap<>();
        ArrayList<TreeNode> visitedRootArray = new ArrayList<>();
        do {
            if (!visitedRoot.containsKey(root)) {
                visitedRoot.put(root, 0);
                visitedRootArray.add(root);
            }

            if (root.left != null && visitedRoot.get(root) < 1) {
                visitedRoot.put(root, 1);
                root = root.left;
                continue;
            } else if (root.left == null) {
                if (visitedRoot.get(root) == 0)
                    response.add(root.val);
            }

            if (visitedRoot.get(root) == 1)
                response.add(root.val);

            if (root.right != null && visitedRoot.get(root) < 2) {
                visitedRoot.put(root, 2);
                root = root.right;
                continue;
            }

            visitedRoot.remove(root);
            visitedRootArray.remove(root);
            if (visitedRootArray.size() == 0)
                break;
            root = visitedRootArray.get(visitedRootArray.size() - 1);
        } while (visitedRoot.size() != 0);

        return response;
    }
}
