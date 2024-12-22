package String;

public class Atoi {
    public static void main(String[] args) {
        String s = " -1231231231311133";
        // Your code here
        s = s.trim();
        if (s == null) {
            System.out.println(0);
            return;
        }

        int i = 0, res = 0, sign = 1;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            if (s.charAt(0) == '-') {
                sign = -1;
            }
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            if (res > (Integer.MAX_VALUE - s.charAt(i) - '0') / 10) {
                System.out.println(sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE);
                return;
            }
            res = res * 10 + s.charAt(i) - '0';
            System.out.println(res);
            i++;
        }

        System.out.println(sign * res);
    }
}
