import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * 1. Develop a java class with a instance variable M1 (HashMap) 
 * create a method saveCountryCapital(String CountryName, String capital) , the method should add 
 * the passed country and capital as key/value in the map M1 and return the Map (M1).
 * Key- Country                          Value - Capital
 * India                                 Delhi
 * Japan                                 Tokyo
 * 
 * 2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, 
 * from the Map M1 created in step 1.
 * 
 * 3. Develop a method getCountry(String capitalName) which returns the country for the capital name, 
 * passed from the Map M1 created in step 1.
 * 
 * 4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key 
 * and value as Country and returns the Map M2.
 * Key – Capital                         Value – Country
 * Delhi                                 India
 * Tokyo                                 Japan
 * 
 * 5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names 
 * stored as keys. This method should return the ArrayList.
 * 
 * NOTE: You can test the methods using a main method.
 */

public class Assignment1 {
    // Instance variable M1
    private HashMap<String, String> M1 = new HashMap<>();

    // 1. Method to save country and capital
    public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
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

    // 4. Method to invert M1 into M2 (Capital -> Country)
    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<>();
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
        Assignment1 obj = new Assignment1();

        // Testing Step 1
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");

        System.out.println("Map M1 (Country -> Capital): " + obj.getCapital("India"));

        // Testing Step 2
        System.out.println("Capital of India: " + obj.getCapital("India"));

        // Testing Step 3
        System.out.println("Country for capital 'Tokyo': " + obj.getCountry("Tokyo"));

        // Testing Step 4
        HashMap<String, String> M2 = obj.swapKeyValue();
        System.out.println("Map M2 (Capital -> Country): " + M2);

        // Testing Step 5
        ArrayList<String> countries = obj.toArrayList();
        System.out.println("ArrayList of Countries: " + countries);
    }
}