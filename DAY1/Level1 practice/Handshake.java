import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner scanner = new Scanner(System.in);

        //  enter the number of students
        System.out.print("enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes 
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        //print the number of possible handshakes
        System.out.println("The maximum number of handshakes is: " + handshakes);

        // Close the scanner
        scanner.close();
    }
}
