import java.util.ArrayList;
import java.util.List;

/*
 * Write a Java program to create an ArrayList, add all the months of a year and print the same.
 */

public class Assignment1 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings to store months
        List<String> months = new ArrayList<>();

        // Add all months of the year
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print the list of months
        System.out.println("Months of the year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}