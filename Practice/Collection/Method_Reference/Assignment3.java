/*
 * Define your own class and a parameterized constructor with one integer argument. 
 * It should check the argument and display "Prime" or "Not Prime". 
 * Define your own functional interface to refer this constructor and invoke 
 * it to check whether the given number is Prime or Not.
 */

// Functional interface referring to the constructor
@FunctionalInterface
interface PrimeChecker {
    NumberCheck check(int number);
}

// Class with parameterized constructor
class NumberCheck {

    public NumberCheck(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        // Referring to the constructor using Method Reference (ClassName::new)
        PrimeChecker checker = NumberCheck::new;

        // Invoking the functional interface to instantiate the class and run the check
        System.out.println("Checking numbers:");
        checker.check(17);
        checker.check(20);
        checker.check(1);
    }
}