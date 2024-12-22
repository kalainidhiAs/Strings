package String;

public class IpAddress {
    public int isValid(String ip) {
        if (ip == null || ip.isEmpty())
            return 0;

        // Check if the last character is a dot
        if (ip.charAt(ip.length() - 1) == '.')
            return 0;

        String[] parts = ip.split("\\.");

        // Check if there are 4 parts
        if (parts.length != 4)
            return 0;

        // Check each part
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);

                // Check if the number is between 0 and 255
                if (num < 0 || num > 255)
                    return 0;

                // Check for leading zeroes
                if (part.length() > 1 && part.charAt(0) == '0')
                    return 0;
            } catch (NumberFormatException e) {
                return 0; // If part is not a number
            }
        }

        return 1; // If all checks pass, IPv4 address is valid
    }

    public static void main(String[] args) {
        IpAddress solution = new IpAddress();
        System.out.println(solution.isValid("172.16.254.1")); // Output: 1
        System.out.println(solution.isValid("172.16.254.01")); // Output: 0
        System.out.println(solution.isValid("256.256.256.256")); // Output: 0
        System.out.println(solution.isValid("172.16.254")); // Output: 0
        System.out.println(solution.isValid("0.0.0.0.")); // Output: 0
    }
}
