import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Given an ArrayList containing 10 words, write a program to reverse each word and 
 * update the same ArrayList , with the help of Consumer.
 */

public class Assignment6 {
    public static void main(String[] args) {
        // Creating an ArrayList containing 10 words
        List<String> words = new ArrayList<>(Arrays.asList(
            "apple", "banana", "cherry", "date", "elderberry",
            "fig", "grape", "honeydew", "kiwi", "lemon"
        ));

        System.out.println("Original List: " + words);

        // Consumer to reverse a word and update it in the same list at its index
        Consumer<List<String>> reverseWordsConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        // Applying Consumer to update the original ArrayList
        reverseWordsConsumer.accept(words);

        // Displaying the updated list
        System.out.println("\nUpdated List (Reversed Words): " + words);
    }
}