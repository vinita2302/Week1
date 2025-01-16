import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the relation: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to take user input
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }

    // Function to display the results
    public static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static void main(String[] args) {
        // Get input from the user
        int[] numbers = getInput();
        int num1 = numbers[0];
        int num2 = numbers[1];

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Display the results
        displayResult(num1, num2, gcd, lcm);
    }
}
