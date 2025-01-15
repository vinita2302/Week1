import java.util.Random;

public class BonusCalculator {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);  // Generate salary and years of service for 10 employees
        int[][] bonusData = calculateBonus(employeeData); // Calculate bonus and new salary
        displayResults(employeeData, bonusData);          // Display results in tabular format
    }

    // Method to generate salary and years of service for employees
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2]; // [0] -> Salary, [1] -> Years of Service

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 30000 + random.nextInt(70001);  // Random salary between 30,000 and 100,000
            data[i][1] = random.nextInt(11);             // Random years of service between 0 and 10
        }

        return data;
    }

    // Method to calculate bonus and new salary
    public static int[][] calculateBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        int[][] result = new int[numEmployees][2]; // [0] -> Bonus Amount, [1] -> New Salary

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            int bonusPercentage = (yearsOfService > 5) ? 5 : 2; // 5% bonus for > 5 years, 2% otherwise
            int bonusAmount = (salary * bonusPercentage) / 100;
            int newSalary = salary + bonusAmount;

            result[i][0] = bonusAmount;
            result[i][1] = newSalary;
        }

        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(int[][] employeeData, int[][] bonusData) {
        int sumOldSalary = 0;
        int sumNewSalary = 0;
        int totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            int bonus = bonusData[i][0];
            int newSalary = bonusData[i][1];

            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t\t%d\t\t%d\t\t\t%d\t%d\n", (i + 1), oldSalary, yearsOfService, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Total\t\t" + sumOldSalary + "\t\t\t\t\t" + totalBonus + "\t" + sumNewSalary);
    }
}
 