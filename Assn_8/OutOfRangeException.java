package Assn_8;

public class OutOfRangeException extends Exception {
    private final String errorMessage;
    public OutOfRangeException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String toString() {
        return errorMessage;
    }
}
