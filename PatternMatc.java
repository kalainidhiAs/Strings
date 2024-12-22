package String;

import java.util.ArrayList;

//rabin-karp algo, kmp algo, native algorithm
public class PatternMatc {
    public static void isMatch(String txt, String pat) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == pat.charAt(0)) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int ind = list.get(i);
            int j = 0;
            while (j < pat.length()) {
                if (txt.charAt(ind) != pat.charAt(j)) {
                    break;
                } else {
                    ind++;
                    j++;
                }
            }

            if (j == pat.length() - 1) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");

        System.out.println(list);
    }

    public static void main(String[] args) {
        String txt = "abxabcabcaby";
        String pat = "abcaby";
        isMatch(txt, pat);
    }
}
