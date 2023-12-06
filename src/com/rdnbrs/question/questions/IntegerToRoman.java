package com.rdnbrs.question.questions;

import java.util.ArrayList;

public class IntegerToRoman {

    /**
     * https://leetcode.com/problems/integer-to-roman/
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: num = 3
     * Output: "III"
     * Explanation: 3 is represented as 3 ones.
     * Example 2:
     * <p>
     * Input: num = 58
     * Output: "LVIII"
     * Explanation: L = 50, V = 5, III = 3.
     * Example 3:
     * <p>
     * Input: num = 1994
     * Output: "MCMXCIV"
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= num <= 3999
     */
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(3999));
    }

    public static String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<String> romanValues = new ArrayList<>();
        romanValues.add("M-1000");
        romanValues.add("CM-900");
        romanValues.add("D-500");
        romanValues.add("CD-400");
        romanValues.add("C-100");
        romanValues.add("XC-90");
        romanValues.add("L-50");
        romanValues.add("XL-40");
        romanValues.add("X-10");
        romanValues.add("IX-9");
        romanValues.add("V-5");
        romanValues.add("IV-4");
        romanValues.add("I-1");

        for (String romanValue : romanValues) {
            String[] romanParts = romanValue.split("-");
            int divide = num / Integer.parseInt(romanParts[1]);
            num = num % Integer.parseInt(romanParts[1]);

            stringBuilder.append(String.valueOf(romanParts[0]).repeat(Math.max(0, divide)));
        }

        return stringBuilder.toString();
    }
}
