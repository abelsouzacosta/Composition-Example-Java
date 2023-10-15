package services;

import domain.entities.Department;

public class DepartmentService {
    public Department create(String name) {
        if (name.isBlank() || name.isEmpty())
            throw new IllegalArgumentException("Please provide an valid name for the Department");
        return Department.createDepartment(name);
    }
}
