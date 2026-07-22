package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // Calculates grade based on marks
    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();

        // Check if any mark is less than 35
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        // Calculate sum of marks
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        // Determine grade based on total sum
        if (sum < 150) {
            return "C";
        } else if (sum < 200) {
            return "B";
        } else if (sum < 250) {
            return "A";
        } else {
            return "A+";
        }
    }

    // Validates Student object for null values
    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) {
            throw new NullStudentObjectException();
        } else {
            if (s.getName() == null) {
                throw new NullNameException();
            } else if (s.getMarks() == null) {
                throw new NullMarksArrayException();
            } else {
                return "VALID";
            }
        }
    }
}