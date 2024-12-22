package String;

public class Encode {
    public static String encode(String str) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        sb.append(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count);
                c = str.charAt(i + 1);
                System.out.println(c);
                sb.append(c);
                count = 1;
            }
        }
        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ttttllllllssssslhhhh";
        System.out.println(encode(s));
    }
}
