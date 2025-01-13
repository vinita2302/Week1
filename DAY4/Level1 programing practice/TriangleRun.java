import java.util.Scanner;

class TriangleRun {

 
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter) {
        double distanceInMeters = 5000.0;  // 5 km = 5000 meters
        return (int) Math.ceil(distanceInMeters / perimeter);  
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Take input for the three sides 
        System.out.print("Enter the first side : ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side : ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side : ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds 
        int rounds = calculateRounds(perimeter);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        // Close the scanner
        scanner.close();
    }
}
