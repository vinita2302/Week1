import java.util.Scanner;

public class StringTrimmer {

    // Method to find the start and end points with no spaces
    public static int[] findStartAndEnd(String str) {
        int length = 0;

        // Find the length of the string without using length() method
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string
        }

        int start = 0;
        int end = length - 1;

        // Find the index of the first non-space character
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }

        // Find the index of the last non-space character
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // Return start and end+1 as end index is exclusive
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        int len1 = 0, len2 = 0;

        // Find lengths of both strings without using length() method
        try {
            while (true) {
                str1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {
        }

        try {
            while (true) {
                str2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {
        }

        // If lengths are not equal, return false
        if (len1 != len2) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Call method to find start and end points
        int[] startEnd = findStartAndEnd(input);

        // Call method to create substring
        String trimmedByMethod = createSubstring(input, startEnd[0], startEnd[1]);

        // Use built-in trim() method
        String trimmedByBuiltIn = input.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedByMethod, trimmedByBuiltIn);

        // Display the result
        System.out.println("Trimmed by user-defined method: \"" + trimmedByMethod + "\"");
        System.out.println("Trimmed by built-in method:    \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
