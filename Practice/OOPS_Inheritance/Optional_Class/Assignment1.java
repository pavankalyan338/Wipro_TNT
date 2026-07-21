import java.util.Optional;

/*
 * Use Optional class and avoid NullPointerException from the below code:
 * 
 * String names[ ] = new String[5];
 * System.out.print(names[0].length( ));
 */

public class Assignment1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        
        // Optional.ofNullable allows the object to be safely evaluated even if it is null
        Optional<String> checkName = Optional.ofNullable(names[0]);
        
        // Check if a value is present before executing logic
        if (checkName.isPresent()) {
            System.out.print(checkName.get().length());
        } else {
            System.out.println("Value is not present to calculate the length.");
        }
    }
}
