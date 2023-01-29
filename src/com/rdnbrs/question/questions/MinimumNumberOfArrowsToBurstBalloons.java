package com.rdnbrs.question.questions;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {

    /**
     * There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
     * <p>
     * Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
     * <p>
     * Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: points = [[10,16],[2,8],[1,6],[7,12]]
     * Output: 2
     * Explanation: The balloons can be burst by 2 arrows:
     * - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
     * - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
     * Example 2:
     * <p>
     * Input: points = [[1,2],[3,4],[5,6],[7,8]]
     * Output: 4
     * Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
     * Example 3:
     * <p>
     * Input: points = [[1,2],[2,3],[3,4],[4,5]]
     * Output: 2
     * Explanation: The balloons can be burst by 2 arrows:
     * - Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
     * - Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= points.length <= 105
     * points[i].length == 2
     * -231 <= xstart < xend <= 231 - 1
     * x
     */

    public static void main(String[] args) {

        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] points3 = {{2, 3}, {1, 2}, {3, 4}, {4, 5}};
        int[][] points4 = {{2, 5}, {1, 4}, {3, 4}, {4, 5}};
        int[][] points5 = {{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};
        System.out.println(findMinArrowShots(points));
        System.out.println(findMinArrowShots(points2));
        System.out.println(findMinArrowShots(points3));
        System.out.println(findMinArrowShots(points4));
        System.out.println(findMinArrowShots(points5));

    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int result = 1;
        int previous = 0;

        for (int current = 1; current < points.length; current++) {
            if (points[current][0] > points[previous][1]) {
                result++;
                previous = current;
            }
        }
        return result;
    }
}
