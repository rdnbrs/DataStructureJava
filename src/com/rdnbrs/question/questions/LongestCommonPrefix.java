package com.rdnbrs.question.questions;

public class LongestCommonPrefix {

    /**
     * https://leetcode.com/problems/longest-common-prefix/
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string "".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * <p>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lowercase English letters.
     */
    public static void main(String[] args) {
        String[] strs = {"dog", "dota"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();

        int minLength = Integer.MAX_VALUE;
        for (String item : strs) {
            if (minLength > item.length()) {
                minLength = item.length();
            }
        }

        String checkItem = "";
        for (int i = 0; i < minLength; i++) {
            boolean isSame = true;
            for (String item : strs) {
                if (checkItem.equalsIgnoreCase("")) {
                    char[] arr = item.toCharArray();
                    checkItem = String.valueOf(arr[i]);
                } else {
                    char[] arr = item.toCharArray();
                    if (!checkItem.equalsIgnoreCase(String.valueOf(arr[i]))) {
                        isSame = false;
                    }
                }
            }
            if (isSame)
                stringBuilder.append(checkItem);
            else
                break;

            checkItem = "";
        }

        return stringBuilder.toString();

        /**
         *  public String longestCommonPrefix(String[] strs) {
         *     if (strs.length == 0) return "";
         *     String prefix = strs[0];
         *     for (int i = 1; i < strs.length; i++)
         *         while (strs[i].indexOf(prefix) != 0) {
         *             prefix = prefix.substring(0, prefix.length() - 1);
         *             if (prefix.isEmpty()) return "";
         *         }
         *     return prefix;
         * }
         * */
    }
}
