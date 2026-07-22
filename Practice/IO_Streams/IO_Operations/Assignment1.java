import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to count the number of times a character appears in a File. 
 * 
 * [Note : The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]
 * 
 * Sample Input and Output:
 * Enter the file name
 * Input.txt
 * Enter the character to be counted
 * r
 * File 'Input.txt' has 99 instances of letter 'r'.
 */

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char targetChar = sc.nextLine().charAt(0);

        // Convert target character to lowercase for case-insensitive comparison
        char charToCount = Character.toLowerCase(targetChar);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == charToCount) {
                    count++;
                }
            }

            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}