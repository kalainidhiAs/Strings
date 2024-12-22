package String;

//import java.util.Arrays;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split(" ");

        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr.length);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                sb.append(arr[i]);
                // System.out.println(arr[i].length());
            }

            if (i > 0 && !arr[i].isEmpty() && i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "  hello world ";
        System.out.println(reverseWords(s));
    }
}
