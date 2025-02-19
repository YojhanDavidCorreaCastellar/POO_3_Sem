package Taller_1;
public class Student {
    String name;
    int age;
    String course;

    public Student() {
        this.name = "John Gómez";
        this.age = 20;
        this.course = "System Engineer";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String course) {
        this(name, age);
        this.name = name;
        this.course = course;

    }
}
