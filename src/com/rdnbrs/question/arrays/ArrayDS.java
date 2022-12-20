package com.rdnbrs.question.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayDS {
    /*
    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    */
    public static int hourGlassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int sum = (arr.get(i)).get(j) + (arr.get(i)).get(j + 1) + (arr.get(i)).get(j + 2) + (arr.get(i + 1)).get(j + 1) + (arr.get(i + 2)).get(j) + (arr.get(i + 2)).get(j + 1) + (arr.get(i + 2)).get(j + 2);

                if (sum > max)
                    max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> rowItem = new ArrayList<Integer>();
        rowItem.add(-9);
        rowItem.add(-9);
        rowItem.add(-9);
        rowItem.add(1);
        rowItem.add(1);
        rowItem.add(1);
        arr.add(rowItem);
        rowItem = new ArrayList<Integer>();
        rowItem.add(0);
        rowItem.add(-9);
        rowItem.add(0);
        rowItem.add(4);
        rowItem.add(3);
        rowItem.add(2);
        arr.add(rowItem);
        rowItem = new ArrayList<Integer>();
        rowItem.add(-9);
        rowItem.add(-9);
        rowItem.add(-9);
        rowItem.add(1);
        rowItem.add(2);
        rowItem.add(3);
        arr.add(rowItem);
        rowItem = new ArrayList<Integer>();
        rowItem.add(0);
        rowItem.add(0);
        rowItem.add(8);
        rowItem.add(6);
        rowItem.add(6);
        rowItem.add(0);
        arr.add(rowItem);
        rowItem = new ArrayList<Integer>();
        rowItem.add(0);
        rowItem.add(0);
        rowItem.add(0);
        rowItem.add(-2);
        rowItem.add(0);
        rowItem.add(0);
        arr.add(rowItem);
        rowItem = new ArrayList<Integer>();
        rowItem.add(0);
        rowItem.add(0);
        rowItem.add(1);
        rowItem.add(2);
        rowItem.add(4);
        rowItem.add(0);
        arr.add(rowItem);
        System.out.println(hourGlassSum(arr));
    }

}
