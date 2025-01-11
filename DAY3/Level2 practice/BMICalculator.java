import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Loop through each person to take input and calculate BMI
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            // Input weight and height for the person
            System.out.print("Enter weight in kilograms (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height in centimeters (cm): ");
            heights[i] = scanner.nextDouble();

            // Convert height from cm to meters
            double heightInMeters = heights[i] / 100;

            // Calculate BMI: BMI = weight / (height * height)
            bmis[i] = weights[i] / (heightInMeters * heightInMeters);

            // Determine weight status based on BMI
            if (bmis[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\nDetails of Persons:");
        System.out.println("--------------------------------------------------");
        System.out.println("Person No.\tWeight (kg)\tHeight (cm)\tBMI\t\tWeight Status");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1), weights[i], heights[i], bmis[i], weightStatus[i]);
        }

        scanner.close();
    }
}
