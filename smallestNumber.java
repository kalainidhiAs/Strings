package String;

public class smallestNumber {
    public static String findSmall(String num) {
        // Convert the string to a char array for easy manipulation
        char[] numArr = num.toCharArray();
        int n = numArr.length;

        int i = 0;
        // Find the first occurrence where num[i] > num[i + 1]
        while (i < n - 1 && numArr[i] <= numArr[i + 1]) {
            i++;
        }

        // If i is less than n - 1, swap numArr[i] and numArr[i + 1]
        if (i < n - 1) {
            char temp = numArr[i];
            numArr[i] = numArr[i + 1];
            numArr[i + 1] = temp;
        }

        // Convert the char array back to a string and return it
        return new String(numArr);
    }

    public static void main(String[] args) {
        String num1 = "4625635";
        System.out.println(findSmall(num1)); // Expected: 1625635

        String num2 = "100";
        System.out.println(findSmall(num2)); // Expected: 100

        String num3 = "54321";
        System.out.println(findSmall(num3)); // Expected: 14325

        String num4 = "123456";
        System.out.println(findSmall(num4)); // Expected: 123456

        String num5 = "101";
        System.out.println(findSmall(num5)); // Expected: 011
    }
}
