package String;

import java.util.ArrayList;
import java.util.List;

public class NoOfWords {

    public static void main(String[] args) {
        String s = "36671106";
        List<String> result = new ArrayList<>();
        generateWords(s, 0, new StringBuilder(), result);
        System.out.println(result);
    }

    public static void generateWords(String s, int index, StringBuilder current, List<String> result) {
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }

        for (int len = 1; len <= 2 && index + len <= s.length(); len++) {
            String subString = s.substring(index, index + len);
            int n = Integer.parseInt(subString);
            if (n >= 1 && n <= 26) {
                current.append((char) ('A' + n - 1));
                generateWords(s, index + len, current, result);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}
