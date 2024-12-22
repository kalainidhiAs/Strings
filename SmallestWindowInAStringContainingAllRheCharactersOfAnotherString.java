package String;

import java.util.HashMap;

public class SmallestWindowInAStringContainingAllRheCharactersOfAnotherString {
    public static String smallestWindow(String s, String p) {
        // Your code here
        if (s.isEmpty() || p.isEmpty()) {
            return "-1";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = p.length();
        int i = 0;
        int j = 0;
        int minLen = s.length() + 1;
        int minstart = 0;

        while (j < s.length()) {
            char endchar = s.charAt(j);
            if (map.containsKey(endchar)) {
                if (map.get(endchar) > 0) {
                    required--;
                }
                map.put(endchar, map.get(endchar) - 1);
            }
            j++;

            while (required == 0) {
                if (j - i < minLen) {
                    minLen = j - i;
                    minstart = i;
                }

                char startchar = s.charAt(i);
                if (map.containsKey(startchar)) {
                    map.put(startchar, map.get(startchar) + 1);
                    if (map.get(startchar) > 0) {
                        required++;
                    }
                }
                i++;
            }
        }

        if (minLen == s.length() + 1) {
            return "-1";
        }

        return s.substring(minstart, minstart + minLen);
    }

    public static void main(String[] args) {
        String S = "timetopractice";
        String P = "toc";
        System.out.println("Minimum substring is: " + smallestWindow(S, P));
    }
}