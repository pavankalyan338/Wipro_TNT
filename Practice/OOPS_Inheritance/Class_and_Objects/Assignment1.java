package Practice.OOPS_Inheritance.Class_and_Objects;

import java.util.Scanner;

/*
 * Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
 * The dimensions of the Box are width, height, depth. 
 * The class should have a method that can return the volume of the box. 
 * Create an object of the Box class and test the functionalities.
 */

// Define the Box class as required by the assignment description
class Box {
    double width;
    double height;
    double depth;

    // Parameterized constructor to initialize the dimensions of the box
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate and return the volume of the box
    public double getVolume() {
        return width * height * depth;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Box Volume Calculator ---");
        
        // Dynamically prompt the user for dimensions
        System.out.print("Enter the width of the Box: ");
        double w = sc.nextDouble();

        System.out.print("Enter the height of the Box: ");
        double h = sc.nextDouble();

        System.out.print("Enter the depth of the Box: ");
        double d = sc.nextDouble();

        // Create an object of the Box class using the parameterized constructor
        Box myBox = new Box(w, h, d);

        // Display the calculated volume of the box
        System.out.printf("The volume of the box is: %.2f\n", myBox.getVolume());

        sc.close();
    }
}
