package String;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeating {
    static String secFrequent(String arr[], int N) {
        // your code here
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        String firstMaxKey = "";
        int firstMaxValue = 0;
        String secondMaxKey = "";
        int secondMaxValue = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > firstMaxValue) {
                secondMaxValue = firstMaxValue;
                secondMaxKey = firstMaxKey;

                firstMaxValue = entry.getValue();
                firstMaxKey = entry.getKey();
            } else if (entry.getValue() > secondMaxValue && !entry.getKey().equals(firstMaxKey)) {
                secondMaxValue = entry.getValue();
                secondMaxKey = entry.getKey();
            }
        }
        return secondMaxKey;
    }

    public static void main(String[] args) {
        String[] arr = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
        int N = arr.length;

        System.out.println(secFrequent(arr, N));
    }
}