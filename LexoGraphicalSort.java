package String;

import java.util.*;

public class LexoGraphicalSort {
    public static void main(String[] args) {
        String[] words = { "banana", "apple", "orange", "kiwi" };

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {

                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(words));
    }
}
