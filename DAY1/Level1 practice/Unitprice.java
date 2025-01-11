import java.util.Scanner;

public class Unitprice {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity : ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the total price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // Close the scanner
        scanner.close();
    }
}
