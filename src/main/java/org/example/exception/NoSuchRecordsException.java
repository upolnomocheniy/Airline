package org.example.exception;

public class NoSuchRecordsException extends RuntimeException{
    public NoSuchRecordsException(String message) {
        super(message);
    }
}
