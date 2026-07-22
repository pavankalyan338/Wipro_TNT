import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/*
 * Write a program to count the occurrences of each word in an input file and write the word along with its corresponding count in an output file.
 * 
 * [Note: The words should be sorted alphabetically in the output file]
 * 
 * (Hint : Consider using Map Collection)
 * 
 * For Example, let's assume the following are the contents of inputFile.txt
 * 
 * Manoj works at Wipro
 * Katari works at Wipro
 * Sureka works at Wipro
 * Harish works at Wipro
 * Anitha works at Wipro
 * Janani works at Wipro
 * 
 * D:\>Java FileWordCount inputFile.txt outputFile.txt
 * 
 * After Execution of the program the contents of outputFile.txt should be as below
 * 
 * Anitha : 1
 * Harish : 1
 * Janani : 1
 * Katari : 1
 * Manoj : 1
 * Sureka : 1
 * Wipro : 6
 * at : 6
 * works : 6
 */

public class Assignment3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide input and output file names as command line arguments.");
            System.out.println("Usage: java Assignment3 inputFile.txt outputFile.txt");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        // TreeMap automatically stores keys in natural (alphabetical) sorted order
        Map<String, Integer> wordCounts = new TreeMap<>();

        // Reading words from input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split line into words using whitespace
                String[] words = line.trim().split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Writing sorted word counts to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Word count processing completed successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}