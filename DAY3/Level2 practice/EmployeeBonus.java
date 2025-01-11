import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the arrays for storing salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store the total bonus, total old salary, and total new salary
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Take input for salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Input salary
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = scanner.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                } else {
                    break;
                }
            }

            // Input years of service
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                } else {
                    break;
                }
            }
        }

        // Calculate bonus, new salary and total salaries
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus for more than 5 years
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus for 5 years or less
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update total old salary, total new salary, and total bonus
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        // Print the results
        System.out.println("\nSummary of Bonuses and Salaries:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        // Print total bonus payout, total old salary, and total new salary
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
