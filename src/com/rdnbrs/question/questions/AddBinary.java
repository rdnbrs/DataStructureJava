package com.rdnbrs.question.questions;

public class AddBinary {

    /**
     * Given two binary strings a and b, return their sum as a binary string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: a = "11", b = "1"
     * Output: "100"
     * Example 2:
     * <p>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= a.length, b.length <= 104
     * a and b consist only of '0' or '1' characters.
     * Each string does not contain leading zeros except for the zero itself.
     */
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("1111", "1111"));
    }

    public static String addBinary(String a, String b) {
        char[] first = a.length() >= b.length() ? a.toCharArray() : b.toCharArray();
        char[] second = a.length() >= b.length() ? b.toCharArray() : a.toCharArray();
        int overload = 0;
        String result = "";
        for (int i = 0; i < second.length; i++) {
            int sum = Integer.valueOf(String.valueOf(first[first.length - (1 + i)])) + Integer.valueOf(String.valueOf(second[second.length - (1 + i)])) + overload;
            if (sum >= 2) {
                overload = 1;
                result = (sum - 2) + result;
            } else {
                result = sum + result;
                overload = 0;
            }
        }

        for (int i = result.length(); i < first.length; i++) {
            int sum = Integer.valueOf(String.valueOf(first[first.length - (1 + i)])) + overload;
            if (sum >= 2) {
                overload = 1;
                result = (sum - 2) + result;
            } else {
                result = sum + result;
                overload = 0;
            }
        }

        if (overload == 1) {
            result = "1" + result;
        }

        return result;
    }
}
