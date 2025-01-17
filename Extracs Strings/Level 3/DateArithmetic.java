import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2025, 1, 1); // Replace with your input date

        LocalDate updatedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Input Date: " + inputDate);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + updatedDate);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);
    }
}
