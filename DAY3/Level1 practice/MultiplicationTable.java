import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number for which the multiplication table is to be generated
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define an array to store the results of multiplication from 1 to 10
        int[] multiplicationTable = new int[10];

        // Loop to store the multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        scanner.close();
    }
}
