package String;

public class LongestRepeatingSubsequence {

    public static int longestRepeatingSubsequenceLength(String str) {
        int n = str.length();

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        String str = "pfoslsszfx";

        int result = longestRepeatingSubsequenceLength(str);
        System.out.println("Length of the longest repeating subsequence: " + result);
    }
}
