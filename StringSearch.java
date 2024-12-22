package String;

import java.util.*;

public class StringSearch {
    private static final int[][] DIRECTIONS = {
            { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }, // up down left right
            { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } // upleft upright downleft downright
    };

    public static int[][] searchWord(char[][] grid, String word) {
        int n = grid.length;
        int m = grid[0].length;
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    if (searchFromCell(grid, word, i, j)) {
                        result.add(new int[] { i, j });
                    }
                }
            }
        }

        int resultArray[][] = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    private static boolean searchFromCell(char[][] grid, String word, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;
        int len = word.length();

        for (int[] dir : DIRECTIONS) {
            int newX = x, newY = y, k;

            for (k = 0; k < len; k++) {
                if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == word.charAt(k)) {
                    newX += dir[0];
                    newY += dir[1];
                } else {
                    break;
                }
            }

            if (len == k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = { { 'a', 'b', 'a', 'b' }, { 'a', 'b', 'e', 'b' }, { 'e', 'b', 'e', 'b' } };
        String word = "abe";
        int res[][] = searchWord(grid, word);
        System.out.println(Arrays.deepToString(res));
    }
}
