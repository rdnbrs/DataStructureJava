package com.rdnbrs.question.questions;

import java.util.HashSet;

public class SingleNumber {

    /**
     * https://leetcode.com/problems/single-number/
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * <p>
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,2,1]
     * Output: 1
     * Example 2:
     * <p>
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * Example 3:
     * <p>
     * Input: nums = [1]
     * Output: 1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 3 * 104
     * -3 * 104 <= nums[i] <= 3 * 104
     * Each element in the array appears twice except for one element which appears only once.
     */
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> items = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (items.contains(nums[i]))
                items.remove(nums[i]);
            else items.add(nums[i]);
        }

        return items.stream().toList().get(0);

        /**
         * Faster Solution according to leetcode solutions !!! 5^5 = 0
         * int n=0;
         * for(int i=0;i<nums.length;i++){
         *   n^=nums[i];
         * }
         * return n;*/
    }
}
