import java.util.ArrayList;
import java.util.function.Supplier;

/*
 * Write a program using Supplier, which generates and returns an ArrayList 
 * containing first 10 prime numbers.
 */

public class Assignment8 {

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Supplier that generates and returns an ArrayList of the first 10 prime numbers
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int count = 0;
            int number = 2; // Starting from the first prime number

            while (count < 10) {
                if (isPrime(number)) {
                    primes.add(number);
                    count++;
                }
                number++;
            }
            return primes;
        };

        // Getting the generated ArrayList from the Supplier
        ArrayList<Integer> first10Primes = primeSupplier.get();

        // Displaying the results
        System.out.println("First 10 Prime Numbers:");
        System.out.println(first10Primes);
    }
}