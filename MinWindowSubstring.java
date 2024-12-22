package String;

import java.util.*;

public class MinWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        // System.out.println(targetMap);

        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        int required = targetMap.size();
        int formed = 0;
        HashMap<Character, Integer> windowMap = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (targetMap.containsKey(c) && windowMap.get(c) == targetMap.get(c)) {
                formed++;
            }

            while (left <= right && formed == required) {
                // System.out.println(right);
                c = s.charAt(left);

                if (right - left + 1 <= minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                // System.out.println(minLen);

                windowMap.put(c, windowMap.get(c) - 1);
                if (targetMap.containsKey(c) && windowMap.get(c) < targetMap.get(c)) {
                    // System.out.println(windowMap + "" + left);
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }

    public static void main(String[] args) {
        String s = "kalai", t = "aai";
        System.out.println(minWindow(s, t));
    }
}
