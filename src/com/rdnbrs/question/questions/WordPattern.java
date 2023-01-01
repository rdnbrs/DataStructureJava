package com.rdnbrs.question.questions;

import java.util.HashMap;

public class WordPattern {
    /**
     * Given a pattern and a string s, find if s follows the same pattern.
     * <p>
     * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: pattern = "abba", s = "dog cat cat dog"
     * Output: true
     * Example 2:
     * <p>
     * Input: pattern = "abba", s = "dog cat cat fish"
     * Output: false
     * Example 3:
     * <p>
     * Input: pattern = "aaaa", s = "dog cat cat dog"
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= pattern.length <= 300
     * pattern contains only lower-case English letters.
     * 1 <= s.length <= 3000
     * s contains only lowercase English letters and spaces ' '.
     * s does not contain any leading or trailing spaces.
     * All the words in s are separated by a single space.
     */

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
        System.out.println(wordPattern("aaa", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap patternKeys = new HashMap();
        char[] patternChars = pattern.toCharArray();
        String[] checkStrings = s.split(" ");

        if(patternChars.length != checkStrings.length)
            return false;

        for (int i = 0; i < patternChars.length; i++) {
            if (!patternKeys.containsKey(String.valueOf(patternChars[i]))) {
                if(patternKeys.containsValue(checkStrings[i]))
                    return false;
                patternKeys.put(String.valueOf(patternChars[i]), checkStrings[i]);
            } else if (!patternKeys.get(String.valueOf(patternChars[i])).equals(checkStrings[i]))
                return false;
        }
        return true;
    }
}
