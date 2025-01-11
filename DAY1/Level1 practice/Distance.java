import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the distance: ");
        double distance = scanner.nextDouble();

       
        double distanceInYards = distance / 3;

    
        double distanceInMiles = distance / (3 * 1760);

        //  results
        System.out.println("The distance of " + distance + " feet is " + distanceInYards + " yards and " + distanceInMiles + " miles.");

        // Close the scanner
        scanner.close();
    }
}
