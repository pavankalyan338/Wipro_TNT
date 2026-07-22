import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 * Set of Boxes Problem Statement :
 * Write a Program to insert the box details into the set.
 * 
 * Problem Constraints:
 * Create a Box Class and its attributes are length (Double), width (Double) and height (Double).
 * Get the Box details from the user and insert it to the Set.
 * We need to store the details of boxes with different volumes.
 * When the volume of a new box is the same as the volumes of a previous box included in the Set,
 * don't insert this box in the Set. The Box is said to be same when their volumes are equal.
 * Override the equals method to compare the box volumes.
 */

class Box {
    private double length;
    private double width;
    private double height;
    private double volume;

    public Box() {
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        // Calculating volume
        this.volume = length * width * height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    // Override equals to consider two boxes equal if their volumes are equal (rounded to 2 decimal places)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Math.abs(this.volume - box.volume) < 0.001;
    }

    @Override
    public int hashCode() {
        // Hash code based on volume rounded to 2 decimal places
        return Objects.hash(Math.round(this.volume * 100.0) / 100.0);
    }
}

public class Project5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // LinkedHashSet maintains insertion order while removing duplicates based on volume
        Set<Box> boxSet = new LinkedHashSet<>();

        System.out.println("Enter the number of Box");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.println("Enter Length");
            double length = scanner.nextDouble();

            System.out.println("Enter Width");
            double width = scanner.nextDouble();

            System.out.println("Enter Height");
            double height = scanner.nextDouble();

            Box box = new Box(length, width, height);
            boxSet.add(box);
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f\n",
                    box.getLength(),
                    box.getWidth(),
                    box.getHeight(),
                    box.getVolume());
        }

        scanner.close();
    }
}