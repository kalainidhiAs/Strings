package String;

import java.util.*;

public class StringTransformation {
    public static final int MOD = 1000000007;

    public static int numberOfWays(String s, String t, int k) {
        int n = s.length();
        int m = t.length();
        ;

        if (n != m) {
            return 0;
        }

        List<Integer> rotationList = new ArrayList<>();
        String doubles = s + s;
        System.out.println(doubles);

        for (int i = 0; i < n; i++) {
            String rotation = doubles.substring(i, i + n);
            if (rotation.equals(t)) {
                rotationList.add(i);
            }
        }

        if (rotationList.isEmpty()) {
            return 0;
        }

        System.out.println(rotationList);

        long dp[] = new long[n];
        dp[0] = 1;

        for (int i = 1; i <= k; i++) {
            long[] newDp = new long[n];
            for (int j : rotationList) {
                newDp[j] = dp[(j - 1 + n) % n];
                System.out.println(Arrays.toString(newDp));
            }

            dp = newDp;
            System.out.println(Arrays.toString(dp) + " hi");
        }

        long res = 0;
        for (int r : rotationList) {
            res = (res + dp[r]) % MOD;
        }

        System.out.println(r);

        return 1;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdab";
        int k = 2;
        System.out.println(numberOfWays(s, t, k));
    }
}