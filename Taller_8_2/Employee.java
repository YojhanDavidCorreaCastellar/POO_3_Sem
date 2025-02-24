package Taller_8_2;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Employee extends Person {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + ", Department: " + department;
    }

    public static void main(String[] args) {
        Person person = new Person("Ana", 30);
        Employee employee = new Employee("Carlos", 40, "Human Resources");

        System.out.println(person.showDetails());  
        System.out.println(employee.showDetails());
    }
}
