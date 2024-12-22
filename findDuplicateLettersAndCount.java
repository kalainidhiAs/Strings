package String;

import java.util.HashMap;
import java.util.Map;

public class findDuplicateLettersAndCount {
    public static void duplicate(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
                // System.out.println(count);
            } else {
                count.put(s.charAt(i), 1);
                // System.out.println(count);
            }
        }

        for (Map.Entry<Character, Integer> mapElement : count.entrySet()) {
            if (mapElement.getValue() > 1) {
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "kalainidhi";
        duplicate(s);
    }
}

/*
 * int len = str.length();
 * 
 * // Sorting the string
 * char[] chars = str.toCharArray();
 * Arrays.sort(chars);
 * String sortedStr = new String(chars);
 * 
 * // Loop through the sorted string to find duplicates
 * for (int i = 0; i < len; i++) {
 * int count = 1;
 * 
 * // Counting the occurrences of each character
 * while (i < len - 1
 * && sortedStr.charAt(i)
 * == sortedStr.charAt(i + 1)) {
 * count++;
 * i++;
 * }
 * 
 * // Printing the duplicate character and its
 * // count
 * if (count > 1) {
 * System.out.println(sortedStr.charAt(i)
 * + ", count = " + count);
 * }
 * }
 */