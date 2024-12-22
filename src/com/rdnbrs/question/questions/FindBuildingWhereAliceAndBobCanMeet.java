package com.rdnbrs.question.questions;

import java.util.Arrays;
import java.util.HashMap;

public class FindBuildingWhereAliceAndBobCanMeet {

    /**
     * https://leetcode.com/problems/find-building-where-alice-and-bob-can-meet/description/?envType=daily-question&envId=2024-12-22
     */

    /**
     * 951/952 cases passed - time limit
     */
    public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] response = new int[queries.length];
        Arrays.fill(response, -1);
        HashMap<String, Integer> prevResponse = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {
            int aliceBuilding = queries[i][0];
            int bobBuilding = queries[i][1];

            if (prevResponse.containsKey("a" + aliceBuilding + "b" + bobBuilding))
                response[i] = prevResponse.get("a" + aliceBuilding + "b" + bobBuilding);
            else if (aliceBuilding > bobBuilding && heights[aliceBuilding] > heights[bobBuilding])
                response[i] = aliceBuilding;
            else if (bobBuilding > aliceBuilding && heights[bobBuilding] > heights[aliceBuilding])
                response[i] = bobBuilding;
            else if (aliceBuilding == bobBuilding)
                response[i] = aliceBuilding;
            else {
                int maxBuilding = Math.max(aliceBuilding, bobBuilding);
                int maxHeight = Math.max(heights[aliceBuilding], heights[bobBuilding]);
                for (int j = maxBuilding + 1; j < heights.length; j++) {
                    if (maxHeight < heights[j]) {
                        response[i] = j;
                        break;
                    }
                }
            }
            prevResponse.put("a" + aliceBuilding + "b" + bobBuilding, response[i]);
        }

        return response;
    }

    public static void main(String[] args) {
        int[] height = new int[]{6, 4, 8, 5, 2, 7};
        int[][] queries = new int[][]{
                {0, 1},
                {0, 3},
                {2, 4},
                {3, 4},
                {2, 2},
        };

        Arrays.stream(leftmostBuildingQueries(height, queries)).forEach(System.out::print);
        System.out.println();
        int[] height2 = new int[]{5, 3, 8, 2, 6, 1, 4, 6};
        int[][] queries2 = new int[][]{
                {0, 7},
                {3, 5},
                {5, 2},
                {3, 0},
                {1, 6},
        };

        Arrays.stream(leftmostBuildingQueries(height2, queries2)).forEach(System.out::print);
    }
}
