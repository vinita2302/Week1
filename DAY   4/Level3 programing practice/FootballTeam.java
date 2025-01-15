import java.util.Arrays;
import java.util.Random;

public class FootballTeam {

    // Method to generate random heights 
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101);  
        }
        return heights;
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height of players
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    // Method to find the tallest height in the array
    public static int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int teamSize = 11;
        int[] heights = generateRandomHeights(teamSize);  

        // Display heights of all players
        System.out.println("Heights of players in the team: " + Arrays.toString(heights));

        // Find and display the sum, mean, shortest, and tallest heights
        double meanHeight = calculateMean(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        System.out.println("Mean height of players: " + meanHeight + " cm");
        System.out.println("Shortest height of players: " + shortestHeight + " cm");
        System.out.println("Tallest height of players: " + tallestHeight + " cm");
    }
}
