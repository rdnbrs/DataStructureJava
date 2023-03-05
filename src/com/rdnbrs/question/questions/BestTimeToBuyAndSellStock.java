package com.rdnbrs.question.questions;

public class BestTimeToBuyAndSellStock {

    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * <p>
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * <p>
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     * Example 2:
     * <p>
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     */
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 1, 7, 5, 3, 6, 4};
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }

    public static int maxProfit(int[] prices) {
//        !!timeout!!
//        HashMap<Integer, Integer> profits = new HashMap<>();
//        int maxVal = Integer.MIN_VALUE;
//
//        for (int i = 0; i < prices.length; i++) {
//            profits.putIfAbsent(prices[i], 0);
//            for (Integer key : profits.keySet()) {
//                if (profits.get(key) < prices[i] - key){
//                    profits.put(key, prices[i] - key);
//                }
//                if (profits.get(key) > maxVal)
//                    maxVal = profits.get(key);
//            }
//        }
//        return maxVal;

        int leastValue = Integer.MAX_VALUE;
        int profit = 0;
        int tempProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastValue) {
                leastValue = prices[i];
            }
            tempProfit = prices[i] - leastValue;
            if (profit < tempProfit) {
                profit = tempProfit;
            }
        }

        return profit;
    }
}
