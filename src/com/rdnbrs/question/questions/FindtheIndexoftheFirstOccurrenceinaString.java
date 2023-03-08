package com.rdnbrs.question.questions;

public class FindtheIndexoftheFirstOccurrenceinaString {

    /**
     * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
     */
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {
        return needle.length() > haystack.length() ? -1 : haystack.indexOf(needle);
    }
}
