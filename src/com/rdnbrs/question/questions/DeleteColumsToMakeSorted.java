package com.rdnbrs.question.questions;

import java.util.ArrayList;
import java.util.List;

public class DeleteColumsToMakeSorted {

    /**
     * You are given an array of n strings strs, all of the same length.
     * <p>
     * The strings can be arranged such that there is one on each line, making a grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
     * <p>
     * abc
     * bce
     * cae
     * You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
     * <p>
     * Return the number of columns that you will delete.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["cba","daf","ghi"]
     * Output: 1
     * Explanation: The grid looks as follows:
     * cba
     * daf
     * ghi
     * Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
     * Example 2:
     * <p>
     * Input: strs = ["a","b"]
     * Output: 0
     * Explanation: The grid looks as follows:
     * a
     * b
     * Column 0 is the only column and is sorted, so you will not delete any columns.
     * Example 3:
     * <p>
     * Input: strs = ["zyx","wvu","tsr"]
     * Output: 3
     * Explanation: The grid looks as follows:
     * zyx
     * wvu
     * tsr
     * All 3 columns are not sorted, so you will delete all 3.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == strs.length
     * 1 <= n <= 100
     * 1 <= strs[i].length <= 1000
     * strs[i] consists of lowercase English letters.
     */
    public static void main(String[] args) {
        String[] sample = new String[]{"abc", "bce", "cae"};
        String[] sample2 = new String[]{"cba", "daf", "ghi"};
        String[] sample3 = new String[]{"a", "b"};
        String[] sample4 = new String[]{"zyx", "wvu", "tsr"};

        System.out.println(minDeletionSize(sample));
        System.out.println(minDeletionSize(sample2));
        System.out.println(minDeletionSize(sample3));
        System.out.println(minDeletionSize(sample4));
    }

    public static int minDeletionSize(String[] strs) {
        int columnCount = 0;
        List<char[]> charList = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            charList.add(strs[i].toCharArray());
        }

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < charList.size() - 1; j++) {
                if (charList.get(j)[i] > charList.get(j + 1)[i]) {
                    columnCount++;
                    break;
                }
            }
        }

        return columnCount;
    }
}
