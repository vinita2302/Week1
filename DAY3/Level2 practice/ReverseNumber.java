import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;  // Remove the last digit
            count++;  // Increment count
        }
        
        // Create an array to store the digits
        int[] digits = new int[count];
        
        // Store the digits of the number in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;  // Get the last digit
            temp /= 10;  // Remove the last digit
        }
        
        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[count];
        
        // Store digits in reversed order
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];  // Reverse the order
        }
        
        // Display the reversed array
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
