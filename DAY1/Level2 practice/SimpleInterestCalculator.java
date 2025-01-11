import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner scanner = new Scanner(System.in);
        
        // Input principal, rate, and time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the Rate of interest: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();
        
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the result
        System.out.printf("The Simple Interest is"+ 
                          simpleInterest+" for Principal" + principal + "Rate of Interest " +rate +"and Time" + time);
        
        // Close the scanner
        scanner.close();
    }
}
 