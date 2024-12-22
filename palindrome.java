package String;

public class palindrome {
    static boolean isPalindrome(String S) {

        int left = 0;
        int right = S.length() - 1;

        while (left < right) {
            if (S.charAt(left) != S.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "malayalam";
        System.out.println(isPalindrome(S));
    }
}
