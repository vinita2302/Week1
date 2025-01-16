import java.util.Scanner;

public class TextToUppercaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String convertToUppercase(String text) {
        StringBuilder upperText = new StringBuilder();
        
        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is lowercase (ASCII values between 'a' and 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from the ASCII value
                ch = (char) (ch - 32);
            }
            upperText.append(ch);  // Append the character (converted or not)
        }
        
        return upperText.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // Compare both strings character by character
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

        // Take user input
        System.out.print("Enter some text: ");
        String inputText = scanner.nextLine();

        // Convert the input text to uppercase using charAt() method
        String convertedText = convertToUppercase(inputText);
        // Convert the input text to uppercase using the built-in toUpperCase() method
        String builtInUppercaseText = inputText.toUpperCase();

        // Compare both uppercase results using the user-defined method
        boolean isEqual = compareStrings(convertedText, builtInUppercaseText);

        // Display the results
        System.out.println("Converted text (charAt method): " + convertedText);
        System.out.println("Converted text (toUpperCase method): " + builtInUppercaseText);
        System.out.println("Do both converted texts match? " + (isEqual ? "Yes" : "No"));
    }
}
