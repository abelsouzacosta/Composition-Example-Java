package domain.entities;

import domain.enums.WorkerLevel;

public class Worker {
    private final String name;
    private final WorkerLevel level;
    private final double baseSalary;

    private Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public static Worker createWorker(String name, WorkerLevel level, double baseSalary) {
        return new Worker(name, level, baseSalary);
    }

    protected String getName() {
        return this.name;
    }

    protected WorkerLevel getLevel() {
        return this.level;
    }

    protected double getBaseSalary() {
        return this.baseSalary;
    }
}
