package String;

import java.util.Arrays;

public class LargestNumber {
    static String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        System.out.println(Arrays.toString(arr));
        return arr[0].equals("0") ? "0" : String.join("", arr);
    }

    public static void main(String[] args) {
        String[] arr = { "6", "78", "1", "23", "900" };
        System.out.println(printLargest(arr));
    }
}
/*
 * import java.util.Arrays;
 * import java.util.Comparator;
 * 
 * class Solution {
 * public String largestNumber(String[] arr) {
 * // Custom comparator to sort strings
 * Comparator<String> comp = new Comparator<String>() {
 * public int compare(String a, String b) {
 * String order1 = a + b;
 * String order2 = b + a;
 * return order2.compareTo(order1); // Compare in descending order
 * }
 * };
 * 
 * // Sort the array using the custom comparator
 * Arrays.sort(arr, comp);
 * 
 * // Handle the case where all elements are "0"
 * if (arr[0].equals("0")) {
 * return "0";
 * }
 * 
 * // Concatenate the sorted strings to form the largest number
 * StringBuilder sb = new StringBuilder();
 * for (String s : arr) {
 * sb.append(s);
 * }
 * 
 * return sb.toString();
 * }
 * }
 */

/*
 * Integer[] numbers = new Integer[nums.length];
 * for (int i = 0; i < nums.length; i++) {
 * numbers[i] = Integer.parseInt(nums[i]);
 * }
 * 
 * // Custom comparator to compare integers as strings
 * Comparator<Integer> comparator = (a, b) -> {
 * String order1 = a + "" + b;
 * String order2 = b + "" + a;
 * System.out.println(order1);
 * System.out.println(order2);
 * return order2.compareTo(order1);
 * };
 * 
 * // Sort the array of Integers
 * Arrays.sort(numbers, comparator);
 * 
 * // Handle the case where all elements are "0"
 * if (numbers[0] == 0) {
 * return "0";
 * }
 * 
 * // Build the result string
 * StringBuilder sb = new StringBuilder();
 * for (Integer num : numbers) {
 * sb.append(num);
 * }
 * 
 * return sb.toString();
 */
