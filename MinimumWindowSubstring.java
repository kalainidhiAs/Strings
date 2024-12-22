package String;

import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

public class MinimumWindowSubstring {

    public static String minLenSubstring(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int required = t.length();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Set<Map.Entry<Character, Integer>> set = map.entrySet();
        // System.out.println(set);
        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (j < s.length()) {
            char endChar = s.charAt(j);
            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) {
                    required--;
                }
                map.put(endChar, map.get(endChar) - 1);
            }
            j++;

            while (required == 0) {
                if (j - i < minLen) {
                    minLen = j - i;
                    minStart = i;
                }

                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        required++;
                    }
                }
                i++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String s = "ABCDEF";
        String t = "CDE";
        System.out.println(minLenSubstring(s, t));
    }
}
