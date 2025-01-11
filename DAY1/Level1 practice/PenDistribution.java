public class PenDistribution {
    public static void main(String[] args) {
        // Total number of pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student using division operator
        int pensPerStudent = totalPens / totalStudents;

        // Calculate remaining pens using modulus operator
        int remainingPens = totalPens % totalStudents;

        // Print the result in a single statement
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
