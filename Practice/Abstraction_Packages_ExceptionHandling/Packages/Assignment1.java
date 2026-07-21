import test.Foundation;

/*
 * Import this class and packages in another class. 
 * Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.
 */

public class Assignment1 {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();

        // System.out.println(foundation.var1); // Compile Error: var1 has private access in Foundation
        // System.out.println(foundation.var2); // Compile Error: var2 is not public in Foundation; cannot be accessed from outside package
        // System.out.println(foundation.var3); // Compile Error: var3 has protected access in Foundation (accessible only via inheritance in outside package)
        
        System.out.println("Accessing public variable var4: " + foundation.var4); // Accessible

        System.out.println("\nAccess Control Summary from outside package:");
        System.out.println("var1 (private)   : NOT Accessible");
        System.out.println("var2 (default)   : NOT Accessible");
        System.out.println("var3 (protected) : NOT Accessible (without subclassing)");
        System.out.println("var4 (public)    : Accessible");
    }
}