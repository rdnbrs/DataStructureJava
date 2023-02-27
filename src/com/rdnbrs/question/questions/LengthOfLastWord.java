package com.rdnbrs.question.questions;

public class LengthOfLastWord {

    /**
     * https://leetcode.com/problems/length-of-last-word/
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * <p>
     * A word is a maximal
     * substring
     * consisting of non-space characters only.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     * Example 2:
     * <p>
     * Input: s = "   fly me   to   the moon  "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     * Example 3:
     * <p>
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 104
     * s consists of only English letters and spaces ' '.
     * There will be at least one word in s.
     */

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        /**
         * first solution
         * String[] words = s.trim().split(" ");
         * return words[words.length - 1].length();
         */

        return s.trim().length() - (s.trim().lastIndexOf(" ") + 1);
    }
}
