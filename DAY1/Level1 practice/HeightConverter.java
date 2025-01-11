import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner scanner = new Scanner(System.in);

        //  enter  height 
        System.out.print("Enter your height: ");
        double heightCm = scanner.nextDouble();

        // Convert centimeters to inches 
        double heightInches = heightCm / 2.54;

        // Convert inches to feet 
        int feet = (int) heightInches / 12;
        int inches = (int) heightInches % 12;

        // result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        // Close the scanner
        scanner.close();
    }
}
