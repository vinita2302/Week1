import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop to count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Determine the number of unique characters
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Loop to store characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);      // Store character
                result[index][1] = String.valueOf(frequency[i]);  // Store frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the character frequencies in a tabular format
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
