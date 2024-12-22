package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static int breakword(String A, ArrayList<String> B) {

        HashSet<String> set = new HashSet<>(B);
        // System.out.println(set);
        int n = A.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n] ? 1 : 0;

    }

    public static void main(String[] args) {
        String A = "kalainidhi";
        ArrayList<String> B = new ArrayList<>(List.of(
                "i", "nidh", "kalai",
                "am"));

        int result = breakword(A, B);
        System.out.println("Can the string be segmented? " + result);
    }
}