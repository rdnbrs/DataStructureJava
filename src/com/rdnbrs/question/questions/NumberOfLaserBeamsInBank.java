package com.rdnbrs.question.questions;

public class NumberOfLaserBeamsInBank {

    /**
     * https://leetcode.com/problems/number-of-laser-beams-in-a-bank
     */

    public static int numberOfBeams(String[] bank) {
        int result = 0;
        int prevCount = -1;

        for (String row : bank) {
            int rowCount = 0;
            for (int i = 0; i < row.length(); i++)
                if (row.charAt(i) == '1') {
                    rowCount++;
                }

            if (rowCount != 0) {
                if (prevCount != -1) {
                    result += (prevCount * rowCount);
                }
                prevCount = rowCount;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
        System.out.println(numberOfBeams(new String[]{"000", "111", "000"}));
    }
}
