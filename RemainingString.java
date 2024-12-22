package String;

public class RemainingString {
    public static String printString(String s, char ch, int count) {
        // code here
        int cnt = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                cnt++;
                if (cnt == count) {
                    index = i;
                    break;
                }
            }

        }

        if (count != cnt) {
            index = s.length();
        }

        return index != s.length() ? s.substring(index + 1, s.length()) : "";
    }

    public static void main(String[] args) {
        String s = "axdt";
        char ch = 's';
        int count = 2;
        System.out.println(printString(s, ch, count));
    }
}
