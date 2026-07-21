import java.util.Scanner;

/*
 * 3. VideoLauncher / Assignment1
 * Contains the main method to test the program functionality via a continuous text menu layout.
 */

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nMAIN MENU =========");
            System.out.println("1. Add Videos :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6) : ");
            
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline leftover

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add : ");
                    String addName = sc.nextLine();
                    store.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out : ");
                    String checkoutName = sc.nextLine();
                    store.doCheckout(checkoutName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return : ");
                    String returnName = sc.nextLine();
                    store.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate : ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating for this video : ");
                    int rating = sc.nextInt();
                    store.receiveRating(rateName, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid Selection. Try again.");
            }
        }
        sc.close();
    }
}
