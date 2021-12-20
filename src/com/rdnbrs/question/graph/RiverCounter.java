package com.rdnbrs.question.graph;

public class RiverCounter {

	public static int[][] dmap = { 
			{ 0, 0, 0, 1, 1, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 0, 0, 0, 1 }, 
			{ 0, 0, 1, 0, 0, 0, 0, 0 },
			{ 0, 1, 0, 0, 1, 1, 0, 0 }, 
			{ 0, 1, 0, 0, 1, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 1, 0, 0, 1 } };

	public static void main(String[] args) {
		boolean[][] visited = new boolean[6][8];
		int count = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				if (!visited[i][j] && dmap[i][j] != 0) {
					DFS(visited, dmap, i, j);
					count++;
				}
			}
		}

		System.out.println(count);
	}

	public static void DFS(boolean[][] visited, int[][] dmap, int i, int j) {
		if ((j < 0 || j >= 8) || (i >= 6 || i < 0) || dmap[i][j] == 0 || visited[i][j])
			return;
		visited[i][j] = true;

		DFS(visited, dmap, i, j - 1);
		DFS(visited, dmap, i, j + 1);
		DFS(visited, dmap, i + 1, j);
		DFS(visited, dmap, i - 1, j);
		DFS(visited, dmap, i - 1, j - 1);
		DFS(visited, dmap, i + 1, j + 1);
		DFS(visited, dmap, i + 1, j - 1);
		DFS(visited, dmap, i - 1, j + 1);
	}
}
