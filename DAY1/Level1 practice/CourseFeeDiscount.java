public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Initialize fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate the final fee after discount
        double discountedFee = fee - discount;

        // Print the discount and final discounted fee
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + discountedFee);
    }
}
