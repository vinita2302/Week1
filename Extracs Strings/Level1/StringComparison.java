import java.util.Scanner;

public class StringCompare {

    // Function to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        // If all characters are the same, compare lengths
        if (len1 == len2) {
            return 0; // Strings are equal
        } else if (len1 < len2) {
            return -1; // str1 is lexicographically smaller
        } else {
            return 1; // str1 is lexicographically larger
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the two strings
        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();

        // Compare the strings and display the result
        int result = compareStrings(str1, str2);
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("String 1 is lexicographically smaller than String 2.");
        } else {
            System.out.println("String 1 is lexicographically greater than String 2.");
        }
    }
}
