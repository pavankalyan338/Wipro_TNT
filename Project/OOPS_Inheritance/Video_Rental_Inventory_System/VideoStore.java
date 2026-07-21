/*
 * 2. VideoStore
 * Member variables
 * • Video[] store;
 * Member functions
 * • void addVideo(String name);
 * • void doCheckout(String name);
 * • void doReturn(String name);
 * • void receiveRating(String name, int rating);
 * • void listInventory();
 */

class VideoStore {
    private Video[] store;
    private int videoCount;

    // Constructor initializing an inventory array capacity
    public VideoStore() {
        store = new Video[10]; // Capacity for 10 videos (can be adjusted)
        videoCount = 0;
    }

    public void addVideo(String name) {
        if (videoCount < store.length) {
            store[videoCount] = new Video(name);
            videoCount++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store inventory is full!");
        }
    }

    public void doCheckout(String name) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found in inventory.");
    }

    public void doReturn(String name) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found in inventory.");
    }

    public void receiveRating(String name, int rating) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found in inventory.");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s | %-20s | %-10s\n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < videoCount; i++) {
            System.out.printf("%-20s | %-20b | %-10d\n", 
                    store[i].getName(), store[i].getCheckout(), store[i].getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}