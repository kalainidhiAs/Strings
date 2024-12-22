package String;

public class BracketBalancingMinSwap {
    public static int swapCount(String str) {
        char s[] = str.toCharArray();

        int leftcount = 0, rightcount = 0;
        int swap = 0, imbalance = 0;

        for (int i = 0; i < str.length(); i++) {
            if (s[i] == '[') {
                leftcount++;
                if (imbalance > 0) {
                    swap += imbalance;
                    imbalance--;
                }
            } else if (s[i] == ']') {
                rightcount++;
                imbalance = rightcount - leftcount;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        String str = "[[][]]";
        System.out.println(swapCount(str));
    }
}