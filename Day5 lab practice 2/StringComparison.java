import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // If lengths are different, strings cannot be equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Compare using the custom method
        boolean customComparisonResult = compareStrings(str1, str2);

        // Compare using the built-in equals() method
        boolean builtInComparisonResult = str1.equals(str2);

        // Display the results
        System.out.println("\nCustom comparison result: " + customComparisonResult);
        System.out.println("Built-in equals() method result: " + builtInComparisonResult);

        // Check if both methods give the same result
        if (customComparisonResult == builtInComparisonResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
    }
}
