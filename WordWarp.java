package String;

import java.util.Arrays;

public class WordWarp {
    public static int printWord(int arr[], int k) {
        int n = arr.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            int len = -1;
            for (int j = i; j < n; j++) {
                len += arr[j] + 1;
                if (len > k) {
                    break;
                }
                int cost = (j == n - 1) ? 0 : (k - len) * (k - len);
                if (dp[i] > cost + dp[j + 1]) {
                    dp[i] = cost + dp[j + 1];
                }
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 5 };
        int k = 6;
        System.out.println(printWord(arr, k));
    }
}
