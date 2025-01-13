import java.util.Scanner;

public class StudentVote {

    //create
    public boolean canStudentVote(int age) {
        // Validate 
        if (age < 0) {
            System.out.println("Age cannot be negative.");
            return false;
        }

        if (age >= 18) {
            return true; 
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        // Create an array 
        int[] studentAges = new int[10];

        StudentVote voteChecker = new StudentVote();

       
        for (int i = 0; i < studentAges.length; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ":");
            studentAges[i] = scanner.nextInt();

           
            if (voteChecker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close(); // Close the scanner object
    }
}
