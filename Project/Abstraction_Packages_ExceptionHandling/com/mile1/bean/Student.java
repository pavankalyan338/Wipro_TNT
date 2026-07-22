package com.mile1.bean;

/*
 * Package 1: com.mile1.bean
 * Class Student
 * Variables:
 * - String name
 * - int marks[]
 * - String grade
 */

public class Student {
    private String name;
    private int[] marks;
    private String grade;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Constructor with grade, marks, and name
    public Student(String grade, int[] marks, String name) {
        this.grade = grade;
        this.marks = marks;
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}