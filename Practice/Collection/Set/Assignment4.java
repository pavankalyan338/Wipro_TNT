import java.util.Iterator;
import java.util.TreeSet;

/*
 * Implement the assignment 1 using TreeSet
 */

public class Assignment4 {
    // Instance variable H1 (TreeSet)
    private TreeSet<String> H1 = new TreeSet<>();

    // Method to add country name and return the TreeSet
    public TreeSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    // Method to search for country by iterating through the TreeSet
    public String getCountry(String CountryName) {
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Assignment4 obj = new Assignment4();

        // Testing saveCountryNames method
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        TreeSet<String> countries = obj.saveCountryNames("Germany");

        System.out.println("TreeSet elements (Sorted): " + countries);

        // Testing getCountry method
        System.out.println("\nSearching for 'India': " + obj.getCountry("India"));
        System.out.println("Searching for 'France': " + obj.getCountry("France"));
    }
}