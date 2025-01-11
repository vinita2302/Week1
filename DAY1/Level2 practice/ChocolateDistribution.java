import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number : ");
        int numberOfChildren = scanner.nextInt();
        
   
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        //  results
        System.out.printf("The number of chocolates each child gets", 
                          chocolatesPerChild, remainingChocolates);
        
        // Close the scanner
        scanner.close();
    }
}
