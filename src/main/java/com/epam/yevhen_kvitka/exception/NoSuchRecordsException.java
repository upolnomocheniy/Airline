package com.epam.yevhen_kvitka.exception;

public class NoSuchRecordsException extends RuntimeException{
    public NoSuchRecordsException(String message) {
        super(message);
    }
}
