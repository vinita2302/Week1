import java.util.Scanner;

class SmallestAndLargest {

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Initialize the smallest and largest variables
        int smallest = number1;
        int largest = number1;

        // Compare the numbers to find the smallest and largest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return the result in an array: [smallest, largest]
        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for the three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
