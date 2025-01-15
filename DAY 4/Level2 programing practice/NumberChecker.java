import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static String isPositive(int num) {
        if (num >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Array to hold the 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and perform checks
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            // Check if the number is positive or negative
            String positivity = isPositive(num);
            System.out.print("Number " + num + " is " + positivity);

            // If the number is positive, check if it's even or odd
            if (positivity.equals("positive")) {
                String evenOdd = isEven(num);
                System.out.println(" and it is " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compare(first, last);

        if (comparisonResult == 1) {
            System.out.println("First number (" + first + ") is greater than the last number (" + last + ").");
        } else if (comparisonResult == 0) {
            System.out.println("First number (" + first + ") is equal to the last number (" + last + ").");
        } else {
            System.out.println("First number (" + first + ") is less than the last number (" + last + ").");
        }

        scanner.close(); // Close the scanner
    }
}
