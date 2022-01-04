package ru.itsjava.exceptions;

public class AgeNotValidException extends Exception{
    public AgeNotValidException() {
    }

    public AgeNotValidException(String message) {
        super(message);
    }

    public AgeNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeNotValidException(Throwable cause) {
        super(cause);
    }

    public AgeNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
