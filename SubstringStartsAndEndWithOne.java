package String;

import java.util.Scanner;

public class SubstringStartsAndEndWithOne {
    public static void countSubstringsStartEndWith1(String s) {
        int onecount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onecount++;
            }
        }

        count = (onecount * (onecount - 1)) / 2;
        System.out.println("Substrings Start and End With 1 = " + count);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j - 1) == '1') {
                        System.out.println(s.substring(i, j + 1));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        countSubstringsStartEndWith1(s);

        in.close();
    }
}
