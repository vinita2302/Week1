import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException...");
        // Attempt to convert the input string to an integer
        int number = Integer.parseInt(text);  // This will throw an exception if the text is not a valid number
        System.out.println("Parsed number: " + number);  // This line will not execute if an exception occurs
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Handling NumberFormatException...");
            // Attempt to convert the input string to an integer
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number (or non-numeric text to cause an exception): ");
        String input = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(input);
    }
}
