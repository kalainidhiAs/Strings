package String;

public class RestrictiveCandyCrush {
    public static String reduced_String(int k, String s) {
        // Your code goes here
        StringBuilder sb = new StringBuilder(s);

        boolean flag = true;
        while (flag) {
            flag = false;
            int count = 1;
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) == sb.charAt(i - 1)) {
                    count++;
                    if (count == k) {
                        sb.delete(i - k + 1, i + 1);
                        i = i - k + 1;
                        count = 1;
                        flag = true;
                    } else {
                        count = 1;
                    }
                }
            }

            if (!flag) {
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int k = 2;
        String s = "geeksforgeeks";
        System.out.println(reduced_String(k, s));

        k = 2;
        s = "geegsforgeeeks";
        System.out.println(reduced_String(k, s));
    }
}

/*
 * Stack<Character> st1=new Stack<>();
 * Stack<Integer> st2=new Stack<>();
 * for(int i=0;i<s.length();i++){
 * char ch=s.charAt(i);
 * if(!st1.isEmpty() && st1.peek()==ch){
 * st1.push(ch);
 * st2.push(st2.peek()+1);
 * }
 * else{
 * st1.push(ch);
 * st2.push(1);
 * }
 * if(st2.peek()==k){
 * int a=k;
 * while(a!=0){
 * st1.pop();
 * st2.pop();
 * a--;
 * }
 * }
 * }
 * StringBuilder ans=new StringBuilder();
 * for(char ch:st1){
 * ans.append(ch);
 * }
 * return ans.toString();
 */