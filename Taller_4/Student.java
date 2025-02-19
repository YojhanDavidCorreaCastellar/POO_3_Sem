package Taller_4;

public class Student {
    
    private String name;
    private int age;
    private double average;

    //SETTERS

    public void setName(String name) {
        this.name = name;
        if (name.isEmpty()) {
            System.out.println("Please enter a name.");
        }
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Invalid age. Age should be between 0 and 100.");
        } else {
            this.age = age;
        }
    }

    public void setAverage(double average) {
        if (average < 0 || average > 5.0) {
            System.out.println("Invalid average. Average should be between 0 and 5.0");
        } else {
            this.average = average;
        }
    }

    //GETTERS

    public void getName(String name) {
        this.name = name;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public void getAverage(double average) {
        this.average = average;
    }

    
    
}
