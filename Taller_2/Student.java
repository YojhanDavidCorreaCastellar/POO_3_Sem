package Taller_2;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        this("Yojhan", 23);
    }

    // Método static con error
    //public static void printStudent() {
      //  System.out.println("Student: " + this.name + ", Age: " + this.age); 
    //
    public static void printStudent() {
        Student student = new Student(); // Crear una instancia de Student
        System.out.println("Student: " + student.name + ", Age: " + student.age);
    }
    
}
