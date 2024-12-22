package String;

/*
 * Input: S1 = "ABCDGH", S2 = "ACDGHR", n = 6, m = 6
Output: 4
Explanation: The longest common substring
is "CDGH" which has length 4.
 */
import java.util.*;

public class LongestCommonSubstring {
    int longestCommonSubstr(String S1, String S2, int n, int m) {
        // code here
        int dp[][] = new int[n + 1][m + 1];

        int result = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return result;
    }

    public static void main(String[] args) {
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String S1 = "set", S2 = "sangeet";
        int n = S1.length();
        int m = S2.length();
        System.out.println(lcs.longestCommonSubstr(S1, S2, n, m));
    }
}
