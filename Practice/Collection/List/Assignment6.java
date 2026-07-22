import java.util.List;
import java.util.Vector;

/*
 * Implement the assignment 1 using Vector
 */

public class Assignment6 {
    public static void main(String[] args) {
        // Create a Vector of Strings to store months
        List<String> months = new Vector<>();

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
        System.out.println("Months of the year (using Vector):");
        for (String month : months) {
            System.out.println(month);
        }
    }
}