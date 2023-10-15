package services;

import domain.entities.Worker;
import domain.enums.WorkerLevel;
import domain.validation.WorkerValidator;
import sharedKernel.WorkerLevelValidator;

public class WorkerService {
    public Worker create(String name, WorkerLevel level, double baseSalary) {
        if (!WorkerLevelValidator.isWorkerLevelValid(level))
            throw new IllegalArgumentException("Please provide an appropriate worker level");

        if (WorkerValidator.validate(name, baseSalary))
            throw new IllegalArgumentException("Please provide a name for the worker");

        return Worker.createWorker(name, level, baseSalary);
    }
}
