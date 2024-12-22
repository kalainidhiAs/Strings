package String;

import java.util.*;

public class wildString {
    static int wildCard(String pattern, String str) {
        int m = pattern.length();
        int n = str.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= m; i++) {
            if (pattern.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (pattern.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else if (pattern.charAt(i - 1) == '?' || pattern.charAt(i - 1) == str.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[m][n] ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String p = "ge*ks";
        System.out.println(wildCard(p, s));
    }
}

/*
 * public static boolean isMatch(String text, String pattern) {
 * return findMatch(text, pattern, 0, 0);
 * }
 * 
 * private static boolean findMatch(String text, String pattern, int ti, int pi)
 * {
 * 
 * if (pi == pattern.length()) {
 * return ti == text.length();
 * }
 * 
 * if (pattern.charAt(pi) == '*') {
 * while (pi < pattern.length() && pattern.charAt(pi) == '*') {
 * pi++;
 * }
 * 
 * for (int i = ti; i <= text.length(); i++) {
 * if (findMatch(text, pattern, i, pi)) {
 * return true;
 * }
 * }
 * } else if (ti < text.length() && (text.charAt(ti) == pattern.charAt(pi) ||
 * pattern.charAt(pi) == '?')) {
 * return findMatch(text, pattern, ti + 1, pi + 1);
 * }
 * 
 * return false;
 */