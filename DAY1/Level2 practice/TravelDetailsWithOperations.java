import java.util.Scanner;

public class TravelDetailsWithOperations  {
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the city via which you are traveling: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter the final destination city: ");
        String toCity = scanner.nextLine();
        
        // Input distances in miles
        System.out.print("Enter the distance from starting city to via city (in miles): ");
        int fromToVia = scanner.nextInt();
        
        System.out.print("Enter the distance from via city to final city (in miles): ");
        int viaToFinalCity = scanner.nextInt();
        
        // Calculate total distance
        int totalDistance = fromToVia + viaToFinalCity;
        
        // Input time taken for the travel
        System.out.print("Enter the total time taken for the travel (in hours): ");
        int timeTaken = scanner.nextInt();
        
        // Calculate average speed (integer division)
        int averageSpeed = totalDistance / timeTaken;
        
        // Input fee and discount percentage
        System.out.print("Enter the travel fee: ");
        int fee = scanner.nextInt();
        
        System.out.print("Enter the discount percentage: ");
        int discountPercent = scanner.nextInt();
        
        // Calculate discounted fee
        int discountedFee = fee - (fee * discountPercent / 100);
        
        // Perform integer operations for result demonstration
        int result1 = fee + discountPercent * totalDistance;      
        int result2 = (fee + discountPercent) * totalDistance;    
        int result3 = fee * totalDistance / timeTaken;           
        // Display travel details and results
        System.out.println("\nTravel Details:");
        System.out.printf("Name: %s\nFrom City: %s\nVia City: %s\nTo City: %s\n", name, fromCity, viaCity, toCity);
        System.out.printf("Total Distance: %d miles\nTime Taken: %d hours\nAverage Speed: %d miles/hour\n", 
                          totalDistance, timeTaken, averageSpeed);
        System.out.printf("Original Fee: $%d\nDiscounted Fee: $%d\n", fee, discountedFee);
        
        System.out.println("\nThe results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ".");
        
        // Close the scanner
        scanner.close();
    }
}
