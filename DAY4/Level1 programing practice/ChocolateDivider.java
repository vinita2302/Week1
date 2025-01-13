import java.util.Scanner;

public class ChocolateDivider {
    
    // Method to find quotient (chocolates each child gets) and remainder (remaining chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder
        result[0] = number / divisor;  // Quotient: chocolates each child gets
        result[1] = number % divisor;  // Remainder: remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get the number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        // Call the method and store the result
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output the result
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
        
        scanner.close();
    }
}
