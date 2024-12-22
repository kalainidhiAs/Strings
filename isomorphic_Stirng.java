package String;

import java.util.HashMap;

public class isomorphic_Stirng {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);

            if (map1.containsKey(a) && map1.get(a) != b || map2.containsKey(b) && map2.get(b) != a) {
                return false;
            }

            map1.put(a, b);
            map2.put(a, b);
        }
        // Set<Map.Entry<Character, Character>> set = map1.entrySet();
        // System.out.println(set);
        return true;
    }

    public static void main(String[] args) {
        String str1 = "eggaa";
        String str2 = "addee";

        if (areIsomorphic(str1, str2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are isomorphic.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not isomorphic.");
        }
    }
}
