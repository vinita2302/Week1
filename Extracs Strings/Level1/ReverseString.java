import java.util.Scanner;

public class ReverseString {

    public static String reverse(String text) {
        String reversed = "";  // Initialize an empty string
        for (int i = text.length() - 1; i >= 0; i--) {  // Start from the last character
            reversed += text.charAt(i);  // Append each character to reversed
        }
        return reversed;  // Return the reversed string
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Take string as input
        System.out.println("Enter the string:");
        String text = scanner.nextLine();

        // Call the reverse method
        String result = reverse(text);

        // Display the result
        System.out.println("The reversed string is: " + result);
    }
}
