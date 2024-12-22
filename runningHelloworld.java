package String;

public class runningHelloworl {
    public static void alphabet(String s) {
        int l = 97;
        int j = 0;
        for (int i = l; i <= 122; i++) {
            int limit = (int) s.charAt(j);
            while (i < limit) {
                System.out.print((char) i);
                i++;
            }
            System.out.println();
            j++;
            l = 97;
        }
    }

    public static void main(String[] args) {
        String s = "helloworld";
        alphabet(s);
    }
}
