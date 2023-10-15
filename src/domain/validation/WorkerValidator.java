package domain.validation;

public class WorkerValidator {
    public static boolean validate(String name, double baseSalary) {
        return !name.isEmpty() && !name.isBlank() && baseSalary > 0;
    }
}
