package com.rdnbrs.question.questions;

import java.util.Arrays;

public class AssignCookies {

    /**
     * https://leetcode.com/problems/assign-cookies/?envType=daily-question&envId=2024-01-01
     */

    public static int findContentChildren(int[] g, int[] s) {
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = 0;
        int greedIndex = 0;
        while (greedIndex < g.length && cookieIndex < s.length)
            if (g[greedIndex] <= s[cookieIndex]) {
                greedIndex++;
                cookieIndex++;
                result++;
            } else {
                cookieIndex++;
            }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

}
