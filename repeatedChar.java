package String;

import java.util.HashMap;

public class repeatedChar {
    char firstRep(String S) {
        // your code here
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        System.out.println(map);

        for (char c : S.toCharArray()) {
            if (map.get(c) > 1) {
                return c;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        String S = "kalainidhik";
        System.out.println(new repeatedChar().firstRep(S));
    }
}