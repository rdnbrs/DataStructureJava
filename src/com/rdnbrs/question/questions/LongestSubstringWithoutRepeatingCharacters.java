package com.rdnbrs.question.questions;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
     */
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("asde"));
        System.out.println(lengthOfLongestSubstring("asdeasdfghjuı"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        char[] characterList = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : characterList) {
            if (builder.indexOf(String.valueOf(c)) == -1)
                builder.append(c);
            else {
                if (max < builder.length())
                    max = builder.length();

                builder = new StringBuilder(builder.substring(builder.indexOf(String.valueOf(c)) + 1));
                builder.append(c);
            }
        }

        if (max < builder.length())
            max = builder.length();

        return max;
    }
}
