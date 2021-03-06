package uk.gov.dwp.uc.pairtest.exception;

public class InvalidPurchaseException extends RuntimeException {
    public InvalidPurchaseException(String errorDescription) {
        super(errorDescription);
    }

    public InvalidPurchaseException(String message, Exception exception) {
        super(message, exception);
    }
}
