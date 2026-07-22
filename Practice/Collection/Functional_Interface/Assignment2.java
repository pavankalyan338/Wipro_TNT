import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * Given an ArrayList containing 10 numbers, write a program to calculate 
 * the sum of all the elements, with the help of Function.
 */

public class Assignment2 {
    public static void main(String[] args) {
        // Creating an ArrayList containing 10 numbers
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        // Function interface to calculate the sum of list elements
        Function<List<Integer>, Integer> sumFunction = numbers -> {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        };

        // Calculating total sum using the Function interface
        int totalSum = sumFunction.apply(list);

        // Displaying results
        System.out.println("Numbers: " + list);
        System.out.println("Sum of all elements: " + totalSum);
    }
}