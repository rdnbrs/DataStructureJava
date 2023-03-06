package com.rdnbrs.question.questions;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap();

        for (int item : nums) {
            counts.putIfAbsent(item, 0);
            counts.put(item, counts.get(item) + 1);

            if (counts.get(item) > nums.length / 2)
                return item;
        }

        return 0;
    }
}
