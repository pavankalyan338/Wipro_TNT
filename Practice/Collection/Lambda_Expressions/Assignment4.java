/*
 * Create an interface WordCount with a single abstract method int count(String str), 
 * to count and return the no of words in the given String. 
 * Implement count method using Lambda expression in another class MyClassWithLambda.
 * Invoke it to display the result on the console.
 */

@FunctionalInterface
interface WordCount {
    int count(String str);
}

public class Assignment4 {
    public static void main(String[] args) {
        // Implementing the count method using Lambda Expression
        WordCount wordCounter = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            // Split by whitespace to count words
            String[] words = str.trim().split("\\s+");
            return words.length;
        };

        // Test string
        String testString = "Welcome to Java Full Stack Learning";

        // Invoking the method and displaying the result
        int totalWords = wordCounter.count(testString);
        System.out.println("Given String: \"" + testString + "\"");
        System.out.println("Total Word Count: " + totalWords);
    }
}