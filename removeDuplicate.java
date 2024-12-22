package String;

import java.util.Stack;

public class removeDuplicate {
    public static String remove(String s) {
        int count[] = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        // System.out.println(Arrays.toString(count));

        boolean visited[] = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            count[ch - 'a']--;

            if (visited[ch - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > ch && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "cbacdcbc"; // acdb
        System.out.println(remove(s));
    }
}
