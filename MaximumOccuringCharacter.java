package String;

import java.util.HashMap;

public class MaximumOccuringCharacter {
    public static char getMaxOccuringChar(String line) {
        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = line.charAt(0);
        int maxCount = map.get(maxChar);

        for (char ch : map.keySet()) {
            int count = map.get(ch);
            if (count > maxCount || (count == maxCount) && ch < maxChar) {
                maxChar = ch;
                maxCount = count;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String s = "kalainidhi";
        System.out.println(getMaxOccuringChar(s));
    }
}
