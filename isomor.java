package String;

import java.util.Arrays;
import java.util.HashMap;

public class isomor {
    public static boolean areIsomorphic(String str1, String str2) {
        char a[] = str1.toCharArray();
        String s[] = str2.split("\\ ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(s));

        HashMap<Character, String> map1 = new HashMap<>();
        // HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            // System.out.println(i);
            if (map1.containsKey(a[i]) && !map1.get(a[i]).equals(s[i])) {
                return false; // If character in str1 is mapped to a different string in str2, return false
            }
            map1.put(a[i], s[i]);
            // map2.put(s[i], a[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abaa";
        String str2 = "cat dog cat cat";

        System.out.println(areIsomorphic(str1, str2));
    }

}
