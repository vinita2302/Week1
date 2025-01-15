import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        // Accessing an index beyond the string length
        char ch = text.charAt(text.length() + 1);  // This will throw an exception
        System.out.println("Character at index beyond length: " + ch);  // This line will not execute
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Handling StringIndexOutOfBoundsException...");
            char ch = text.charAt(text.length() + 1);  // Attempt to access an invalid index
            System.out.println("Character at index beyond length: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(input);
    }
}
