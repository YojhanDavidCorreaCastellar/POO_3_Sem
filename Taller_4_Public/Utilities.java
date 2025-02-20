package Taller_4_Public;

class Utilities {
    public static double add(double a, double b) {
        return a + b;
    }


    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }
}

class TestUtilities {
    public static void main(String[] args) {
        
        System.out.println("Suma: 5 + 3 = " + Utilities.add(5, 3));
        System.out.println("Resta: 10 - 4 = " + Utilities.subtract(10, 4));
        System.out.println("Multiplicación: 6 * 7 = " + Utilities.multiply(6, 7));
        System.out.println("División: 8 / 2 = " + Utilities.divide(8, 2));

        // Probando división por cero
        System.out.println("División: 8 / 0 = " + Utilities.divide(8, 0));
    }
}