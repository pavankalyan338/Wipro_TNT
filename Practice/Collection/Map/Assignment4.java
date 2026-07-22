import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. 
 * The program should use appropriate generics (String, Long or Integer) and have the following abilities:
 * a) Check if a particular key exists or not.
 * b) Check if a particular value exists or not.
 * c) Use Iterator to loop through the map.
 */

public class Assignment4 {
    public static void main(String[] args) {
        // Create a ContactList using HashMap with String for Name and Long for Phone Number
        HashMap<String, Long> contactList = new HashMap<>();

        // Adding contacts to the HashMap
        contactList.put("Alice", 9876543210L);
        contactList.put("Bob", 9123456789L);
        contactList.put("Charlie", 9988776655L);
        contactList.put("David", 9000011122L);

        // a) Check if a particular key (Contact Name) exists or not
        String searchName = "Alice";
        System.out.println("Does contact '" + searchName + "' exist? " + contactList.containsKey(searchName));

        // b) Check if a particular value (Phone Number) exists or not
        Long searchPhone = 9123456789L;
        System.out.println("Does phone number '" + searchPhone + "' exist? " + contactList.containsValue(searchPhone));

        System.out.println();

        // c) Use Iterator to loop through the map
        System.out.println("--- Contact List Details ---");
        Iterator<Map.Entry<String, Long>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + " | Phone: " + entry.getValue());
        }
    }
}