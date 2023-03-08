package com.rdnbrs.question.questions;

public class KokoEatingBananas {

    /**
     * https://leetcode.com/problems/koko-eating-bananas/
     */
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        System.out.println(minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        System.out.println(minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int median = 1, max = Integer.MIN_VALUE;

        for (int item : piles) {
            if (item > max) max = item;
        }

        while (median < max) {
            int hours = 0;
            int mid = median + (max - median) / 2;
            for (int i : piles) {
                int time = i / mid;
                hours += time;
                if (i % mid != 0) hours++;
            }

            if (hours <= h) max = mid;
            else median = mid + 1;
        }

        return median;
    }
}
