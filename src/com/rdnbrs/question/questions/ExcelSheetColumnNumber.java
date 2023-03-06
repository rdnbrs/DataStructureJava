package com.rdnbrs.question.questions;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("ZZ"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        char[] charList = columnTitle.toCharArray();

        for (int i = 0; i < charList.length; i++) {
            result += (charList[i] - 'A' + 1) * Math.pow(26, charList.length - i - 1);
        }

        return result;
    }
}
