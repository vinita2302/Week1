import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double input;

        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            input = scanner.nextDouble();
            
            if (input == 0) {
                break;
            }
            
            total += input;
        }
        
        System.out.println("Sum of numbers entered: " + total);
        scanner.close();
    }
}
