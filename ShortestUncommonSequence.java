package String;

/*
 * Given two strings S and T, find length of the shortest
 * subsequence in S which is not a subsequence in T.
 * If no such subsequence is possible, return -1.
 * A subsequence is a sequence that appears in the same relative order, but not
 * necessarily contiguous.
 * A string of length n has 2^n different possible subsequences.
 * Example 1:
 * 
 * Input:
 * S = "babab"
 * T = "babba"
 * Output:
 * 3
 * Explanation:
 * There are no subsequences of S with
 * length less than 3 which is not a
 * subsequence of T. "aab" is an example of
 * a subsequence of length 3 which isn't a
 * subsequence of T.
 */
public class ShortestUncommonSequence {
    public static int shortestUncommonSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        int dp[][] = new int[n + 1][m + 1];

        // Initialize the DP array
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else if (s.charAt(i - 1) != t.charAt(j - 1)) {
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }

        // Find the minimum length of subsequence not in T
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            result = Math.min(result, dp[i][m]);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        String S = "babab";
        String T = "babba";
        System.out.println(shortestUncommonSubsequence(S, T)); // Output: 3
    }
}
