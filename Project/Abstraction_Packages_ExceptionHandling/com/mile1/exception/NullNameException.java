package com.mile1.exception;

/*
 * Custom Exception thrown when the student name is null.
 */
public class NullNameException extends Exception {
    @Override
    public String toString() {
        return "name is null";
    }
}