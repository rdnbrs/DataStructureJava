package com.rdnbrs.question.questions;

import java.util.HashMap;

public class RomanToInt {

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
