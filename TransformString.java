package String;

import java.util.HashMap;

public class TransformString {
    public static int transform(String A, String B) {
        // code here
        int m = A.length(), n = B.length();

        if (m != n) {
            return -1;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);

            map1.put(a, map1.getOrDefault(a, 0) + 1);
            map2.put(b, map2.getOrDefault(b, 0) + 1);
        }

        System.out.println(map1);
        System.out.println(map2);

        if (!map1.equals(map2)) {
            return -1;
        }

        int i = m - 1, j = n - 1, steps = 0;

        while (i >= 0 && j >= 0) {
            if (A.charAt(i) == B.charAt(j)) {
                i--;
                j--;
            } else {
                steps++;
                i--;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        String a = "ababab";
        String b = "ababab";
        System.out.println(transform(a, b));
    }
}
