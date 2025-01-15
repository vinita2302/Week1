import java.util.Scanner;

public class VowelConsonantChecker2 {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase using ASCII values
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If it's not a letter
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findCharacterTypes(String str) {
        int length = 0;

        // Find the length of the string without using the built-in length() method
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string
        }

        // Create a 2D array to store characters and their types
        String[][] result = new String[length][2];

        // Check each character and store its type in the 2D array
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);        // Store the character
            result[i][1] = checkCharacterType(ch);    // Store its type (Vowel, Consonant, or Not a Letter)
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-15s%n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calling the method to find character types
        String[][] result = findCharacterTypes(input);

        // Displaying the result in a tabular format
        displayResult(result);

        scanner.close();
    }
}
