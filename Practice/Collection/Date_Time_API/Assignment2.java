import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/*
 * Write a program to find the date of next month second Sunday.
 */

public class Assignment2 {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Get the first day of next month
        LocalDate firstOfNextMonth = today.plusMonths(1).withDayOfMonth(1);

        // Find the first Sunday of next month
        LocalDate firstSundayOfNextMonth = firstOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        // Get the second Sunday of next month by adding 1 week (7 days)
        LocalDate secondSundayOfNextMonth = firstSundayOfNextMonth.plusWeeks(1);

        // Display results
        System.out.println("Today's Date: " + today);
        System.out.println("Second Sunday of Next Month: " + secondSundayOfNextMonth);
    }
}