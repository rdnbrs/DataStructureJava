package com.rdnbrs.question.questions;

public class KthMissingPositiveNumber {

    /**
     * https://leetcode.com/problems/kth-missing-positive-number/
     */

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }

    public static int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) return k;

        int missingCount = arr[0] != 1 ? k + 1 - arr[0] : k;

        for (int i = 1; i < arr.length && missingCount != 0; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                if (arr[i] - arr[i - 1] > missingCount) {
                    return arr[i - 1] + missingCount;
                } else
                    missingCount = missingCount + 1 - (arr[i] - arr[i - 1]);
            }
        }
        //if didn't return yet missing number must be after the last item of array
        return arr[arr.length - 1] + missingCount;
    }
}
