import java.util.Scanner;

public class StudentGradeCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

       
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

       
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

        
            do {
                System.out.print("Physics marks (0-100): ");
                marks[i][0] = scanner.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

         
            do {
                System.out.print("Chemistry marks (0-100): ");
                marks[i][1] = scanner.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            // Input marks for Maths
            do {
                System.out.print("Maths marks (0-100): ");
                marks[i][2] = scanner.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid input");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);

            // Calculate percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

       
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
           

        scanner.close();
    }
}
