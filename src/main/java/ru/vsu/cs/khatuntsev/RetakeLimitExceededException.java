package ru.vsu.cs.khatuntsev;

public class RetakeLimitExceededException extends RuntimeException {
    public RetakeLimitExceededException(String message) {
        super(message);
    }
}
