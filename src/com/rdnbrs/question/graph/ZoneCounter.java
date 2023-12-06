package com.rdnbrs.question.graph;

public class ZoneCounter {

    protected static final int[][] sampleMap = {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 0, 0, 1}};

    public static void main(String[] args) {
        boolean[][] visited = new boolean[6][8];
        int count = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (!visited[i][j] && sampleMap[i][j] != 1) {
                    dfsMethod(visited, sampleMap, i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void dfsMethod(boolean[][] visited, int[][] sampleMap, int i, int j) {
        if ((j < 0 || j >= 8) || (i >= 6 || i < 0) || sampleMap[i][j] == 1 || visited[i][j])
            return;
        visited[i][j] = true;

        dfsMethod(visited, sampleMap, i, j - 1);
        dfsMethod(visited, sampleMap, i, j + 1);
        dfsMethod(visited, sampleMap, i + 1, j);
        dfsMethod(visited, sampleMap, i - 1, j);
    }
}
