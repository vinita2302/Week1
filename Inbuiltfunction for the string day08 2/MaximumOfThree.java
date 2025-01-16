import java.util.Scanner;

public class MaximumOfThree {

    // Function to take three integer inputs from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        numbers[2] = scanner.nextInt();
        
        return numbers;
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;  // Assume 'a' is the maximum
        if (b > max) {
            max = b;  // Update max if 'b' is greater
        }
        if (c > max) {
            max = c;  // Update max if 'c' is greater
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = takeInput();  // Get the numbers from the user
        
        // Find the maximum value
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        
        // Output the maximum value
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
