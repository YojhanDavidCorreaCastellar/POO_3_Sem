package Taller_7;

abstract class Employee {

    private String name;
    private int hoursWorked;
    private double salary;

    public Employee(String name, int hoursWorked, double salary) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    abstract double calculateSalary();

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    public Manager(String name, int hoursWorked, double salary) {
        super(name, hoursWorked, salary);
    }

    @Override
    double calculateSalary() {
        return getHoursWorked() * getSalary();
    }
}

class Seller extends Employee {
    public Seller(String name, int hoursWorked, double salary) {
        super(name, hoursWorked, salary);
    }

    @Override
    double calculateSalary() {
        return getHoursWorked() * getSalary();
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Yojhan", 40, 50000) {
            @Override
            double calculateSalary() {
                return getHoursWorked() * getSalary();
            }

            //NO SE PUEDE INSTANCIAR LA CLASE EMPLOYEE PORQUE ES ABSTRACTA
            //POR LO TANTO NO SE PUEDE CREAR UN OBJETO DE UNA CLASE ABSTRACTA
            //EJEMPLO USO INCORRECTO
        };

        Employee manager = new Manager("Leidy", 40, 50000);
        manager.showDetails();

        Employee seller = new Seller("Jaber", 40, 90000);
        seller.showDetails();
    }
}
