package ui;

import domain.entities.Department;
import domain.entities.Worker;
import domain.enums.WorkerLevel;
import services.ContractService;
import services.DepartmentService;
import services.WorkerService;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void bootstrap(ContractService contractService, DepartmentService departmentService, WorkerService workerService) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do departamento: ");
        String departmentName = scanner.nextLine();
        Department department = departmentService.create(departmentName);

        System.out.println("Digite o nome do empregado: ");
        String workerName = scanner.nextLine();
        System.out.println("Grau de senioridade do empregado: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scanner.nextLine());
        System.out.println("Digite o salário base do empregado: ");
        double baseSalary = scanner.nextDouble();
        Worker worker = workerService.create(workerName, workerLevel, baseSalary, department);



        scanner.close();
    }
}
