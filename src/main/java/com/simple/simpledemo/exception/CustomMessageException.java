package com.simple.simpledemo.exception;

public class CustomMessageException extends RuntimeException {
    public CustomMessageException() {
        super();
    }

    public CustomMessageException(String message) {
        super(message);
    }

    public CustomMessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomMessageException(Throwable cause) {
        super(cause);
    }

    protected CustomMessageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
