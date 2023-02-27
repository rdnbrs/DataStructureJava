package com.rdnbrs.question.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class MinimumRoundsToCompleteAllTasks {

    /**
     * https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
     * You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.
     * <p>
     * Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: tasks = [2,2,3,3,2,4,4,4,4,4]
     * Output: 4
     * Explanation: To complete all the tasks, a possible plan is:
     * - In the first round, you complete 3 tasks of difficulty level 2.
     * - In the second round, you complete 2 tasks of difficulty level 3.
     * - In the third round, you complete 3 tasks of difficulty level 4.
     * - In the fourth round, you complete 2 tasks of difficulty level 4.
     * It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.
     * Example 2:
     * <p>
     * Input: tasks = [2,3,3]
     * Output: -1
     * Explanation: There is only 1 task of difficulty level 2, but in each round, you can only complete either 2 or 3 tasks of the same difficulty level. Hence, you cannot complete all the tasks, and the answer is -1.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= tasks.length <= 105
     * 1 <= tasks[i] <= 109
     */

    public static void main(String[] args) {
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5};
        int[] tasks2 = {2, 3, 3};
        System.out.println(minimumRounds(tasks));
        System.out.println(minimumRounds(tasks2));
    }

    public static int minimumRounds(int[] tasks) {
        AtomicInteger result = new AtomicInteger(0);
        AtomicBoolean failed = new AtomicBoolean(false);

        HashMap<Integer, Integer> itemCounts = new HashMap();

        Arrays.stream(tasks).forEach(item -> {
            if (!itemCounts.containsKey(item)) {
                itemCounts.put(item, 1);
            } else {
                itemCounts.put(item, itemCounts.get(item) + 1);
            }
        });

        Set<Integer> keys = itemCounts.keySet();
        keys.forEach(item -> {
            if(itemCounts.get(item) == 1)
                failed.set(true);

            int mod3 = itemCounts.get(item) % 3;

            if (mod3 == 0) {
                result.getAndAdd(itemCounts.get(item) / 3);
            } else {
                result.getAndAdd((itemCounts.get(item) / 3) + 1);
            }
        });

        if (failed.get())
            return -1;

        return result.get();
    }

}
