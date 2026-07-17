package Practice.OOPS_Inheritance.Overriding_Polymorphisim;

import java.util.Scanner;

/*
 * Create a base class Fruit with name ,taste and size as its attributes. 
 * Create a method called eat() which describes the name of the fruit and its taste. 
 * Inherit the same in 2 other classes Apple and Orange and override the eat() method 
 * to represent their taste.
 */

// Base Class
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Base method to be overridden
    public void eat() {
        System.out.println("Eating a " + size + " " + name + " which tastes " + taste + ".");
    }
}

// Subclass Apple
class Apple extends Fruit {
    // Constructor passing data to parent
    public Apple(String taste, String size) {
        super("Apple", taste, size);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("Taking a crunchy bite of a " + size + " Apple! It tastes remarkably " + taste + ".");
    }
}

// Subclass Orange
class Orange extends Fruit {
    // Constructor passing data to parent
    public Orange(String taste, String size) {
        super("Orange", taste, size);
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println("Peeling a juicy " + size + " Orange! It has a wonderfully " + taste + " flavor.");
    }
}

// Main Class named exactly per conventions
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Dynamic Input for Apple
        System.out.println("=== Setup Apple Characteristics ===");
        System.out.print("Enter Apple taste (e.g., Sweet, Tart): ");
        String appleTaste = sc.nextLine();
        System.out.print("Enter Apple size (e.g., Large, Medium): ");
        String appleSize = sc.nextLine();

        // Instantiate Apple child class
        Fruit myApple = new Apple(appleTaste, appleSize);

        // 2. Dynamic Input for Orange
        System.out.println("\n=== Setup Orange Characteristics ===");
        System.out.print("Enter Orange taste (e.g., Sour, Tangy): ");
        String orangeTaste = sc.nextLine();
        System.out.print("Enter Orange size (e.g., Small, Medium): ");
        String orangeSize = sc.nextLine();

        // Instantiate Orange child class
        Fruit myOrange = new Orange(orangeTaste, orangeSize);

        // 3. Demonstrating Polymorphism (Dynamic Method Dispatch)
        System.out.println("\n--- Invoking Overridden eat() Methods ---");
        myApple.eat();   // Calls Apple's version of eat()
        myOrange.eat();  // Calls Orange's version of eat()

        sc.close();
    }
}
