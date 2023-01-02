package com.rdnbrs.question.questions;

public class DetectCapital {

    /**
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     * <p>
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Given a string word, return true if the usage of capitals in it is right.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: word = "USA"
     * Output: true
     * Example 2:
     * <p>
     * Input: word = "FlaG"
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= word.length <= 100
     * word consists of lowercase and uppercase English letters.
     */

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("aasre"));
        System.out.println(detectCapitalUse("Google"));
    }

    public static boolean detectCapitalUse(String word) {
        char[] wordChars = word.toCharArray();
        int capitalCount = 0;
        for (int i = 0; i < wordChars.length; i++) {
            if (Character.isUpperCase(wordChars[i]))
                capitalCount++;
        }

        return capitalCount == wordChars.length || capitalCount == 0 || (capitalCount == 1 && Character.isUpperCase(wordChars[0]));
    }

}
