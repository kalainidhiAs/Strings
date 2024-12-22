package String;

public class StrStr {
    public static int strfound(String s, String x) {
        if (s.length() < x.length() || s.isEmpty() || x.isEmpty()) {
            return -1;
        }

        int n = s.length();
        // System.out.println(n);
        int m = x.length();
        // System.out.println(m);

        for (int i = 0; i <= n - m; i++) {
            String a = s.substring(i, i + m);
            if (x.equals(a)) {
                return i + 1;
            }
        }

        // System.out.println(result);
        return -1;
    }

    public static void main(String[] args) {
        String s = "kalain123idhi";
        String x = "123";
        int result = strfound(s, x);
        System.out.println(result);

        if (result != 1) {
            System.out.println("found" + result);
        } else {
            System.out.println("Not found");
        }
    }
}

/*
 * int strstr(String s, String x)
 * {
 * // Your code here
 * int n = s.length();
 * int m = x.length();
 * 
 * for(int i=0; i<=n-m; i++){
 * String a = s.substring(i,i+m);
 * if(x.equals(a)){
 * return i;
 * }
 * }
 * return -1;
 * }
 */