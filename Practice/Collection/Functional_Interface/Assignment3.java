import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Given an ArrayList containing 10 words, write a program to filter the words 
 * which are palindrome, with the help of Predicate.
 */

public class Assignment3 {

    // Helper method to check if a word is a palindrome
    private static boolean isPalindrome(String word) {
        if (word == null) return false;
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        // Creating an ArrayList containing 10 words
        List<String> words = new ArrayList<>(Arrays.asList(
            "madam", "hello", "racecar", "java", "level", 
            "world", "radar", "noon", "stream", "refer"
        ));

        System.out.println("Original Words: " + words);

        // Predicate to test whether a word is a palindrome using Method Reference
        Predicate<String> palindromePredicate = Assignment3::isPalindrome;

        System.out.println("\nPalindrome Words:");
        
        // Filtering and printing palindrome words using the Predicate
        words.stream()
             .filter(palindromePredicate)
             .forEach(System.out::println);
    }
}