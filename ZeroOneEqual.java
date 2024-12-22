package String;

public class ZeroOneEqual {
    public static int MaxSubStr(String s) {
        int n = s.length();

        int count = 0;
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else if (s.charAt(i) == '1') {
                one++;
            }

            if (zero == one) {
                count++;
            }
        }

        if (zero != one) {
            return -1;

        }
        return count;
    }

    public static void main(String[] args) {
        String s = "001110010";
        System.out.println(MaxSubStr(s));
    }
}
