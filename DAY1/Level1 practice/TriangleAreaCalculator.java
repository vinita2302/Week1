import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height : ");
        double height= scanner.nextDouble(); 

//calculate the ara		
        double areaSquared = 0.5 * base * height;

        // Convert the area
        double areaInSquared = areaSquared / 6.4516;

        // results
        System.out.println("The area of the triangle is " + areaSquared + " square centimeters and " + areaInSquared + " square inches.");

        // Close the scanner
        scanner.close();
    }
}
