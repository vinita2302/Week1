import java.util.Random;

public class RandomNumberGenerator {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number between 1000 and 9999
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }

        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate the sum, min, and max values
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Return the results as an array [average, min, max]
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\n\nAverage: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}
