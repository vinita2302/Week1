import java.util.Scanner;

public class Quadratic {
 
 //create a method
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; 

        if (delta > 0) {
           
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            
            return new double[0]; 
        }
    }

    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);
//Take user input
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Find the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Check and display the results
        if (roots.length == 2) {
            System.out.println("The two roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("There is one root: " + roots[0]);
        } else {
            System.out.println("No rel roots exist.");
        }

        scanner.close(); // Close the scanner
    }
}
