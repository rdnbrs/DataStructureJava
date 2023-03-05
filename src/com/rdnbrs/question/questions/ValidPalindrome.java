package com.rdnbrs.question.questions;

public class ValidPalindrome {

    /**
     * https://leetcode.com/problems/valid-palindrome/
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     * <p>
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * Example 2:
     * <p>
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     * Example 3:
     * <p>
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing non-alphanumeric characters.
     * Since an empty string reads the same forward and backward, it is a palindrome.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("    "));
        System.out.println(isPalindrome("a"));
    }

    public static boolean isPalindrome(String s) {
        //it runs without this too, it has just added for speed. Because if string is 1 character it is always a palindrome
        if (s.length() == 1) return true;

        char[] items = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        for (int i = 0; i < items.length / 2; i++) {
            if (items[i] != items[items.length - 1 - i]) return false;
        }
        return true;
    }
}
