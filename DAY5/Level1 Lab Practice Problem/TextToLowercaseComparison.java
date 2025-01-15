import java.util.Scanner;

public class TextToLowercaseComparison {

    // Method to convert text to lowercase using charAt()
    public static String convertToLowercase(String text) {
        StringBuilder lowerText = new StringBuilder();
        
        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is uppercase (ASCII values between 'A' and 'Z')
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32 to the ASCII value
                ch = (char) (ch + 32);
            }
            lowerText.append(ch);  // Append the character (converted or not)
        }
        
        return lowerText.toString();
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

        // Convert the input text to lowercase using charAt() method
        String convertedText = convertToLowercase(inputText);
        // Convert the input text to lowercase using the built-in toLowerCase() method
        String builtInLowercaseText = inputText.toLowerCase();

        // Compare both lowercase results using the user-defined method
        boolean isEqual = compareStrings(convertedText, builtInLowercaseText);

        // Display the results
        System.out.println("Converted text (charAt method): " + convertedText);
        System.out.println("Converted text (toLowerCase method): " + builtInLowercaseText);
        System.out.println("Do both converted texts match? " + (isEqual ? "Yes" : "No"));
    }
}
