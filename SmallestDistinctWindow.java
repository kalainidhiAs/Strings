package String;

import java.util.HashMap;

public class SmallestDistinctWindow {
    public static int findSmallestDistinct(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int requiredChars = getUniqueCharacterCount(s);

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            while (charCount.size() == requiredChars) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }

                char leftChar = s.charAt(left);

                if (charCount.containsKey(leftChar)) {
                    charCount.put(leftChar, charCount.get(leftChar) - 1);
                    if (charCount.get(leftChar) == 0) {
                        charCount.remove(leftChar);
                    }
                }

                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    private static int getUniqueCharacterCount(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // System.out.println("size" + charCount.size());
        return charCount.size();
    }

    public static void main(String[] args) {
        String s = "AABBBCBBAC";
        System.out.println(findSmallestDistinct(s));
    }
}
