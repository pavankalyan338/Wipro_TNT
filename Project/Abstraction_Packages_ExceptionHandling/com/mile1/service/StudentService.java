package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    // Counts number of objects with null marks array
    public int findNumberOfNullMarksArray(Student[] s) {
        int count = 0;
        if (s != null) {
            for (Student student : s) {
                if (student != null && student.getMarks() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    // Counts number of objects with null name
    public int findNumberOfNullName(Student[] s) {
        int count = 0;
        if (s != null) {
            for (Student student : s) {
                if (student != null && student.getName() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    // Counts number of null student objects in array
    public int findNumberOfNullObjects(Student[] s) {
        int count = 0;
        if (s != null) {
            for (Student student : s) {
                if (student == null) {
                    count++;
                }
            }
        }
        return count;
    }
}