package String;

public class LongestCommonSubsequence {
    public static int longestcommonsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int[m + 1][n + 1];
        // System.out.println(Arrays.deepToString(dp));

        for (int i = 0; i <= m; i++) {
            // System.out.println(" i " + i);
            for (int j = 0; j <= n; j++) {
                // System.out.println(" j " + j);
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    // System.out.println("if : " + Arrays.deepToString(dp));
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    // System.out.println("else if : " + Arrays.deepToString(dp));
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    // System.out.println(" else " + Arrays.deepToString(dp));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";
        System.out.println(longestcommonsequence(s1, s2));
    }
}
