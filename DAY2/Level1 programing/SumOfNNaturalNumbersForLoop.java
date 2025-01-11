import java.util.Scanner;

public class SumOfNNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum calculated by loop: " + sum);
        System.out.println("Sum calculated by formula: " + formulaSum);
    }
}
