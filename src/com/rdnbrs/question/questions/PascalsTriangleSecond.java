package com.rdnbrs.question.questions;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleSecond {

    /**
     * https://leetcode.com/problems/pascals-triangle-ii/
     * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
     * <p>
     * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
     * <p>
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: rowIndex = 3
     * Output: [1,3,3,1]
     * Example 2:
     * <p>
     * Input: rowIndex = 0
     * Output: [1]
     * Example 3:
     * <p>
     * Input: rowIndex = 1
     * Output: [1,1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= rowIndex <= 33
     * <p>
     * <p>
     * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
     */

    public static void main(String[] args) {
        System.out.println(getRow(2));
    }

    public static List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> result = new ArrayList();

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

        return result.get(rowIndex);
    }

}
