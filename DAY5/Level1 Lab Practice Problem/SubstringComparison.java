import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string, start index, and end index
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Create substring using charAt() method
        String customSubstring = createSubstring(input, start, end);

        // Create substring using built-in substring() method
        String builtInSubstring = input.substring(start, end);

        // Compare the two substrings
        boolean comparisonResult = compareStrings(customSubstring, builtInSubstring);

        // Display the results
        System.out.println("\nSubstring using custom method: " + customSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + comparisonResult);
    }
}
 