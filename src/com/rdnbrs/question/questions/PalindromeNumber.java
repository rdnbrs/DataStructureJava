package com.rdnbrs.question.questions;

public class PalindromeNumber {

    /**
     * https://leetcode.com/problems/palindrome-number/
     * Given an integer x, return true if x is a
     * palindrome
     * , and false otherwise.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * Example 2:
     * <p>
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     * <p>
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * -231 <= x <= 231 - 1
     * <p>
     * <p>
     * Follow up: Could you solve it without converting the integer to a string?
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11));
    }


    public static boolean isPalindrome(int x) {
        if (x < 10)
            return false;

        //char array solution
        char[] charList = String.valueOf(x).toCharArray();
        for (int i = 0; i < charList.length / 2; i++) {
            if (charList[i] != charList[charList.length - 1 - i])
                return false;
        }

        return true;

        //integer solution
        /*int reverseX = 0;
        while (x > reverseX) {
            reverseX = reverseX * 10 + x % 10;
            x /= 10;
        }

        return x == reverseX || x == reverseX / 10;*/
    }
}
