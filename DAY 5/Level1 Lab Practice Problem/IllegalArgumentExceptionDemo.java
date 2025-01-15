import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException...");
        // Setting the start index greater than the end index for substring
        String result = text.substring(5, 2);  // This will throw an exception
        System.out.println("Substring: " + result);  // This line will not execute
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Handling IllegalArgumentException...");
            // Setting the start index greater than the end index for substring
            String result = text.substring(5, 2);  // This will throw an exception
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
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
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(input);
    }
}
