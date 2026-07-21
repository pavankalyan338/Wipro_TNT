package com.wipro.automobile.ship;

/*
 * Create a class called compartment which represents the ship compartments with attributes like height, width and breadth. 
 * 
 * Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
 * 
 * To avoid conflict create this class in a new package called com.wipro.automobile.ship
 */

class Compartment {
    private double height;
    private double width;
    private double breadth;

    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    public double calculateVolume() {
        return height * width * breadth;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        // Instantiate the ship Compartment class from package com.wipro.automobile.ship
        Compartment shipCompartment = new Compartment(12.5, 20.0, 35.0);

        System.out.println("Ship Compartment Details:");
        System.out.println("Height: " + shipCompartment.getHeight() + " ft");
        System.out.println("Width: " + shipCompartment.getWidth() + " ft");
        System.out.println("Breadth: " + shipCompartment.getBreadth() + " ft");
        System.out.println("Calculated Volume: " + shipCompartment.calculateVolume() + " cu. ft");
    }
}