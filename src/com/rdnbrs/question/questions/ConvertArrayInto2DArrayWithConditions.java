package com.rdnbrs.question.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertArrayInto2DArrayWithConditions {

    /**
     * https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
     */

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();
        HashMap<Integer, Integer> indexes = new HashMap<>();

        for (int num : nums) {
            if (response.size() > indexes.getOrDefault(num, 0)) {
                response.get(indexes.getOrDefault(num, 0)).add(num);
            } else {
                List<Integer> item = new ArrayList<>();
                item.add(num);
                response.add(item);
            }
            indexes.put(num, indexes.getOrDefault(num, 0) + 1);
        }

        return response;
    }

    public static void main(String[] args) {
        findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1});
    }
}
