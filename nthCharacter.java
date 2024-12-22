package String;

public class nthCharacter {
    public static void main(String[] args) {
        String s = "01010";
        int n = 1;
        int r = 2;

        char result = findNthCharacter(s, n, r);
        System.out.println(result);
    }

    public static char findNthCharacter(String s, int n, int r) {
        for (int i = 0; i < r; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    sb.append("01");
                } else {
                    sb.append("10");
                }

                if (sb.length() > n) {
                    break;
                }
            }
            s = sb.toString();
        }

        return s.charAt(n);
    }
}
