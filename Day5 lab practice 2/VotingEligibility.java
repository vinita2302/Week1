import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Random age between 10 and 99
        }

        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age); // Store age as string

            // Check for valid age and voting eligibility
            if (age >= 18) {
                result[i][1] = "True"; // Can vote
            } else {
                result[i][1] = "False"; // Cannot vote
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote");
        System.out.println("----------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-15s%n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(numStudents);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display the result in tabular format
        displayResult(result);

        scanner.close();
    }
}
