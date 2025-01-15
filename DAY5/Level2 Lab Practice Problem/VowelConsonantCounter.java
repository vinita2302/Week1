import java.util.Scanner;

public class VowelConsonantCounter {

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

    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
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

        // Check each character and count vowels and consonants
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            String result = checkCharacterType(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts in an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calling the method to count vowels and consonants
        int[] result = countVowelsAndConsonants(input);

        // Displaying the result
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        scanner.close();
    }
}
