package com.mile1.exception;

/*
 * Custom Exception thrown when the Student object itself is null.
 */
public class NullStudentObjectException extends Exception {
    @Override
    public String toString() {
        return "object is null";
    }
}