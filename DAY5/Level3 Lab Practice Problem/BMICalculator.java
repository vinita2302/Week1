import java.util.Scanner;

public class BMICalculator {

    // Method to find BMI and status based on height and weight
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI using the formula
        double bmi = weight / (height * height);
        String status;

        // Determine the BMI status
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return the BMI, status, weight, and height in a 2D string array
        return new String[] {String.format("%.2f", bmi), status};
    }

    // Method to calculate BMI for each person and store the result
    public static String[][] calculateAndStoreBMI(double[][] data) {
        String[][] result = new String[10][4]; // 10 people, each with 4 columns (weight, height, BMI, status)

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            // Get BMI and status for each person
            String[] bmiStatus = calculateBMI(weight, height);

            // Store weight, height, BMI, and status in the result array
            result[i][0] = String.format("%.2f", weight); // Weight
            result[i][1] = String.format("%.2f", height); // Height in cm
            result[i][2] = bmiStatus[0]; // BMI
            result[i][3] = bmiStatus[1]; // Status
        }
        return result;
    }

    // Method to display the 2D string array in a tabular format
    public static void displayBMI(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // 10 people, each with 2 columns (weight, height)

        // Take user input for weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and store the result
        String[][] bmiData = calculateAndStoreBMI(data);

        // Display the BMI data in tabular format
        displayBMI(bmiData);
    }
}
