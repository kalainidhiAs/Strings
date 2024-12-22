package String;

public class MaxChar {
    public int maxChars(String s) {
        // code here
        int freq = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                int temp = s.lastIndexOf(s.charAt(i)) - s.indexOf(s.charAt(i)) - 1;
                if (temp > freq) {
                    freq = temp;
                }
            }
        }

        return freq != -1 ? freq : -1;
    }

    public static void main(String[] args) {
        String S = "socks";
        System.out.println(new MaxChar().maxChars(S));
    }
}
