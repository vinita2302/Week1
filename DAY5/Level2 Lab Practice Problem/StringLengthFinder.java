import java.util.Scanner;

public class StringLengthFinder {

    ///method to find the length without using the built-in functuion
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;           
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index goes out of bounds, meaning we've reached the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Calling the user-defined method
        int customLength = findLength(input);
        
        // Using built-in length() method for comparison
        int builtInLength = input.length();

        // Displaying the results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);

        scanner.close();
    }
}
