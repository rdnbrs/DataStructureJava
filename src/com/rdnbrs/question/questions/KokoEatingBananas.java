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

    /**
     * Time Limit Exceeded
     */
//    public static int minEatingSpeed(int[] piles, int h) {
//        int median = 0, sum = 0, max = Integer.MIN_VALUE;
//
//        for (int item : piles) {
//            sum += item;
//            if (item > max)
//                max = item;
//        }
//
//        median = (int) Math.ceil(sum / (h * 1.0f));
//
//        while (median < max) {
//            sum = 0;
//            for (int item : piles) {
//                sum += Math.ceil(1.0f * item / median);
//            }
//
//            if (sum == h)
//                break;
//            else median++;
//        }
//
//        return median;
//    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int item : piles) {
            high = Math.max(high, item);
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (blackbox(mid, piles, h)) {
                high = mid;
            } else
                low = mid + 1;
        }
        return low;
    }

    public static boolean blackbox(int maxpiles, int[] piles, int h) {
        int hours = 0;
        for (int i : piles) {
            int time = i / maxpiles;
            hours += time;
            if (i % maxpiles != 0) hours++;
        }
        return hours <= h;
    }
}
