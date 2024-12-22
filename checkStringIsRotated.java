package String;

public class checkStringIsRotated {
    public static boolean rotate(String s, String a, int k) {
        if (s.length() != a.length()) {
            return false; // Strings must have the same length to be rotated into each other.
        }

        int index = s.length() - k;
        System.out.println(index);

        for (int i = 0; i < s.length(); i++) {
            if (a.charAt(i) != s.charAt(index)) {
                return false;
            }

            index = (index + 1) % s.length();
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "kalainidhi";
        String a = "dhikalaini";
        int k = 3;

        boolean result = rotate(s, a, k);

        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
