package String;
/*
 * Input:
S = "bbabcbcab"
Output: 7
Explanation: Subsequence "babcbab" is the
longest subsequence which is also a palindrome.


Input: 
S = "abcd"
Output: 1
Explanation: "a", "b", "c" and "d" are
palindromic and all have a length 1.
 */

// A Dynamic Programming based Java program for LPS problem

// Returns the length of the longest palindromic subsequence

public class LongestPalindromicSubsequence {
    public static int longestPalinSubseq(String S) {
        String R = new StringBuilder(S).reverse().toString();

        // dp[i][j] will store the length of the longest
        // palindromic subsequence for the substring
        // starting at index i and ending at index j
        int dp[][] = new int[S.length() + 1][R.length() + 1];

        // Filling up DP table based on conditions discussed
        // in above approach
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= R.length(); j++) {
                if (S.charAt(i - 1) == R.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1],
                            dp[i - 1][j]);
            }
        }

        // At the end DP table will contain the LPS
        // So just return the length of LPS
        return dp[S.length()][R.length()];
    }

    // Driver code
    public static void main(String[] args) {
        String s = "kalai";
        System.out.println("The length of the LPS is "
                + longestPalinSubseq(s));
    }
}
