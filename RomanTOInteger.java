package String;

import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

public class RomanTOInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        // Set<Map.Entry<Character, Integer>> entrySet = romanNumerals.entrySet();
        // System.out.println(entrySet);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i + 1))) {
                total -= romanNumerals.get(s.charAt(i));
            } else {
                total += romanNumerals.get(s.charAt(i));
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "XXIVM";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + result);
    }
}
