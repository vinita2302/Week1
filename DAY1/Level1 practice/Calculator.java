import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner 
        Scanner scanner = new Scanner(System.in);

        // take the input
        System.out.print("enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("enter the second number: ");
        double number2 =scanner.nextDouble();

        //operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        //result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Close the scanner
       scanner.close();
    }
}
