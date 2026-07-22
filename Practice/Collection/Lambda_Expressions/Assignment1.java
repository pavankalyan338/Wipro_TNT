import java.util.ArrayList;
import java.util.Random;

/*
 * Create an ArrayList al and add 25 random numbers. 
 * Write a code to print all the prime numbers that are present in it, using lambda expression.
 */

public class Assignment1 {

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        // Adding 25 random numbers (between 1 and 100)
        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        System.out.println("Generated Numbers: " + al);
        System.out.println("\nPrime Numbers in the list:");

        // Using Lambda Expression with forEach to print prime numbers
        al.forEach(num -> {
            if (isPrime(num)) {
                System.out.println(num);
            }
        });
    }
}