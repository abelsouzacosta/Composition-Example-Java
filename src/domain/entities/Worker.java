package domain.entities;

import domain.enums.WorkerLevel;

import java.util.Calendar;
import java.util.LinkedList;

public class Worker {
    private final String name;
    private final WorkerLevel level;
    private final double baseSalary;

    private final Department department;

    private LinkedList<Contract> contracts = new LinkedList<>();

    private Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public static Worker createWorker(String name, WorkerLevel level, double baseSalary, Department department) {
        return new Worker(name, level, baseSalary, department);
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

    public LinkedList<Contract> getContracts() {
        return this.contracts;
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(Contract contract) {
        this.contracts.remove(contract);
    }

    // TODO: Refactor method
    public double getWorkerIncome(int year, int month) {
        double result = this.getBaseSalary();
        Calendar calendar = Calendar.getInstance();
        for (Contract contract: this.contracts) {
            calendar.setTime(contract.getDate());
            int calendarYear = calendar.get(Calendar.YEAR);
            int calendarMonth = calendar.get(Calendar.MONTH + 1);

            if (year == calendarYear && month == calendarMonth) {
                result += contract.getTotalValue();
            }
        }

        return result;
    }
}
