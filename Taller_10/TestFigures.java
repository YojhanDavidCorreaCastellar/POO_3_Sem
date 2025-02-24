package Taller_10;

abstract class Shape {

    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }
}

public class TestFigures {
    public static void main(String[] args) {
        // Instantiating objects of Rectangle and Triangle
        Rectangle rectangle = new Rectangle(5, 3);
        Triangle triangle = new Triangle(4, 6);

        // Displaying the areas of the shapes
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the triangle: " + triangle.calculateArea());
    }
}