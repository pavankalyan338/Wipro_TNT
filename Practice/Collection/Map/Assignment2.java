import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Create a Collection called HashMap which is capable of storing String objects. 
 * The program should have the following abilities:
 * a) Check if a particular key exists or not.
 * b) Check if a particular value exists or not.
 * c) Use Iterator to loop through the map.
 */

public class Assignment2 {
    public static void main(String[] args) {
        // Create a HashMap capable of storing String key-value pairs
        HashMap<String, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("IN", "India");
        map.put("US", "United States");
        map.put("JP", "Japan");
        map.put("DE", "Germany");

        // a) Check if a particular key exists or not
        String searchKey1 = "IN";
        String searchKey2 = "FR";
        System.out.println("Does key '" + searchKey1 + "' exist? " + map.containsKey(searchKey1));
        System.out.println("Does key '" + searchKey2 + "' exist? " + map.containsKey(searchKey2));

        System.out.println();

        // b) Check if a particular value exists or not
        String searchValue1 = "Japan";
        String searchValue2 = "France";
        System.out.println("Does value '" + searchValue1 + "' exist? " + map.containsValue(searchValue1));
        System.out.println("Does value '" + searchValue2 + "' exist? " + map.containsValue(searchValue2));

        System.out.println();

        // c) Use Iterator to loop through the map
        System.out.println("Looping through the map using Iterator:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}