 import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // arrays to store marks, percentages, and grades 
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        //  each student to take input marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            
            do {
                System.out.print("Physics marks (0-100): ");
                physicsMarks[i] = scanner.nextDouble();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (physicsMarks[i] < 0 || physicsMarks[i] > 100);

          
            do {
                System.out.print("Chemistry marks (0-100): ");
                chemistryMarks[i] = scanner.nextDouble();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100);

            
            do {
                System.out.print("Maths marks (0-100): ");
                mathsMarks[i] = scanner.nextDouble();
                if (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (mathsMarks[i] < 0 || mathsMarks[i] > 100);

            // Calculate percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade based on percentage
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

        // Display the marks, percentages, and grades for all students
       
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Maths Marks: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
          
        }

        scanner.close();
    }
}
