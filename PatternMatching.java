package String;

import java.util.ArrayList;
import java.util.HashMap;

public class PatternMatching {
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern) {
        ArrayList<String> result = new ArrayList<>();

        for (String word : dict) {
            if (isMatch(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        HashMap<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char charInPattern = pattern.charAt(i);
            char charInWord = word.charAt(i);

            if (mapping.containsKey(charInPattern)) {
                System.out.println("if : " + i);
                if (mapping.get(charInPattern) != charInWord) {
                    System.out.println("ifif : " + i);
                    return false; // Inconsistent mapping
                }
            } else {
                if (mapping.containsValue(charInWord)) {
                    System.out.println("elseif : " + i);
                    return false; // Multiple characters in pattern map to the same character in the word
                }
                System.out.println("else : " + i);
                mapping.put(charInPattern, charInWord);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> dict = new ArrayList<>();
        dict.add("aee");
        dict.add("bab");
        dict.add("eaa");
        dict.add("lpp");

        String pattern = "mnn";

        ArrayList<String> matchedWords = findMatchedWords(dict, pattern);
        int count = 0;

        System.out.println("Words matching the pattern:");
        for (String word : matchedWords) {
            count++;
            System.out.println(word);
        }
        System.out.println(count);
    }
}
