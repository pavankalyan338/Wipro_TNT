import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to copy contents from one file to another and check the output.
 * 
 * Sample Input and Output:
 * Enter the input file name
 * Input.txt
 * Enter the output file name
 * Output.txt
 * File is copied.
 */

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFileName = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFileName = sc.nextLine();

        try (FileReader reader = new FileReader(inputFileName);
             FileWriter writer = new FileWriter(outputFileName)) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            System.out.println("File is copied.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}