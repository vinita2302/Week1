import java.util.Scanner;

public class BMI_Calculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  
            double height = data[i][1] / 100;
            double bmi = weight / (height * height);  
            data[i][2] = bmi;  
        }
    }

    
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];  
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];  
            if (bmi <= 18.4) {
                status[i] = "underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height and BMI 
        double[][] data = new double[10][3];

        // Taking input for weight  and height 
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            data[i][0] = scanner.nextDouble();  

            System.out.print("Enter height (in cm): ");
            data[i][1] = scanner.nextDouble();  
        }

        calculateBMI(data);

       
        String[] status = determineBMIStatus(data);

        // Display the results
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %12.2f | %12.2f | %.2f | %s\n", (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        scanner.close();  // Close the scanner
    }
}
