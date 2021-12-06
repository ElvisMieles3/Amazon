package com.amazon.certification.exceptions;

public class NoStock extends AssertionError{

    public NoStock(String message, Throwable cause) {
        super(message, cause);
    }
}
