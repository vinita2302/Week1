import java.util.Scanner;

public class AthleteRoundsCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Input the three sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Convert the total distance 
        double totalDistance = 5000;
        
        // Calculate the number of rounds 
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        
        // result
        System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km.%n", rounds);
        
        // Close the scanner
        scanner.close();
    }
}
