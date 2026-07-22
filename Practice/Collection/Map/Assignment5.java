import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/*
 * Implement the assignment 1 using TreeMap
 */

public class Assignment5 {
    // Instance variable M1 using TreeMap
    private TreeMap<String, String> M1 = new TreeMap<>();

    // 1. Method to save country and capital
    public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    // 2. Method to get capital by country name
    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    // 3. Method to get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Method to invert M1 into M2 (Capital -> Country) using TreeMap
    public TreeMap<String, String> swapKeyValue() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Method to return an ArrayList of all country names (keys)
    public ArrayList<String> toArrayList() {
        ArrayList<String> countryList = new ArrayList<>();
        for (String country : M1.keySet()) {
            countryList.add(country);
        }
        return countryList;
    }

    public static void main(String[] args) {
        Assignment5 obj = new Assignment5();

        // Testing Step 1
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");

        System.out.println("TreeMap M1 (Sorted by Country Name): " + obj.saveCountryCapital("Germany", "Berlin"));

        // Testing Step 2
        System.out.println("Capital of India: " + obj.getCapital("India"));

        // Testing Step 3
        System.out.println("Country for capital 'Tokyo': " + obj.getCountry("Tokyo"));

        // Testing Step 4
        TreeMap<String, String> M2 = obj.swapKeyValue();
        System.out.println("TreeMap M2 (Capital -> Country): " + M2);

        // Testing Step 5
        ArrayList<String> countries = obj.toArrayList();
        System.out.println("ArrayList of Countries: " + countries);
    }
}