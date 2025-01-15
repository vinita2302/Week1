import java.util.Scanner;

public class CalendarProgram {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "Invalid", "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check if it's a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // If February and a leap year, return 29 days
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Applying Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get month name and number of days
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print month and year
        System.out.println(monthName + " " + year);
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d  ", day);
            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);
    }
}
