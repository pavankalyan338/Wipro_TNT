import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Given an ArrayList containing 10 numbers, write a program to filter the perfect square numbers.
 * Example for perfect square numbers: 0, 1, 4, 9, 16, 25, 36, 49, 64 etc..
 */

public class Assignment5 {

    // Helper method to check if a number is a perfect square
    private static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    public static void main(String[] args) {
        // Creating an ArrayList containing 10 numbers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 7, 9, 15, 16, 23, 25, 30, 36));

        System.out.println("Original Numbers: " + numbers);

        // Predicate to test whether a number is a perfect square
        Predicate<Integer> perfectSquarePredicate = Assignment5::isPerfectSquare;

        System.out.println("\nPerfect Square Numbers:");

        // Filtering and printing perfect square numbers using the Predicate
        for (int num : numbers) {
            if (perfectSquarePredicate.test(num)) {
                System.out.println(num);
            }
        }
    }
}