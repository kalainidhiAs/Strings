package String;

import java.util.ArrayList;

public class Kmp_Algo {
    static ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();

        int n = txt.length();
        int m = pat.length();

        // Calculate the prefix array for the pattern
        int[] lps = calculateLPS(pat);

        int i = 0, j = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                // Pattern found at index (i - j)
                result.add(i - j + 1);
                j = lps[j - 1];
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return result;
    }

    // Helper function to calculate the Longest Prefix Suffix (LPS) array
    private static int[] calculateLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        String txt = "abcdabc";
        String pat = "abc";
        ArrayList<Integer> go = search(pat, txt);
        System.out.println(go);
    }
}
