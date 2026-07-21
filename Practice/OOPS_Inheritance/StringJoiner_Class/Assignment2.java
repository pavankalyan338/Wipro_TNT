import java.util.Scanner;
import java.util.StringJoiner;

/*
 * Given two StringJoiners s1 and s2 which contains n city names separated by - (hyphen), display the output for the given cases:
 * 
 * i) s1 merged to s2.
 * ii) s2 merged to s1.
 */

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Setup the first StringJoiner (s1)
        StringJoiner s1 = new StringJoiner("-");
        System.out.print("Enter the number of cities for the first list (s1): ");
        int n1 = sc.nextInt();
        sc.nextLine(); // Consume newline leftover
        
        System.out.println("Enter " + n1 + " city names for s1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("City " + (i + 1) + ": ");
            s1.add(sc.nextLine().trim());
        }

        // 2. Setup the second StringJoiner (s2)
        StringJoiner s2 = new StringJoiner("-");
        System.out.print("\nEnter the number of cities for the second list (s2): ");
        int n2 = sc.nextInt();
        sc.nextLine(); // Consume newline leftover
        
        System.out.println("Enter " + n2 + " city names for s2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("City " + (i + 1) + ": ");
            s2.add(sc.nextLine().trim());
        }

        // Keep copies of the original string representations since merging alters the objects
        String s1Original = s1.toString();
        String s2Original = s2.toString();

        System.out.println("\n=================================");
        System.out.println("         MERGE RESULTS           ");
        System.out.println("=================================");

        // Case i) s1 merged to s2
        // We create a fresh copy of s2 to perform this merge without affecting subsequent logic
        StringJoiner case1 = new StringJoiner("-");
        if (!s2Original.isEmpty()) case1.add(s2Original);
        
        StringJoiner tempS1 = new StringJoiner("-");
        if (!s1Original.isEmpty()) tempS1.add(s1Original);
        
        case1.merge(tempS1);
        System.out.println("i) s1 merged to s2 : " + case1.toString());

        // Case ii) s2 merged to s1
        StringJoiner case2 = new StringJoiner("-");
        if (!s1Original.isEmpty()) case2.add(s1Original);
        
        StringJoiner tempS2 = new StringJoiner("-");
        if (!s2Original.isEmpty()) tempS2.add(s2Original);
        
        case2.merge(tempS2);
        System.out.println("ii) s2 merged to s1 : " + case2.toString());
        System.out.println("=================================");

        sc.close();
    }
}
