import java.util.ArrayList;

/*
 * Create an ArrayList al and add 10 different words.
 * Write a code to print all the Strings whose length is odd, using lambda expression.
 */

public class Assignment3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Adding 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Date");
        al.add("Elderberry");
        al.add("Fig");
        al.add("Grape");
        al.add("Honeydew");
        al.add("Kiwi");
        al.add("Lemon");

        System.out.println("Original Words: " + al);
        System.out.println("\nWords with odd length:");

        // Using Lambda Expression with forEach to print strings with odd length
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word + " (Length: " + word.length() + ")");
            }
        });
    }
}