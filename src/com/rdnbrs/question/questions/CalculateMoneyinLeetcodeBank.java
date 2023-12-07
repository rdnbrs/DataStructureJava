package com.rdnbrs.question.questions;

public class CalculateMoneyinLeetcodeBank {

    /**
     * https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/?envType=daily-question&envId=2023-12-06
     */

    public int totalMoney(int n) {
        int sumOfWeek = 28;
        int weekCount = n / 7;
        int restDay = n % 7;

        int result = 0;
        for (int i = 0; i < weekCount; i++) {
            result += sumOfWeek + (i * 7);
        }

        for (int i = 1; i <= restDay; i++) {
            result += i + weekCount;
        }

        return result;
    }

}
