package com.vika.algorithm.leetcode.midium.S601_800;

import java.util.LinkedList;
import java.util.Queue;

public class S695MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                int area = dfs(grid, i, j, m, n, visited);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || grid[i][j] == 0) {
            return 0;
        }
        int area = 1;
        visited[i][j] = true;
        area += dfs(grid, i + 1, j, m, n, visited);
        area += dfs(grid, i - 1, j, m, n, visited);
        area += dfs(grid, i, j + 1, m, n, visited);
        area += dfs(grid, i, j - 1, m, n, visited);
        return area;
    }

    public int maxAreaOfIsland1(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                queue.offer(new int[]{i, j});
                visited[i][j] = true;
                int area = 0;
                while (!queue.isEmpty()) {
                    int[] pos = queue.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int x = pos[0] + dx[k];
                        int y = pos[1] + dy[k];
                        if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1 && !visited[x][y]) {
                            queue.offer(new int[]{x, y});
                            visited[x][y] = true;
                        }
                    }
                }
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

}
