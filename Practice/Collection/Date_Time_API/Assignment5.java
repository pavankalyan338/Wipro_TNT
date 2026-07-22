import java.time.LocalTime;

/*
 * Write a program to display the current time and the time after 25 minutes.
 */

public class Assignment5 {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Calculate the time after 25 minutes
        LocalTime timeAfter25Minutes = currentTime.plusMinutes(25);

        // Display the results
        System.out.println("Current Time: " + currentTime);
        System.out.println("Time after 25 minutes: " + timeAfter25Minutes);
    }
}