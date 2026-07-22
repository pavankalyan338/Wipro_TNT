import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Operations on String List
 * Write a Program to perform the basic operations like insert, delete, display and search in list.
 * List contains String object items where these operations are to be performed.
 */

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String itemToInsert = scanner.nextLine();
                    list.add(itemToInsert);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter the item to search : ");
                    String itemToSearch = scanner.nextLine();
                    if (list.contains(itemToSearch)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the item to delete : ");
                    String itemToDelete = scanner.nextLine();
                    if (list.remove(itemToDelete)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    System.out.println("The Items in the list are :");
                    for (String item : list) {
                        System.out.println(item);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 5.");
            }
        }
    }
}