package domain.exceptions;

public class InvalidDateContract extends RuntimeException {
    public InvalidDateContract() {
        super("Invalid Date given to Contract");
    }
}
