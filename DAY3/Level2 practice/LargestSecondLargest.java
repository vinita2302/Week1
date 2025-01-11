import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define array to store digits with size 10 (maxDigit)
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Index to reflect the array index
        int index = 0;
        
        // Loop until number is 0 or index reaches maxDigit
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Store the last digit of the number
            number /= 10; // Remove the last digit
            index++; // Increment index
        }
        
        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;
        
        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }
        
        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        // Close the scanner
        scanner.close();
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class LargestSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define array to store digits with initial size 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Index to reflect the array index
        int index = 0;
        
        // Loop until number is 0
        while (number != 0) {
            // If the array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit += 10;  // Increase the maxDigit by 10
                int[] temp = new int[maxDigit];  // Create a new temp array with increased size
                System.arraycopy(digits, 0, temp, 0, digits.length);  // Copy digits to the new temp array
                digits = temp;  // Assign the temp array to digits
            }
            
            digits[index] = number % 10;  // Store the last digit of the number
            number /= 10;  // Remove the last digit
            index++;  // Increment index
        }
        
        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;
        
        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];  // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest
            }
        }
        
        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        // Close the scanner
        scanner.close();
    }
}
