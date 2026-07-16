/*
 * Write a program to receive a number and print the corresponding month name.
 *
 * Example1)
 * C:\>java Sample 12
 * O/P Expected : December
 *
 * Example2)
 * C:\>java Sample 
 * O/P Expected : Please enter the month in numbers
 *
 * Example3)
 * C:\>java Sample 15
 * O/P Expected : Invalid month
 */

public class Assignment9 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length == 0) {
            System.out.println("Please enter the month in numbers");
        } else {
            try {
                // Parse the string argument into an integer
                int month = Integer.parseInt(args[0]);
                
                // Use a switch statement to print the corresponding month
                switch (month) {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                    default:
                        // If the number is outside the 1-12 range
                        System.out.println("Invalid month");
                        break;
                }
            } catch (NumberFormatException e) {
                // If the user inputs a letter or word instead of a number
                System.out.println("Please enter the month in numbers");
            }
        }
    }
}