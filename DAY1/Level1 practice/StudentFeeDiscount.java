import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner input = new Scanner(System.in);

        //  student fee and discount percentage
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount 
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee 
        double finalFee = fee - discount;

        // print
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        // Close the scanner
        input.close();
    }
}
