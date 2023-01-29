package com.rdnbrs.question.questions;

import java.util.Arrays;

public class MaximumIceCreamBars {

    /**
     * It is a sweltering summer day, and a boy wants to buy some ice cream bars.
     * <p>
     * At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible.
     * <p>
     * Note: The boy can buy the ice cream bars in any order.
     * <p>
     * Return the maximum number of ice cream bars the boy can buy with coins coins.
     * <p>
     * You must solve the problem by counting sort.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: costs = [1,3,2,4,1], coins = 7
     * Output: 4
     * Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
     * Example 2:
     * <p>
     * Input: costs = [10,6,8,7,7,8], coins = 5
     * Output: 0
     * Explanation: The boy cannot afford any of the ice cream bars.
     * Example 3:
     * <p>
     * Input: costs = [1,6,3,1,2,5], coins = 20
     * Output: 6
     * Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * costs.length == n
     * 1 <= n <= 105
     * 1 <= costs[i] <= 105
     * 1 <= coins <= 108
     */
    public static void main(String[] args) {
        int[] costs = {1, 3, 2, 4, 1};
        int[] costs2 = {10, 6, 8, 7, 7, 8};
        int[] costs3 = {1, 6, 3, 1, 2, 5};

        System.out.println(maxIceCream(costs, 7));
        System.out.println(maxIceCream(costs2, 5));
        System.out.println(maxIceCream(costs3, 20));
        System.out.println(maxIceCream(costs3, 17));

    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        //not enough coins
        if (coins < costs[0])
            return 0;

        int response = 0;

        for (int i = 0; i < costs.length; i++) {
            coins -= costs[i];

            if (coins >= 0)
                response++;
            else
                break;
        }

        return response;
    }

}
