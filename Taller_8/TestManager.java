package Taller_8;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class TestManager {
    public static void main(String[] args) {
        Manager manager = new Manager("Yojhan", 50000, "IT");
        manager.showDetails();

        Employee employee = new Employee("Juan", 30000);
        employee.showDetails();
    }
}