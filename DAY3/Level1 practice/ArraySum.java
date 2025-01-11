import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array of 10 elements and initialize total to 0.0
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (input <= 0) {
                break;
            }

            // Check if the array limit is reached
            if (index == 10) {
                break;
            }

            // Store the input in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Loop to calculate the total of all numbers entered
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all the numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum of all numbers: " + total);

        scanner.close();
    }
}
