package Taller_8;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int tuition;

    public Student(String name, int age, int tuition) {
        super(name, age);
        this.tuition = tuition;
    }

    public int getTuition() {
        return tuition;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Tuition: " + getTuition());
    }
}

public class TestStudents {
    public static void main(String[] args) {
        Student student = new Student("Juan", 20, 30654);
        student.showInfo();
    }
}
