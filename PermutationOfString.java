package String;

import java.util.TreeSet;

public class PermutationOfString {
    public static void permutation(char s[], int left, int right, TreeSet<String> result) {
        if (left == right) {
            result.add(new String(s));
        } else {
            for (int i = left; i <= right; i++) {
                swap(s, left, i);
                permutation(s, left + 1, right, result);
                swap(s, left, i); // back track
            }
        }
    }

    public static void swap(char s[], int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
        TreeSet<String> result = new TreeSet<>();
        permutation(str.toCharArray(), 0, str.length() - 1, result);
        // Print the result
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }
}
/*
 * class Solution {
 * public List<String> find_permutation(String S) {
 * // Code here
 * TreeSet<String> result = new TreeSet<>();
 * char s[] = S.toCharArray();
 * permutation(s,0,s.length-1,result);
 * return new ArrayList(result);
 * }
 * 
 * public void permutation(char s[], int left, int right, TreeSet<String>
 * result){
 * if(left == right){
 * result.add(new String(s));
 * 
 * }else{
 * for(int i=left; i<=right; i++){
 * swap(s,left,i);
 * permutation(s,left+1,right,result);
 * swap(s,left,i);
 * }
 * }
 * }
 * 
 * public void swap(char s[], int left, int right){
 * char temp = s[left];
 * s[left] = s[right];
 * s[right] = temp;
 * }
 * }
 */