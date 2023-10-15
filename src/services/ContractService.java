package services;

import domain.entities.Contract;
import domain.exceptions.InvalidDateContract;
import domain.validation.ContractDateValidator;
import domain.validation.ContractValidator;

import java.util.Date;

public class ContractService {
    public Contract create(Date date, double valuePerHour, int hours) {
        if (ContractValidator.validate(valuePerHour, hours))
            throw new IllegalArgumentException("Value per hour and the number of hours cannot be less than or equal to zero");

        if (ContractDateValidator.validate(date))
            throw new InvalidDateContract();

        return Contract.createContract(date, valuePerHour, hours);
    }

    public static ContractService getInstance() {
        return new ContractService();
    }
}
