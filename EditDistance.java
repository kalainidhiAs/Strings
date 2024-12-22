package String;

public class EditDistance {
    public static int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();

        // Create a 2D array to store the minimum number of operations
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If s is empty, insert all characters from t
                } else if (j == 0) {
                    dp[i][j] = i; // If t is empty, remove all characters from s
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No operation needed for matching characters
                } else {
                    // Choose the minimum of insertion, removal, and replacement operations
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
                }
            }
        }

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        // The bottom-right cell contains the minimum number of operations
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s = "ecfbefdcfca";
        String t = "badfcbebbf";
        System.out.println(editDistance(s, t));
    }
}
