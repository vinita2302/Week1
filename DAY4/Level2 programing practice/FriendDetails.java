import java.util.Scanner;

public class FriendDetails {

    // Method to find the youngest among the three friends
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";

        // Check for the youngest among the friends based on age
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngest = "Anthony";
        }

        return youngest;
    }

    // Method to find the tallest among the three friends
    public static String findTallest(int[] heights) {
        int maxHeight = heights[0];
        String tallest = "Amar";

        // Check for the tallest among the friends based on height
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallest = "Anthony";
        }

        return tallest;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for the ages of the friends
        System.out.println("Enter the age of Amar:");
        ages[0] = scanner.nextInt();
        System.out.println("Enter the age of Akbar:");
        ages[1] = scanner.nextInt();
        System.out.println("Enter the age of Anthony:");
        ages[2] = scanner.nextInt();

        // Take input for the heights of the friends
        System.out.println("Enter the height of Amar (in cm):");
        heights[0] = scanner.nextInt();
        System.out.println("Enter the height of Akbar (in cm):");
        heights[1] = scanner.nextInt();
        System.out.println("Enter the height of Anthony (in cm):");
        heights[2] = scanner.nextInt();

        // Find and display the youngest and tallest friends
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close(); // Close the scanner
    }
}
