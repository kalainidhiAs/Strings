package String;

public class CountPalindromeSubsequence {
    static final int MOD = 1000000007;

    static long countPS(String str) {
        // Your code here
        int n = str.length();
        long[][] dp = new long[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1; // Single characters are palindromic
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = (dp[i + 1][j] + dp[i][j - 1] + 1) % MOD;
                } else {
                    dp[i][j] = (dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1] + MOD) % MOD;
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String Str = "abcd";
        System.out.println("Count of Palindromic Subsequences is: " + countPS(Str));
    }
}

/*
 * Input:
 * Str = "aab"
 * Output:
 * 4
 * Explanation:
 * palindromic subsequence are :"a", "a", "b", "aa"
 */