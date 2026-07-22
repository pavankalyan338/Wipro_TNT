/*
 * Define your own class with a static method "int digitCount(int n)" which 
 * should return the number of digits in a given input "n". 
 * Define your own functional interface to refer this static method and invoke 
 * it to get the number of digits.
 */

// Functional interface to refer to the static method
@FunctionalInterface
interface DigitCounter {
    int count(int n);
}

// Class containing the static method
class NumberUtils {
    public static int digitCount(int n) {
        // Handle negative numbers by converting to positive
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        // Referring to the static method using Method Reference (ClassName::staticMethod)
        DigitCounter counter = NumberUtils::digitCount;

        // Invoking the method via the functional interface
        int number = 98765;
        int totalDigits = counter.count(number);

        System.out.println("Given Number: " + number);
        System.out.println("Number of Digits: " + totalDigits);
    }
}