import java.util.Scanner;

public class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Define an initial array to store digits
        int maxDigit = 10;        // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;            // To keep track of the number of digits added

        // Step 3: Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Step 4: Increase the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                // Copy elements from the current digits array to the temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;  // Assign the temp array to digits
            }

            digits[index] = number % 10;  // Get the last digit
            number /= 10;                 // Remove the last digit from number
            index++;                      // Increment index
        }

        // Step 5: Find the largest and second largest digits
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 6: Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
