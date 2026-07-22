import java.util.LinkedList;
import java.util.List;

/*
 * Implement the assignment 1 using Linked List
 */

public class Assignment5 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings to store months
        List<String> months = new LinkedList<>();

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
        System.out.println("Months of the year (using LinkedList):");
        for (String month : months) {
            System.out.println(month);
        }
    }
}