import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Write a program 
 * 1. To filter the negative even numbers from an ArrayList,
 * 2. Store them into a new ArrayList,
 * 3. Print the ArrayList elements.
 */

public class Assignment1 {
    public static void main(String[] args) {
        // Initializing an ArrayList with positive and negative numbers
        List<Integer> list = new ArrayList<>(Arrays.asList(-10, -5, -4, -3, -2, 0, 1, 4, 6, -8, -15));

        System.out.println("Original List: " + list);

        // Filtering negative even numbers using Stream API and storing in a new ArrayList
        ArrayList<Integer> negativeEvenNumbers = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        // Printing the filtered ArrayList elements
        System.out.println("\nFiltered Negative Even Numbers:");
        negativeEvenNumbers.forEach(System.out::println);
    }
}