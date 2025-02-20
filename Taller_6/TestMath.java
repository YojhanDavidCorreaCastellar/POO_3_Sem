package Taller_6;

class Mathematics {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed. Returning 0 as default.");
            return 0;
        }
        return a / b;
    }
}

public class TestMath {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int c = 0; // Example for division by zero

        System.out.println("Addition: " + Mathematics.add(a, b));
        System.out.println("Subtraction: " + Mathematics.subtract(a, b));
        System.out.println("Multiplication: " + Mathematics.multiply(a, b));

        System.out.println("Division: " + Mathematics.divide(a, b));
        System.out.println("Division by zero test: " + Mathematics.divide(a, c));
    }
}
