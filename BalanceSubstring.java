package String;

public class BalanceSubstring {
    public static int isbalance(String s) {
        int zerocount = 0;
        int onecount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zerocount++;
            } else {
                onecount++;
            }

            if (onecount == zerocount) {
                count++;
            }
        }

        if (zerocount != onecount) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "0100110101"; // 01 0011 01 01
        System.out.println(isbalance(s));
    }
}
