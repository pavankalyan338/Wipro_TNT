import java.util.ArrayList;
import java.util.List;

/*
 * Create a Student class with
 * 1. Instance variables: rollNo, name, mark.
 * 2. A parameterized constructor to initialize them.
 * 
 * Write a program
 * 1. To add five Student objects into an ArrayList ,
 * 2. Filter the Student objects who have cleared the test with minimum 50 marks,
 * 3. Get the count of how many have cleared and print it.
 */

class Student {
    private int rollNo;
    private String name;
    private int mark;

    // Parameterized constructor
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    // Getter for mark
    public int getMark() {
        return mark;
    }

    // toString method to print student details
    @Override
    public String toString() {
        return "Student [RollNo=" + rollNo + ", Name=" + name + ", Mark=" + mark + "]";
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        // 1. Adding five Student objects into an ArrayList
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Rahul", 45));
        studentList.add(new Student(2, "Priya", 78));
        studentList.add(new Student(3, "Amit", 50));
        studentList.add(new Student(4, "Neha", 32));
        studentList.add(new Student(5, "Suresh", 89));

        // 2. Filter students with minimum 50 marks and 3. Get the count
        long clearedCount = studentList.stream()
                .filter(student -> student.getMark() >= 50)
                .count();

        // Print details of students who cleared
        System.out.println("--- Students Who Cleared (>= 50 Marks) ---");
        studentList.stream()
                .filter(student -> student.getMark() >= 50)
                .forEach(System.out::println);

        // Print the count
        System.out.println("\nTotal students who cleared the test: " + clearedCount);
    }
}