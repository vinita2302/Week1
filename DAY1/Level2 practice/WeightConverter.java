import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the weight: ");
        double weightInPounds = scanner.nextDouble();
        
        // Convert pounds to kilograms 
        double weightInKg = weightInPounds / 2.2;
        
        //  results
        System.out.printf("The weight of the person in pounds is "+ 
                          weightInPounds +" and in kg is " +  weightInKg);
        
        // Close the scanner
        scanner.close();
    }
}



