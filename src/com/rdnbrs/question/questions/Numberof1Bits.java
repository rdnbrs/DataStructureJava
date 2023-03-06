package com.rdnbrs.question.questions;

public class Numberof1Bits {

    /**
     * https://leetcode.com/problems/number-of-1-bits/
     */

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        char[] result = Integer.toBinaryString(n).toCharArray();

        int count = 0;
        for (Character item : result) {
            if (item.equals('1')) count++;
        }

        return count;

        /**
         * byte shift
         *
         *         int c = 0;
         *         while (n != 0)
         *         {
         *             c += (n & 1);
         *             n >>>= 1;
         *         }
         *         return c;
         * */
    }
}
