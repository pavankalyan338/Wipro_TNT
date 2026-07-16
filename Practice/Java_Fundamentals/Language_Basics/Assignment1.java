/*Write a Program that accepts two Strings as command line arguments and generate the output in the required format.

Example1)If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai

[Note: It is mandatory to pass two arguments in command line] */


public class Assignment1 {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length == 2) {
            String company = args[0];
            String location = args[1];
            
            // Generate the output in the required format
            System.out.println(company + " Technologies " + location);
        } else {
            System.out.println("Error: It is mandatory to pass exactly two arguments in the command line.");
        }
    }
}