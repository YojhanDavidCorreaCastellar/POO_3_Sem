package Taller_5;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {

    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override

    public void showInfo() {
        super.showInfo();
        System.out.println("Department: " + department);
    }
}

public class Employe_Manager {
    public static void main(String[] args) {

        Manager manager = new Manager("Jaber Vargas", 50000.0, "Finance");
        manager.showInfo();

        System.out.println("");

        Employee employee = new Employee("Yojhan Correa", 30000.0);
        employee.showInfo();
    }
}