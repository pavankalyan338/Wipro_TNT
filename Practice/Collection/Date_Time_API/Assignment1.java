import java.time.LocalDate;

/*
 * Write a program to display today's date and the date after ten days.
 */

public class Assignment1 {
    public static void main(String[] args) {
        // Getting today's date
        LocalDate today = LocalDate.now();

        // Calculating the date after 10 days
        LocalDate dateAfterTenDays = today.plusDays(10);

        // Displaying the results
        System.out.println("Today's Date: " + today);
        System.out.println("Date after 10 days: " + dateAfterTenDays);
    }
}