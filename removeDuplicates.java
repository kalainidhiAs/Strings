package String;

import java.util.HashSet;

public class removeDuplicates {
    public static String duplicate(String s) {
        HashSet<Character> unique = new HashSet<>();
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (unique.add(s.charAt(i))) {
                a.append(s.charAt(i));
            }
        }
        return a.toString();
    }

    public static void main(String[] args) {
        String s = "kalainidhi";
        System.out.println("The string after removing duplicates is : " + duplicate(s));

    }
}
