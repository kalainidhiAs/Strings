package String;

public class decode {
    static int i = 0;

    public static String decodedString(String s) {
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && s.charAt(i) != ']') {
            System.out.println(i);
            if (Character.isDigit(s.charAt(i))) {
                int k = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    k = k * 10 + s.charAt(i) - '0';
                    i++;
                    // System.out.println(i);
                }
                i++; // Skip the '['
                String r = decodedString(s);
                while (k > 0) { // (k-->0) combination of the decrement operator -- and the greater-than
                                // operator >.
                    // System.out.println(i);
                    sb.append(r);
                    k--;
                }
                i++; // Skip the ']'
            } else {
                // System.out.println(i);
                sb.append(s.charAt(i++));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String encodedString = "3[b2[ca]]";
        String decodedString = decodedString(encodedString);
        System.out.println(decodedString);
    }
}
