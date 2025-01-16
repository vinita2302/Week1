import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character in a string
    public static String toggleCase(String text) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Convert to lowercase
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Convert to uppercase
            }
            // If it's neither, append as it is (for spaces, symbols, etc.)
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        // Call the method to toggle case and display the result
        String toggledText = toggleCase(text);
        System.out.println("Toggled case string: " + toggledText);
    }
}
 