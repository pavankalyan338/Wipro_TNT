/*
 * Create an interface Vehicle with a default method message() that returns nothing and prints "Inside Vehicle".
 * Create an interface FourWheeler with a default method message() that returns nothing and prints "Inside FourWheeler".
 * 
 * Create a class Car implementing these two interfaces. 
 * In this class, Override the message() method and call the message() method of the Vehicle interface using super keyword. 
 * 
 * Instantiate the class, call the message method and observe the output.
 */

// Interface 1
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

// Interface 2
interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

// Class implementing both interfaces
public class Assignment1 implements Vehicle, FourWheeler {

    // Overriding the conflicting message() method
    @Override
    public void message() {
        // Calling the message() method of Vehicle interface using super keyword
        Vehicle.super.message();
    }

    public static void main(String[] args) {
        // Instantiate the class
        Assignment1 car = new Assignment1();
        
        // Call the message method
        car.message();
    }
}