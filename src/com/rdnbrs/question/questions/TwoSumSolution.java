package com.rdnbrs.question.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

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
