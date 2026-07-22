import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * Write a program that will have a Properties class object which is capable of storing 
 * some States of India and their Capital. Use an Iterator to list all the elements 
 * stored in the Properties.
 */

public class Assignment3 {
    public static void main(String[] args) {
        // Create a Properties object
        Properties statesAndCapitals = new Properties();

        // Storing States and their Capitals
        statesAndCapitals.setProperty("Andhra Pradesh", "Amaravati");
        statesAndCapitals.setProperty("Maharashtra", "Mumbai");
        statesAndCapitals.setProperty("Tamil Nadu", "Chennai");
        statesAndCapitals.setProperty("Karnataka", "Bengaluru");
        statesAndCapitals.setProperty("Telangana", "Hyderabad");

        // Obtain the set of keys (State names)
        Set<Object> keys = statesAndCapitals.keySet();

        // Get an Iterator for the key set
        Iterator<Object> iterator = keys.iterator();

        // Iterate and display state and capital pairs
        System.out.println("--- States of India and their Capitals ---");
        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            String capital = statesAndCapitals.getProperty(state);
            System.out.println("State: " + state + " | Capital: " + capital);
        }
    }
}