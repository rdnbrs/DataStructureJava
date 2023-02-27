package com.rdnbrs.question.questions;

public class SearchInsert {

    /**
     * https://leetcode.com/problems/search-insert-position/
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     * <p>
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * Example 3:
     * <p>
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums contains distinct values sorted in ascending order.
     * -104 <= target <= 104
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }

        return nums.length;
    }
}
