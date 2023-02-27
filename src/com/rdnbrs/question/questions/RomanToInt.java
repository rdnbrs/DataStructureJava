package com.rdnbrs.question.questions;

import java.util.HashMap;

public class RomanToInt {

    /**
     * https://leetcode.com/problems/roman-to-integer/
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
     * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     * <p>
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     * <p>
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 15
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        char[] charList = s.toCharArray();

        HashMap<String, Integer> values = new HashMap();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        int sum = 0;
        int temp = 0;
        String countingItem = null;

        for (char i : charList) {
            if (countingItem == null || countingItem.equalsIgnoreCase(String.valueOf(i))) {
                temp += values.get(String.valueOf(i));
            } else {
                if ((countingItem.equalsIgnoreCase("I") && (String.valueOf(i).equalsIgnoreCase("V") || String.valueOf(i).equalsIgnoreCase("x")))
                        || (countingItem.equalsIgnoreCase("x") && ((String.valueOf(i).equalsIgnoreCase("l")) || String.valueOf(i).equalsIgnoreCase("c")))
                        || (countingItem.equalsIgnoreCase("C") && ((String.valueOf(i).equalsIgnoreCase("d")) || String.valueOf(i).equalsIgnoreCase("m")))) {
                    sum -= temp;
                    temp = values.get(String.valueOf(i));
                } else {
                    sum += temp;
                    temp = values.get(String.valueOf(i));
                }
            }
            countingItem = String.valueOf(i);
        }

        sum += temp;

        return sum;
    }
}
