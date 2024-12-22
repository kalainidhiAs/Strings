package String;

public class ispalindrome {
    public static boolean ispal(int n) {
        String str = Integer.toString(n);
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n = 123321;
        System.out.println(ispal(n));
    }
}
