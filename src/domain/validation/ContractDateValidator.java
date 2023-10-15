package domain.validation;

import java.util.Date;

public class ContractDateValidator {
    public static boolean validate(Date date) {
        return date != null && date.after(new Date());
    }
}
