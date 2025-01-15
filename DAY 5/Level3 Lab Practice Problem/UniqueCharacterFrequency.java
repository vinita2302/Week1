import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int n = text.length();
        char[] uniqueChars = new char[n];
        int uniqueCount = 0;

        // Outer loop to check each character
        for (int i = 0; i < n; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character is already in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int n = uniqueChars.length;
        int[] frequency = new int[n];

        // Loop to count the frequency of each unique character
        for (int i = 0; i < n; i++) {
            char currentChar = uniqueChars[i];
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency[i]++;
                }
            }
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);      // Store character
            result[i][1] = String.valueOf(frequency[i]);        // Store frequency
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] charFrequency) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] entry : charFrequency) {
            System.out.printf("    %s     |     %s\n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call method to find character frequency
        String[][] result = findCharFrequency(text);

        // Display the result
        displayResult(result);

        scanner.close();
    }
}
 