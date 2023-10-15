package domain.entities;

public class Department {
    private final String name;

    private Department(String name) {
        this.name = name;
    }

    protected static Department createDepartment(String name) {
        return new Department(name);
    }

    protected String getName() {
        return this.name;
    }
}
