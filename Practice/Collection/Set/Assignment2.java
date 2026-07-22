import java.util.HashSet;
import java.util.Iterator;

/*
 * Write a program to store a group of employee names into a HashSet, 
 * retrieve the elements one by one using an Iterator.
 */

public class Assignment2 {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> empSet = new HashSet<>();

        // Adding employee names to the HashSet
        empSet.add("John Doe");
        empSet.add("Jane Smith");
        empSet.add("Alex Johnson");
        empSet.add("Emily Davis");

        // Retrieve elements one by one using an Iterator
        System.out.println("Employee Names in HashSet:");
        Iterator<String> iterator = empSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}