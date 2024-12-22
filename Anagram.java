package String;

import java.util.Arrays;

public class Anagram {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {

        // Your code here
        if (a.length() != b.length()) {
            return false;
        }

        char chararrA[] = a.toCharArray();
        char chararrB[] = b.toCharArray();

        Arrays.sort(chararrA);
        Arrays.sort(chararrB);

        return Arrays.equals(chararrA, chararrB);

    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}