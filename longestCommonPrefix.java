package String;

/**
 * longestCommonPrefix
 */
public class longestCommonPrefix {
    static String longComPre(String arr[], int n) {
        // code here

        if (arr.length == 1) {
            return arr[0];
        }

        for (int curIndex = 0; curIndex < arr[0].length(); curIndex++) {
            char c = arr[0].charAt(curIndex);
            for (int i = 1; i < arr.length; i++) {
                // System.out.println(arr.length);
                // System.out.println(curIndex);
                if (curIndex >= arr[i].length() || arr[i].charAt(curIndex) != c) {

                    return curIndex == 0 ? "-1" : arr[0].substring(0, curIndex);
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int N = 4;
        String arr[] = { "flplk", "floter", "flolpki" };
        System.out.println(longComPre(arr, N));
    }
}
