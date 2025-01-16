import java.util.Scanner;

public class BasicCalculator {

    // Function to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to perform division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }

    // Function to display the result
    public static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two numbers as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display menu for operations
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        // Display the result
        displayResult(result);

        scanner.close();
    }
}
