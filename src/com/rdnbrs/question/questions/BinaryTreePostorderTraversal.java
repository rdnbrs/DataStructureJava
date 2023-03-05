package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    /**
     * https://leetcode.com/problems/binary-tree-postorder-traversal/description/
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> response = new ArrayList<>();
        if (root.left != null)
            response.addAll(postorderTraversal(root.left));
        if (root.right != null)
            response.addAll(postorderTraversal(root.right));
        response.add(root.val);

        return response;
    }

}
