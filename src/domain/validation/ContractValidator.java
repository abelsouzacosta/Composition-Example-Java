package domain.validation;

public class ContractValidator {
    public static boolean validate(double valuePerHour, int hours) {
        return valuePerHour > 0 && hours > 0;
    }
}
