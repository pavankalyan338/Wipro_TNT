import java.util.ArrayList;
import java.util.List;

/*
 * Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
 */

// Custom class to allow only Number types (Integer, Float, Double, Long, Byte, Short)
class MyNumericList<E extends Number> extends ArrayList<E> {
    // Inherits standard ArrayList methods while restricting type parameters to subclasses of Number
}

public class Assignment4 {
    public static void main(String[] args) {
        // Option 1: Using Wildcard/Bounded Generics with Number
        List<Number> numberList = new MyNumericList<>();

        numberList.add(10);        // Integer
        numberList.add(20.5f);     // Float
        numberList.add(99.99);     // Double
        numberList.add(1000000L);  // Long
        numberList.add((short) 5); // Short

        // Uncommenting the line below will cause a compile-time error:
        // numberList.add("Hello"); // Error: String is not a Number

        System.out.println("Elements stored in the numeric ArrayList:");
        for (Number num : numberList) {
            System.out.println(num + " (" + num.getClass().getSimpleName() + ")");
        }
    }
}