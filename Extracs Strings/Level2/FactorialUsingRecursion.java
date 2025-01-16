import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursive function to calculate the factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    // Function to take input from the user
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Function to display the result
    public static void displayResult(int num, long result) {
        System.out.println("The factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        // Get input from user
        int number = getInput();

        // Calculate factorial using recursion
        long result = factorial(number);

        // Display the result
        displayResult(number, result);
    }
}
