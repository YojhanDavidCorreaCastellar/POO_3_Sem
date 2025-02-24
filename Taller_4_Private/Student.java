package Taller_4_Private;

public class Student {
    // Private properties
    private String name;
    private int age;
    private double average;

    // Constructor
    public Student(String name, int age, double average) {
        setName(name);
        setAge(age);
        setAverage(average);
    }

    // Getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    // Getters and setters for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number between 0 and 100.");
        }
    }

    // Getters and setters for average
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average >= 0 && average <= 5.0) {
            this.average = average;
        } else {
            System.out.println("Average must be between 0 and 5.0.");
        }
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", average=" + average +
                '}';
    }

    public static void main(String[] args) {
        // Test class
        try {
            Student student1 = new Student("John Perez", 20, 4.2);
            System.out.println(student1);

            Student student2 = new Student("Mary Lopez", 22, 3.8);
            System.out.println(student2);

            // Attempt invalid values
            Student student3 = new Student("", -5, 6.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
