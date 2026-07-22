import java.util.ArrayList;
import java.util.Iterator;

/*
 * Create an ArrayList that can store only Strings. 
 * Create a printAll method that will print all the elements of the ArrayList using an Iterator.
 */

public class Assignment3 {

    // Method to print all elements using an Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList that stores only Strings
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dragonfruit");
        list.add("Elderberry");

        System.out.println("Printing ArrayList elements using Iterator:");
        printAll(list);
    }
}