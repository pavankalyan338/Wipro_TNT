import java.time.LocalDate;

/*
 * Write a program to check whether the current year is a leap year.
 */

public class Assignment4 {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Check if the current year is a leap year
        boolean isLeap = today.isLeapYear();

        // Get current year
        int currentYear = today.getYear();

        // Display results
        System.out.println("Current Year: " + currentYear);
        if (isLeap) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }
    }
}