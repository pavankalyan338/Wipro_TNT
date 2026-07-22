package com.mile1.exception;

/*
 * Custom Exception thrown when the marks array inside a Student object is null.
 */
public class NullMarksArrayException extends Exception {
    @Override
    public String toString() {
        return "mark array is null";
    }
}