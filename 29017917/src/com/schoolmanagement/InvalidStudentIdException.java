package com.schoolmanagement;

public class InvalidStudentIdException extends Exception{
    public InvalidStudentIdException(String message) {
        super(message);
    }
}
