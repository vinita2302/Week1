import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Access an index larger than the array length to trigger the exception
        System.out.println("Accessing index 5: " + names[5]);  // This will throw an exception
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Handling ArrayIndexOutOfBoundsException...");
            // Attempt to access an index larger than the array length
            System.out.println("Accessing index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of names and take input from the user
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        // Call the method to generate the exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names);
    }
}
