package com.rdnbrs.question.questions;

public class LargestOddNumberinString {

    /**
     * https://leetcode.com/problems/largest-odd-number-in-string/?envType=daily-question&envId=2023-12-07
     */

    public static String largestOddNumber(String num) {
        char[] charList = num.toCharArray();
        for (int i = 0; i < charList.length; i++) {
            if (Integer.parseInt(String.valueOf(charList[charList.length - (i + 1)])) % 2 != 0) {
                return num.substring(0, charList.length - i);
            }
        }
        return "";
    }
}
