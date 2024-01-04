package com.rdnbrs.question.questions;

import java.util.HashMap;

public class MinimumNumberOperationsMakeArrayEmpty {

    /**
     * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
     */

    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> amounts = new HashMap<>();
        for (Integer value : nums)
            amounts.put(value, amounts.getOrDefault(value, 0) + 1);

        int result = 0;
        for (Integer amount : amounts.values()) {
            if (amount == 1)
                return -1;
            else if (amount % 3 == 0)
                result += amount / 3;
            else if (amount % 3 == 1)
                result += amount / 3 + 1;
            else
                result += 1 + amount / 3;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}));
        System.out.println(minOperations(new int[]{2, 1, 2, 2, 3, 3}));
    }
}
