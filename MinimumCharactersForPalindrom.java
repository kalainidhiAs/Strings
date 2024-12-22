package String;

public class MinimumCharactersForPalindrom {

    // Function to compute LPS array
    private static int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int j = 0;
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Function to find the minimum characters to be added
    public static int minCharsToMakePalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        int[] lps = computeLPS(reversedStr);
        return str.length() - lps[str.length() - 1];
    }

    public static void main(String[] args) {
        String input = "aba";
        int result = minCharsToMakePalindrome(input);
        System.out.println("Minimum characters to be added: " + result);
    }
}
