package String;

public class wildcardUsingLoop {
    static boolean wildCard(String s, String p) {
        int n = s.length();
        int m = p.length();

        int i = 0, j = 0, start = -1, match = 0;

        while (i < n) {
            if (j < m && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < m && p.charAt(j) == '*') {
                start = j;
                match = i;
                j++;
            } else if (start != -1) {
                j = start + 1;
                match++;
                i = match;
            } else {
                return false;
            }
        }

        while (j < m && p.charAt(j) == '*') {
            j++;
        }

        return j == m;

        // while (i < n) {
        // if (j < m && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
        // i++;
        // j++;
        // } else if (j < m && p.charAt(j) == '*') {
        // start = j;
        // match = i;
        // j++;
        // } else if (start != -1) {
        // j = start + 1;
        // match++;
        // i = match;
        // } else {
        // return false;
        // }
        // }

        // while (j < m && p.charAt(j) == '*') {
        // j++;
        // }

        // return j == m;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String p = "ge*k?";
        System.out.println(wildCard(s, p));
    }
}
