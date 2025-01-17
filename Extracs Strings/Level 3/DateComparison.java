import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 1, 1); // Replace with first input date
        LocalDate date2 = LocalDate.of(2025, 12, 31); // Replace with second input date

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Date1 is the same as Date2.");
        }
    }
}
