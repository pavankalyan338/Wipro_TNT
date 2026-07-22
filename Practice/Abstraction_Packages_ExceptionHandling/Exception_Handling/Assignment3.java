import java.util.Scanner;

/*
 * Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. 
 * The name of the students and marks in 3 subjects are taken from the user while executing the program.
 * 
 * In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100).
 */

// Custom Exception for Negative Values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom Exception for Values Out of Range (outside 0-100)
class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException(String message) {
        super(message);
    }
}

public class Assignment3 {

    // Helper method to validate marks
    public static int parseAndValidateMark(String inputStr) throws NegativeValueException, ValueOutOfRangeException {
        int mark = Integer.parseInt(inputStr); // May throw NumberFormatException

        if (mark < 0) {
            throw new NegativeValueException("NegativeValueException: Marks cannot be negative (" + mark + ").");
        }
        if (mark > 100) {
            throw new ValueOutOfRangeException("ValueOutOfRangeException: Marks should be in range 0-100 (" + mark + ").");
        }

        return mark;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("--- Enter Details for Student " + i + " ---");
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                int sum = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.print("Enter mark for Subject " + j + ": ");
                    String markStr = sc.nextLine();
                    
                    int mark = parseAndValidateMark(markStr);
                    sum += mark;
                }

                double average = (double) sum / 3.0;
                System.out.println("Student Name: " + name);
                System.out.println("Average Marks: " + average + "\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integer values for marks.");
        } catch (NegativeValueException | ValueOutOfRangeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}