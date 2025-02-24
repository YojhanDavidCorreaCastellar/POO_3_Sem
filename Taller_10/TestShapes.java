package Taller_10;

// Abstract class with a default method
abstract class Shape {
    // Abstract method
    abstract double calculateArea();

    // Default method
    public double calculatePerimeter() {
        // Attempt to define a default method
        System.out.println("Calculating the perimeter.");
        return 0.0;
    }
}

// Rectangle class that extends Shape
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

// Test class
public class TestShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        // Attempt to use the default method
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}
