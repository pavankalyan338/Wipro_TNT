/*
 * 1. Video
 * Member variables
 * • String videoName
 * • boolean checkout
 * • int rating
 * Member functions
 * • String getName();
 * • void doCheckout();
 * • void doReturn();
 * • void receiveRating(int rating);
 * • int getRating();
 * • boolean getCheckout();
 * Constructor
 * • Video(String name)
 */

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    public Video(String name) {
        this.videoName = name;
        this.checkout = false; // Initially not checked out
        this.rating = 0;       // Default rating
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}