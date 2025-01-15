import java.util.Scanner;

public class DistanceAndLine { 
// Method to find the Euclidean distance between two points
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
 
 // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);  
        double yIntercept = y1 - (slope * x1); 

        return new double[]{slope, yIntercept};  
    } 
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input 
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Find and display the Euclidean distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the two points: " + distance);

        // Find and display the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        scanner.close();
    }

    

    
}
