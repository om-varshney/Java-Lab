package Assn_8;

public class NOMATCHEXCP extends Exception {
    private final String errorMessage;
    private final String userInput;

    public NOMATCHEXCP(String errorMessage, String userInput) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.userInput = userInput;
    }

    public String toString() {
        return errorMessage + " happened because of user input " + this.userInput +
                "\nat line number " + this.getStackTrace()[0].getLineNumber();
    }
}
