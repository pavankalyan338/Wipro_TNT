import java.time.LocalTime;

/*
 * Write a program to display the current time and the time before 5 hours and 30 minutes.
 */

public class Assignment6 {
    public static void main(String[] args) {
        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Calculate time before 5 hours and 30 minutes
        LocalTime pastTime = currentTime.minusHours(5).minusMinutes(30);

        // Display results
        System.out.println("Current Time: " + currentTime);
        System.out.println("Time before 5 hours and 30 minutes: " + pastTime);
    }
}