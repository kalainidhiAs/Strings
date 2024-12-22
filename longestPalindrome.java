package String;

public class longestPalindrome {
    public static String palindromeSubString(String s) {

        if (s.isEmpty())
            return "";

        int[] longestPalindromeIndices = { 0, 0 };

        for (int i = 0; i < s.length(); ++i) {
            int[] currentIndices = expandAroundCenter(s, i, i);
            // System.out.println(currentIndices[1] + " " + currentIndices[0]);
            // System.out.println("long " + longestPalindromeIndices[1] + " " +
            // longestPalindromeIndices[0]);
            if (currentIndices[1] - currentIndices[0] > longestPalindromeIndices[1] - longestPalindromeIndices[0]) {
                longestPalindromeIndices = currentIndices;
            }

            // Check if there is a possibility of an even length palindrome centered at
            // character i and i+1
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                // Find the indices of the longest even-length palindrome centered at characters
                // i and i+1
                int[] evenIndices = expandAroundCenter(s, i, i + 1);

                // Compare the length of the even length palindrome with longest found so
                // far
                if (evenIndices[1] - evenIndices[0] > longestPalindromeIndices[1] - longestPalindromeIndices[0]) {
                    // Update the longest palindrome indices if the even length one is longer
                    longestPalindromeIndices = evenIndices;
                }
            }
        }

        // Extract and return the longest palindrome substring using the indices
        return s.substring(longestPalindromeIndices[0], longestPalindromeIndices[1] + 1);
    }

    // Helper function to find and return the indices of the longest palindrome
    // extended from s[i..j] (inclusive) by expanding around the center
    private static int[] expandAroundCenter(final String s, int left, int right) {
        // Expand the palindrome by moving outward from the center while the characters
        // match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return new int[] { left + 1, right - 1 };
    }

    public static void main(String[] args) {
        String input = "aaaabbaa";
        String result = palindromeSubString(input);
        System.out.println("Longest palindrome: " + result);

    }
}