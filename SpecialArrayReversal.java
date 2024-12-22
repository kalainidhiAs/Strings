package String;

public class SpecialArrayReversal {
    public static void main(String[] args) {
        String str = "c&ab";

        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            if (!isalphabet(c[left])) {
                left++;
            } else if (!isalphabet(c[right])) {
                right--;
            } else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(c));
    }

    public static boolean isalphabet(char c) {
        return Character.isLetter(c);
    }
}
