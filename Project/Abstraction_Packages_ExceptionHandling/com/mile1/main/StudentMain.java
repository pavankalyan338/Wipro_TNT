package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student[] data = new Student[4];

    public StudentMain() {
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        new StudentMain();
        StudentReport studentReport = new StudentReport();

        System.out.println("--- Validation and Grade Calculation ---");
        for (int i = 0; i < data.length; i++) {
            try {
                String validationResult = studentReport.validate(data[i]);
                if ("VALID".equalsIgnoreCase(validationResult)) {
                    String grade = studentReport.findGrades(data[i]);
                    data[i].setGrade(grade);
                    System.out.println("Student [" + i + "] Name: " + data[i].getName() + " | Grade: " + grade);
                }
            } catch (NullStudentObjectException | NullNameException | NullMarksArrayException e) {
                System.out.println("Exception at data[" + i + "]: " + e.toString());
            }
        }

        System.out.println("\n--- Summary Statistics ---");
        StudentService studentService = new StudentService();

        System.out.println("Number of objects with Null Marks Array : " + studentService.findNumberOfNullMarksArray(data));
        System.out.println("Number of objects with Null Name        : " + studentService.findNumberOfNullName(data));
        System.out.println("Number of Null Student Objects          : " + studentService.findNumberOfNullObjects(data));
    }
}