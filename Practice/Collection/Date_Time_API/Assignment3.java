import java.time.LocalDate;
import java.time.Period;

/*
 * Write a program to calculate your experience (no of years, no of months & no of days) in Wipro.
 */

public class Assignment3 {
    public static void main(String[] args) {
        // Specify your joining date (Year, Month, Day)
        LocalDate joiningDate = LocalDate.of(2021, 6, 15);
        
        // Get today's date
        LocalDate currentDate = LocalDate.now();

        // Calculate period between joining date and today
        Period experience = Period.between(joiningDate, currentDate);

        // Display results
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Current Date: " + currentDate);
        System.out.println("\nExperience in Wipro:");
        System.out.println(experience.getYears() + " Years, " + 
                           experience.getMonths() + " Months, " + 
                           experience.getDays() + " Days");
    }
}