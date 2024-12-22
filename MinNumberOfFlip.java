package String;

import java.util.Arrays;

public class MinNumberOfFlip {
    public static int minFlips(String S) {
        int result[] = new int[S.length()];
        int zerocount = 0;
        int onecount = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '0') {
                onecount++;
            } else {
                zerocount++;
            }
        }

        System.out.println(zerocount);
        System.out.println(onecount);

        boolean turn = true;
        int minflip = 0;
        for (int i = 0; i < S.length(); i++) {
            if (turn) {
                if (onecount > 0) {
                    result[i] = 1;
                    onecount--;
                    minflip++;
                }
            } else {
                if (zerocount > 0) {
                    result[i] = 0;
                    zerocount--;
                    minflip++;
                }
            }
            turn = !turn;
        }
        System.out.println(Arrays.toString(result));
        return minflip;
    }

    public static void main(String[] args) {
        String S = "0001010111";
        System.out.println("Minimum number of flips to convert string into all zeros is: " + minFlips(S));
    }
}
