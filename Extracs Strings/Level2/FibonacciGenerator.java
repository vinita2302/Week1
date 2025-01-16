import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1; // Initial two terms of Fibonacci sequence
        System.out.print("Fibonacci sequence: " + first);

        if (terms > 1) {
            System.out.print(", " + second);
        }

        for (int i = 3; i <= terms; i++) { // Loop starts from the 3rd term
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println(); // Move to the next line after printing sequence
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number of terms as input
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        // Call the function to generate Fibonacci sequence
        generateFibonacci(terms);

        scanner.close();
    }
}
