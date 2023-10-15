package services;

import domain.entities.Contract;
import domain.entities.Department;
import domain.entities.Worker;
import domain.enums.WorkerLevel;
import domain.validation.WorkerValidator;
import sharedKernel.WorkerLevelValidator;

public class WorkerService {
    public Worker create(String name, WorkerLevel level, double baseSalary, Department department) {
        if (!WorkerLevelValidator.isWorkerLevelValid(level))
            throw new IllegalArgumentException("Please provide an appropriate worker level");

        if (WorkerValidator.validate(name, baseSalary))
            throw new IllegalArgumentException("Please provide a name for the worker");

        return Worker.createWorker(name, level, baseSalary, department);
    }

    public double income(Worker worker, int year, int month) {
        return worker.getWorkerIncome(year, month);
    }

    public void addContract(Worker worker, Contract contract) {
        worker.addContract(contract);
    }

    public void removeContract(Worker worker, Contract contract) {
        worker.removeContract(contract);
    }

    public static WorkerService getInstance() {
        return new WorkerService();
    }
}
