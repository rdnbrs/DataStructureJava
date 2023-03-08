package com.rdnbrs.question.questions;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

    /**
     * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
     */
    
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> combine = new ArrayList<>();

        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i == nums1.length) {
                combine.add(nums2[j++]);
            } else if (j == nums2.length) {
                combine.add(nums1[i++]);
            } else {
                if (nums1[i] < nums2[j])
                    combine.add(nums1[i++]);
                else
                    combine.add(nums2[j++]);
            }
        }

        return combine.size() % 2 != 0 ? combine.get(combine.size() / 2) : (combine.get(combine.size() / 2) + combine.get(combine.size() / 2 - 1)) / 2.0f;
    }
}
