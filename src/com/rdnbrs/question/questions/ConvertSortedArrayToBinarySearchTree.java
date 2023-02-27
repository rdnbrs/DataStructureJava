package com.rdnbrs.question.questions;

import com.rdnbrs.question.questions.models.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    /**
     * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
     * Given an integer array nums where the elements are sorted in ascending order, convert it to a
     * height-balanced
     * binary search tree.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: nums = [-10,-3,0,5,9]
     * Output: [0,-3,9,-10,null,5]
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
     * <p>
     * Example 2:
     * <p>
     * <p>
     * Input: nums = [1,3]
     * Output: [3,1]
     * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums is sorted in a strictly increasing order.
     */
    public static void main(String[] args) {
        int[] sortedArray = {-10, -5, 0, 3, 7, 8, 11, 15};

        System.out.println(sortedArrayToBST(sortedArray).val);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }
}
