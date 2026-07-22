import java.util.ArrayList;
import java.util.Collections;

/*
 * Create an ArrayList al and add 10 different words. 
 * Write a code to print all the Strings in reverse order, using lambda expression.
 */

public class Assignment2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Adding 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Date");
        al.add("Elderberry");
        al.add("Fig");
        al.add("Grape");
        al.add("Honeydew");
        al.add("Kiwi");
        al.add("Lemon");

        System.out.println("Original List: " + al);

        // Reversing the order of elements in the ArrayList
        Collections.reverse(al);

        System.out.println("\nStrings in reverse order:");
        // Using Lambda Expression with forEach to print elements
        al.forEach(word -> System.out.println(word));
    }
}