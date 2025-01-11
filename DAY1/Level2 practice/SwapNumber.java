import java.util.Scanner;

 class SwapNumber{
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        //  input for number1
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        //  input for number2
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        //original values
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers using a temp variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        //swapped values
        System.out.println("The swapped numbers are "+ number1+" and " +number2);

        // Close the scanner
        scanner.close();
    }
}

