package String;

public class MinMovesToMakePalindrome {
    public int minMovesToMakePalindrome(String s) {
        int count = 0;
        char[] chs = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            int end = j;
            if (chs[i] == chs[j]) {
                i++;
                j--;
            } else {
                while (chs[i] != chs[end]) {
                    end--;
                }

                if (i == end) {
                    swap(chs, end, end + 1);
                    count++;
                } else {
                    while (end < j) {
                        swap(chs, end, end + 1);
                        count++;
                        end++;
                    }
                }
            }
        }

        return count;
    }

    public static void swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }

    public static void main(String[] args) {
        String s = "letelt";
        System.out.println(new MinMovesToMakePalindrome().minMovesToMakePalindrome(s));
    }
}
