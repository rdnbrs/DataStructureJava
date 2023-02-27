package com.rdnbrs.question.questions;

public class ClimbStairs {

    /**
     * https://leetcode.com/problems/climbing-stairs/
     * You are climbing a staircase. It takes n steps to reach the top.
     * <p>
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * Example 2:
     * <p>
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 45
     */

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(7));
    }

    /**4 - 5
     * 1,1,1,1
     * 2,1,1
     * 1,2,1
     * 1,1,2
     * 2,2
     * */

    /**5 - 8
     * 1,1,1,1,1
     * 2,1,1,1
     * 1,2,1,1
     * 1,1,2,1
     * 1,1,1,2
     * 2,2,1,
     * 2,1,2
     * 1,2,2
     * */

    /**
     * 6 - 13
     * 1,1,1,1,1,1
     * 2,1,1,1,1
     * 1,2,1,1,1
     * 1,1,2,1,1
     * 1,1,1,2,1
     * 1,1,1,1,2
     * 2,2,1,1
     * 2,1,2,1
     * 2,1,1,2
     * 1,2,1,2
     * 1,1,2,2
     * 1,2,2,1
     * 2,2,2
     */

    /**
     * 7 - 21
     * 1,1,1,1,1,1,1
     * 2,1,1,1,1,1
     * 1,2,1,1,1,1
     * 1,1,2,1,1,1
     * 1,1,1,2,1,1
     * 1,1,1,1,2,1
     * 1,1,1,1,1,2
     * 2,2,1,1,1
     * 2,1,2,1,1
     * 2,1,1,2,1
     * 2,1,1,1,2
     * 1,2,1,1,2
     * 1,1,2,1,2
     * 1,1,1,2,2
     * 1,2,1,2,1
     * 1,2,2,1,1
     * 1,1,2,2,1
     * 2,2,2,1
     * 2,2,1,2
     * 2,1,2,2
     * 1,2,2,2
     */

    /**
     * Fibonacci !!!!!
     */

    public static int climbStairs(int n) {
        if (n <= 2)
            return n;

        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
