package com.rdnbrs.question.questions;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    /**
     * https://leetcode.com/problems/pascals-triangle/
     * Given an integer numRows, return the first numRows of Pascal's triangle.
     * <p>
     * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
     * <p>
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: numRows = 5
     * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     * Example 2:
     * <p>
     * Input: numRows = 1
     * Output: [[1]]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= numRows <= 30
     */

    public static void main(String[] args) {
        System.out.println(generate(1));
    }

    public static List<List<Integer>> generate(int numRows) {
        List result = new ArrayList();

        List<Integer> row = new ArrayList<>();
        row.add(1);

        result.add(row);

        if (numRows > 1) {
            row = new ArrayList<>();
            row.add(1);
            row.add(1);
            result.add(row);
        }

        for (int i = 2; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);//first item
            List<Integer> prevRow = (List<Integer>) result.get(i - 1);
            for (int j = 0; j < prevRow.size() - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);//last item
            result.add(row);
        }

        return result;
    }
}
