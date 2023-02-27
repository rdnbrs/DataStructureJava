package com.rdnbrs.question.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    /**
     * https://leetcode.com/problems/two-sum/
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * You can return the answer in any order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     * <p>
     * <p>
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */
    public static void main(String[] args) {
        int[] response = twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.stream(response).forEach(item -> System.out.println(item));

        System.out.println("--------------");
        response = twoSum(new int[]{3, 2, 4}, 6);
        Arrays.stream(response).forEach(item -> System.out.println(item));

        System.out.println("--------------");
        response = twoSum(new int[]{3, 3}, 6);
        Arrays.stream(response).forEach(item -> System.out.println(item));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        Map<Integer, Integer> operationMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (operationMap.containsKey(target - nums[i])) {
                result[0] = operationMap.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                operationMap.put(nums[i], i);
            }
        }

        return result;
    }
}
