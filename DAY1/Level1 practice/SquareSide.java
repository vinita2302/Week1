import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side length of the square 
        double side = perimeter / 4;

        //  result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
