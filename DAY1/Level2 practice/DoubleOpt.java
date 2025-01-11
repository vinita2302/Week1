import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for a, b, and c
        System.out.print("Enter fee (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter discount (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter percent (c): ");
        double c = scanner.nextDouble();

        // Perform the double operations
        double result1 = a + b * c;  // a + (b * c)
        double result2 = a * b + c;  // (a * b) + c
        double result3 = c + a / b;  // c + (a / b)
        double result4 = a % b + c;  // (a % b) + c

        // Print the results
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close the scanner
        scanner.close();
    }
}