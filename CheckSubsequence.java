package String;

public class CheckSubsequence {
    static boolean isSubSequence(String A, String B) {
        int n = A.length();
        int m = B.length();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == n;
    }

    public static void main(String[] args) {
        String A = "pen";
        String B = "apaemen";
        System.out.println(isSubSequence(A, B));
    }
}
