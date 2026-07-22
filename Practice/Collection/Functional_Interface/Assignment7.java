import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Given an ArrayList containing 10 numbers, write a program using Consumer methods 
 * to display each number and whether is it odd or even.
 * 
 * Example: For number 2, it should print "2 even" 
 *          For number 5, it should print "5 odd"
 */

public class Assignment7 {
    public static void main(String[] args) {
        // Creating an ArrayList containing 10 numbers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Consumer to display if a number is even or odd
        Consumer<Integer> displayOddEvenConsumer = num -> {
            if (num % 2 == 0) {
                System.out.println(num + " even");
            } else {
                System.out.println(num + " odd");
            }
        };

        System.out.println("--- Number Odd/Even Analysis ---");

        // Iterating over the ArrayList and applying Consumer
        numbers.forEach(displayOddEvenConsumer);
    }
}