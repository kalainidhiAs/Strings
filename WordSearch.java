package String;

public class WordSearch {
    public static boolean isWordExist(char[][] board, String word) {
        // Code here
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
        int n = board.length;
        int m = board[0].length;

        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) ||
                dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {
        char[][] board = { { 'a', 'g', 'b', 'c' }, { 'q', 'e', 'e', 'l' }, { 'g', 'b', 'k', 's' } };
        String word = "geeks";
        System.out.println(isWordExist(board, word));
    }
}
