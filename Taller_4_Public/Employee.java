package Taller_4_Public;

public class Employee {
    public String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }
}

class TestEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jaber Vargas", 3500.0);
        System.out.println(employee1);

        Employee employee2 = new Employee("Adrián Orozco", 4200.0);
        System.out.println(employee2);

        employee1.setSalary(-500.0);
        System.out.println("After attempting an invalid salary: " + employee1);

        employee2.name = "Fray Martinez";
        System.out.println("After changing the name: " + employee2);
    }
}
