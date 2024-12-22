package String;

public class FirstNonRepeating {

    static public String findAndReplaceRepeating(String inputString) {
        int n = inputString.length();
        StringBuilder string = new StringBuilder(inputString);

        char ch = inputString.charAt(0);
        char nonRepeat = '0';

        for (int i = 0; i < n; i++) {
            if (ch == string.charAt(i + 1) && nonRepeat == '0') {
                string.setCharAt(i, '#');
            } else if (ch != string.charAt(i + 1) && nonRepeat == '0') {
                nonRepeat = string.charAt(i);
                string.setCharAt(0, nonRepeat);
            } else {
                string.setCharAt(i, nonRepeat);
            }
        }

        return string.toString();
    }

    public static void main(String[] args) {
        String inputString = "avbsddhsbbsnn";
        System.out.println(findAndReplaceRepeating(inputString));
    }
}
