import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

/*
 * Create a test class to test the methods available in all these child class.
 */

public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("=== Testing Hero Two-Wheeler ===");
        Hero hero = new Hero("Hero Splendor", "AP16AB1234", "John Doe", 60);
        System.out.println("Model Name         : " + hero.getModelName());
        System.out.println("Registration No.   : " + hero.getRegistrationNumber());
        System.out.println("Owner Name         : " + hero.getOwnerName());
        System.out.println("Current Speed      : " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println("\n=== Testing Honda Two-Wheeler ===");
        Honda honda = new Honda("Honda Activa", "AP16CD5678", "Jane Smith", 75);
        System.out.println("Model Name         : " + honda.getModelName());
        System.out.println("Registration No.   : " + honda.getRegistrationNumber());
        System.out.println("Owner Name         : " + honda.getOwnerName());
        System.out.println("Current Speed      : " + honda.getSpeed() + " km/h");
        honda.cdplayer();
    }
}