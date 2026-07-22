import java.util.HashSet;
import java.util.Iterator;

/*
 * Develop a java class with a instance variable H1 (HashSet) 
 * add a method saveCountryNames(String CountryName) , the method should add 
 * the passed country to a HashSet (H1) and return the added HashSet(H1).
 * 
 * Develop a method getCountry(String CountryName) which iterates through 
 * the HashSet and returns the country if exist else return null. 
 * 
 * NOTE: You can test the methods using a main method.
 */

public class Assignment1 {
    // Instance variable H1 (HashSet)
    private HashSet<String> H1 = new HashSet<>();

    // Method to add country name and return the HashSet
    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    // Method to search for country by iterating through the HashSet
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
        Assignment1 obj = new Assignment1();

        // Testing saveCountryNames method
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        HashSet<String> countries = obj.saveCountryNames("Germany");

        System.out.println("HashSet elements: " + countries);

        // Testing getCountry method
        System.out.println("\nSearching for 'India': " + obj.getCountry("India"));
        System.out.println("Searching for 'France': " + obj.getCountry("France"));
    }
}