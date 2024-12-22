package String;

public class isSubSequence {
    public static boolean checkSubsequence(String s, String t) {

        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.length();
    }

    public static void main(String[] args) {
        String s = "set", t = "sangeet";
        System.out.println(checkSubsequence(s, t));
    }
}
