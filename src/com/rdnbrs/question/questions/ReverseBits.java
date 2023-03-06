package com.rdnbrs.question.questions;

public class ReverseBits {

    /**
     * https://leetcode.com/problems/reverse-bits/
     */
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }

    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = n & 1;
            int revLsb = lsb << (31 - i);
            res = res | revLsb;
            n = n >> 1;
        }
        return res;
    }
}
