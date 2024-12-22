package String;

public class checPanagram {
    public static boolean check(String str) {
        str = str.toLowerCase();
        boolean alphabet[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)) && Character.isLetter(str.charAt(i))) {
                int index = str.charAt(i) - 'a';

                // System.out.println(index);
                alphabet[index] = true;
            }
        }

        for (boolean occured : alphabet) {
            if (!occured) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(check(input));
    }
}
