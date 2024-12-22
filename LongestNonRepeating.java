package String;

import java.util.*;

public class LongestNonRepeating {
    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int maxLen = 0, i = 0, j = 0;

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
                // System.out.println(maxLen);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
                System.out.println(i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
