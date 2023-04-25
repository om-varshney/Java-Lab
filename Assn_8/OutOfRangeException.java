/*
This exception ensures that while calculating factorial, the input is positive and less than 15.
*/

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
