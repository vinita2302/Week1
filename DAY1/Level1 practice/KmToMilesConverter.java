import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //  enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();

        // Convert kilometers to miles 
        double miles = km / 1.6;

        // print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close the scanner
        scanner.close();
    }
}
