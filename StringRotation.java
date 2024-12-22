package String;

public class StringRotation {
    public static String rotate(String s, int k) {
        char[] ns = new char[s.length()];
        for (int i = 0; i < ns.length; i++) {
            int rotateIndex = (i + k) % s.length();
            ns[i] = s.charAt(rotateIndex);
        }

        return new String(ns);
    }

    public static void main(String[] args) {
        String s = "kalainidhi";
        int k = 5;
        String result = rotate(s, k);
        System.out.print(result);

    }
}
