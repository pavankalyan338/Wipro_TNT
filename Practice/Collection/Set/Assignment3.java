import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * Create a Collection called TreeSet which is capable of storing String objects. 
 * Then try these following operations :
 * a) Reverse the elements of the Collection.
 * b) Iterate the elements of the TreeSet using Iterator.
 * c) Check if a particular element exists or not.
 */

public class Assignment3 {
    public static void main(String[] args) {
        // Create a TreeSet capable of storing String objects
        TreeSet<String> set = new TreeSet<>();

        // Add elements to the TreeSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Dragonfruit");
        set.add("Elderberry");

        // a) Reverse the elements of the Collection
        NavigableSet<String> reversedSet = set.descendingSet();
        System.out.println("Reversed Set: " + reversedSet);

        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("\nIterating through TreeSet elements:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists or not
        String searchElement1 = "Banana";
        String searchElement2 = "Mango";

        System.out.println("\nDoes '" + searchElement1 + "' exist? " + set.contains(searchElement1));
        System.out.println("Does '" + searchElement2 + "' exist? " + set.contains(searchElement2));
    }
}