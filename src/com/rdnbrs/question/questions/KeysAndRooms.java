package com.rdnbrs.question.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysAndRooms {

    /**
     * https://leetcode.com/problems/keys-and-rooms/
     * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
     * <p>
     * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
     * <p>
     * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: rooms = [[1],[2],[3],[]]
     * Output: true
     * Explanation:
     * We visit room 0 and pick up key 1.
     * We then visit room 1 and pick up key 2.
     * We then visit room 2 and pick up key 3.
     * We then visit room 3.
     * Since we were able to visit every room, we return true.
     * Example 2:
     * <p>
     * Input: rooms = [[1,3],[3,0,1],[2],[0]]
     * Output: false
     * Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == rooms.length
     * 2 <= n <= 1000
     * 0 <= rooms[i].length <= 1000
     * 1 <= sum(rooms[i].length) <= 3000
     * 0 <= rooms[i][j] < n
     * All the values of rooms[i] are unique.
     */
    public static void main(String[] args) {
//        List<Integer> room0 = new ArrayList<>();
//        room0.add(1);
//        room0.add(3);
//
//        List<Integer> room1 = new ArrayList<>();
//        room1.add(3);
//        room1.add(0);
//        room1.add(1);
//
//        List<Integer> room2 = new ArrayList<>();
//        room2.add(2);
//
//        List<Integer> room3 = new ArrayList<>();
//        room3.add(0);
//
//        List<List<Integer>> roomList = new ArrayList<>();
//        roomList.add(room0);
//        roomList.add(room1);
//        roomList.add(room2);
//        roomList.add(room3);


        List<Integer> room0 = new ArrayList<>();
        room0.add(1);

        List<Integer> room1 = new ArrayList<>();
        room1.add(2);

        List<Integer> room2 = new ArrayList<>();
        room2.add(3);

        List<Integer> room3 = new ArrayList<>();

        List<List<Integer>> roomList = new ArrayList<>();
        roomList.add(room0);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        System.out.println(canVisitAllRooms(roomList));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, Integer> visitedRoomList = new HashMap();
        visitedRoomList.put(0, 0);
        List<Integer> keys = rooms.get(0);

        for (int i = 0; i < keys.size(); i++) {
            if (!visitedRoomList.containsKey(keys.get(i))) {
                visitedRoomList.put(keys.get(i), i);
                keys.addAll(rooms.get(keys.get(i)));
            }
        }

        return visitedRoomList.keySet().size() == rooms.size();
    }
}
