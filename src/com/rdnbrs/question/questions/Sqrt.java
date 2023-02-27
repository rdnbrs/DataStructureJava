package com.rdnbrs.question.questions;

public class Sqrt {

    /**
     * https://leetcode.com/problems/sqrtx/
     * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
     * <p>
     * You must not use any built-in exponent function or operator.
     * <p>
     * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: x = 4
     * Output: 2
     * Explanation: The square root of 4 is 2, so we return 2.
     * Example 2:
     * <p>
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= x <= 231 - 1
     */
    public static void main(String[] args) {
        System.out.println(mySqrt(19));
        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = 0;
        if (x < 2) return x;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid == x / mid) return mid;
            if (x / mid > mid) left = mid + 1;
            if (mid > x / mid && (mid - 1) < x / (mid - 1)) return mid - 1;
            if (x / mid < mid) right = mid - 1;
        }
        return mid;
    }
}
