/*
 * Define your own class with an instance method "int factorial(int n)" which 
 * should return the factorial of the given input "n". 
 * Define your own functional interface to refer this instance method and invoke 
 * it to get the factorial result.
 */

// Functional interface to refer to the instance method
@FunctionalInterface
interface FactorialProvider {
    int calculate(int n);
}

// Class containing the instance method
class MathUtils {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Referring to the instance method using Method Reference (object::instanceMethod)
        FactorialProvider fp = mathUtils::factorial;

        // Invoking the method via the functional interface
        int number = 5;
        int result = fp.calculate(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}