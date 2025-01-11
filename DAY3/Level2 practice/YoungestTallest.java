import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store the age and height of the 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
        
        // Take input for the age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for friend " + (i + 1));
            
            // Input age
            System.out.print("Enter age: ");
            age[i] = scanner.nextInt();
            
            // Input height
            System.out.print("Enter height (in cm): ");
            height[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestAge = age[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        double tallestHeight = height[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("\nYoungest Friend:");
        System.out.println("Friend " + (youngestIndex + 1) + " is the youngest with age: " + youngestAge);

        System.out.println("\nTallest Friend:");
        System.out.println("Friend " + (tallestIndex + 1) + " is the tallest with height: " + tallestHeight + " cm");

        scanner.close();
    }
}
