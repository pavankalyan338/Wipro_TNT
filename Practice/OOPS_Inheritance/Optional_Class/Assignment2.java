package Practice.OOPS_Inheritance.Optional_Class;

import java.util.Scanner;
import java.util.Optional;

/*
 * Given a String address, print the address if it is not null or else print the default address as "India".
 */

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select input option:");
        System.out.println("1. Enter a custom address");
        System.out.println("2. Simulate a null address");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline leftover
        
        String address = null;
        
        if (choice == 1) {
            System.out.print("Enter the address: ");
            address = sc.nextLine();
            // Handle empty strings as null to properly demonstrate the fallback logic
            if (address.trim().isEmpty()) {
                address = null;
            }
        }
        
        // Wrap the address in an Optional container
        Optional<String> addressOptional = Optional.ofNullable(address);
        
        // Use orElse to fall back to the default value "India" if address is null
        String finalAddress = addressOptional.orElse("India");
        
        System.out.println("Output: " + finalAddress);
        
        sc.close();
    }
}