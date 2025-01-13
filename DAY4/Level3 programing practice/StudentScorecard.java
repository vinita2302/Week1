import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Method to generate random scores for PCM
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];  
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(50) + 50;  
            scores[i][1] = random.nextInt(50) + 50;  
            scores[i][2] = random.nextInt(50) + 50;  
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];  
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n", 
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2], grade);
        }
    }

    // Method to determine grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A (Level 4)";
        } else if (percentage >= 70) {
            return "B (Level 3)";
        } else if (percentage >= 60) {
            return "C (Level 4)";
        } else if (percentage >= 50) {
            return "D (Level 1)";
        } else if (percentage >= 40) {
            return "E (Level -1)";
        } else {
            return "R (Remedial)";
        }
    } 
	
	 public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        // Close the scanner
        scanner.close();
    }
}
