package com.rdnbrs.question.questions;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(702));
        System.out.println(convertToTitle(52));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(55));
        System.out.println(convertToTitle(1018));
    }

    public static String convertToTitle(int columnNumber) {
        String result = "";

        while (columnNumber > 0) {
            columnNumber--;
            result = (char)('A' + (columnNumber % 26)) + result;
            columnNumber = columnNumber / 26;
        }

        return result;
    }

}
