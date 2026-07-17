package Practice.OOPS_Inheritance.StringJoiner_Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/*
 * Given an ArrayList containing n names, use StringJoiner to construct a new sequence of names separated by , (comma) and enclosed in { } brackets.
 */

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();

        System.out.print("Enter the number of names (n): ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline leftover

        System.out.println("Enter the " + n + " names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            namesList.add(sc.nextLine().trim());
        }

        // Initialize StringJoiner with comma delimiter, prefix '{', and suffix '}'
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        // Using forEach to add elements from the ArrayList into the StringJoiner
        namesList.forEach(sj::add);

        // Display the constructed sequence
        System.out.println("\nOutput: " + sj.toString());

        sc.close();
    }
}