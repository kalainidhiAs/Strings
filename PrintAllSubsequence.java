package String;

import java.util.ArrayList;

public class PrintAllSubsequence {
    static ArrayList<String> list = new ArrayList<>();
    static int i = 0;

    public static void GenerateSubsequecne(String str, String ans) {
        if (str.length() == 0) {
            list.add(ans);
            // System.out.println(list);
            return;
        }

        // System.out.println(i++);
        GenerateSubsequecne(str.substring(1), ans + str.charAt(0));
        // System.out.println(i++);
        GenerateSubsequecne(str.substring(1), ans);

    }

    public static void main(String[] args) {
        String str = "abcd";
        GenerateSubsequecne(str, "");
        System.out.println(list);
    }
}
