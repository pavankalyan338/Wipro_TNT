import java.util.Scanner;

/*
 * Create a class named ‘Animal’ which includes methods like eat() and sleep().
 * 
 * Create a child class of Animal named ‘Bird’ and override the parent class methods. 
 * Add a new method named fly().
 * 
 * Create an instance of Animal class and invoke the eat and sleep methods using this object.
 * 
 * Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
 */

// Base class
class Animal {
    // Methods designed to accept dynamic inputs
    public void eat(String food) {
        System.out.println("The animal eats " + food + ".");
    }

    public void sleep(int hours) {
        System.out.println("The animal sleeps for " + hours + " hours.");
    }
}

// Subclass inheriting from Animal
class Bird extends Animal {
    // Overriding eat method
    @Override
    public void eat(String food) {
        System.out.println("The bird pecks at and eats " + food + ".");
    }

    // Overriding sleep method
    @Override
    public void sleep(int hours) {
        System.out.println("The bird tucks its head under its wing and sleeps for " + hours + " hours.");
    }

    // New method specific to Bird
    public void fly(double distance) {
        System.out.println("The bird spreads its wings and flies " + distance + " meters high!");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Create and test the Animal object with dynamic inputs
        System.out.println("=== Testing Animal Object ===");
        Animal generalAnimal = new Animal();
        
        System.out.print("Enter what the general animal is eating: ");
        String animalFood = sc.nextLine();
        System.out.print("Enter how many hours the general animal sleeps: ");
        int animalSleepTime = sc.nextInt();
        sc.nextLine(); // Consume newline leftover
        
        // Invoking Animal methods
        generalAnimal.eat(animalFood);
        generalAnimal.sleep(animalSleepTime);

        System.out.println("\n=== Testing Bird Object ===");
        // 2. Create and test the Bird object with dynamic inputs
        Bird customBird = new Bird();
        
        System.out.print("Enter what the bird is eating: ");
        String birdFood = sc.nextLine();
        System.out.print("Enter how many hours the bird sleeps: ");
        int birdSleepTime = sc.nextInt();
        System.out.print("Enter how high (in meters) the bird flies: ");
        double flyHeight = sc.nextDouble();
        
        // Invoking overridden and specific Bird methods
        customBird.eat(birdFood);
        customBird.sleep(birdSleepTime);
        customBird.fly(flyHeight);

        sc.close();
    }
}