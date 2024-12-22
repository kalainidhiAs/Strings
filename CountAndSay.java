package String;

public class CountAndSay {

    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }

        String result = "1";

        for (int i = 1; i < n; i++) {
            // System.out.println("result " + result);
            result = generateNext(result);
        }

        return result;
    }

    private static String generateNext(String s) {
        StringBuilder next = new StringBuilder();
        int count = 1;

        System.out.println("lengtht : " + s.length());
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                // If the current character is the same as the next one, increment count
                // System.out.println("if: ");
                count++;
            } else {
                System.out.println("else");
                // If the current character is different from the next one, append count and
                // character to result
                next.append(count).append(s.charAt(i));
                System.out.println(next);
                count = 1; // Reset count for the new character
            }
        }

        return next.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        String result = countAndSay(n);
        System.out.println("Count and Say sequence at position " + n + ": " + result);
    }
}