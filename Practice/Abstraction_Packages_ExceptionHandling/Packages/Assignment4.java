import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

/*
 * Add the following ideas to the previous hands on: 
 * Create FourWheeler subpackage under automobile package
 * Logan class extends com.automobile.Vehicle class
 * public int speed()
 * – Returns the current speed of the vehicle.
 * public int gps() 
 * – provides facility to control the gps device 
 * 
 * Ford class extends com.automobile.Vehicle class
 * public int speed()
 * – Returns the current speed of the vehicle.
 * public int tempControl() 
 * – provides facility to control the air conditioning device which is available in the car
 * 
 * Create objects of the relevant classes and test the various functionalities of the class.
 */

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("=== Testing Logan Four-Wheeler ===");
        Logan logan = new Logan("Mahindra Logan", "KA01AB9999", "Alice Johnson", 95);
        System.out.println("Model Name       : " + logan.getModelName());
        System.out.println("Registration No. : " + logan.getRegistrationNumber());
        System.out.println("Owner Name       : " + logan.getOwnerName());
        System.out.println("Current Speed    : " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("\n=== Testing Ford Four-Wheeler ===");
        Ford ford = new Ford("Ford EcoSport", "KA05CD4321", "Bob Smith", 110);
        System.out.println("Model Name       : " + ford.getModelName());
        System.out.println("Registration No. : " + ford.getRegistrationNumber());
        System.out.println("Owner Name       : " + ford.getOwnerName());
        System.out.println("Current Speed    : " + ford.speed() + " km/h");
        ford.tempControl();
    }
}