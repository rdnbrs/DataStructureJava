package com.rdnbrs.question.questions;

public class ZigzagConversion {

    /**
     * https://leetcode.com/problems/zigzag-conversion/
     */

    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        StringBuilder[] rows = new StringBuilder[numRows];
        int rowCount = 0;
        int rowChange = -1;
        for (int i = 0; i < s.length(); i++) {
            if (rowCount == 0 || rowCount == numRows - 1)
                rowChange *= -1;
            if (rows[rowCount] == null)
                rows[rowCount] = new StringBuilder();
            rows[rowCount].append(s.charAt(i));
            rowCount += rowChange;
        }

        for (StringBuilder value : rows)
            if (value != null) //leetcode gives error for some cases. because of that we added this control
                sb.append(value);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
