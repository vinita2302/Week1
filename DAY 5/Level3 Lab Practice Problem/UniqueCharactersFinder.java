import java.util.Scanner;

public class UniqueCharactersFinder {

    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // charAt() will throw an exception when count exceeds length
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, count holds the length
        }
        return count;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is unique by comparing with previous characters
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters in the string
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the result
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}
