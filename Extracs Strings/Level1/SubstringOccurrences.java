import java.util.Scanner;

public class SubstringOccurrences {

    // Function to count occurrences of a substring in a string
    public static int countSubstring(String str, String subStr) {
        int count = 0;
        int strLength = str.length();
        int subStrLength = subStr.length();

        // Loop through the string to find the substring
        for (int i = 0; i <= strLength - subStrLength; i++) {
            int j;
            // Check if substring matches at current position
            for (j = 0; j < subStrLength; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }
            if (j == subStrLength) { // If inner loop completes, substring found
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the main string and substring
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String subStr = scanner.nextLine();

        // Call the function and display the result
        int occurrences = countSubstring(str, subStr);
        System.out.println("The substring \"" + subStr + "\" occurs " + occurrences + " times in the string.");
    }
}
