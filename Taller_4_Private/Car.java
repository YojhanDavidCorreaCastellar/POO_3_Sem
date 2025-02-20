package Taller_4_Private;

public class Car {
    // Private properties
    private String brand;
    private String model;
    private int maxSpeed;

    // Constructor
    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        setMaxSpeed(maxSpeed);
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Brand cannot be empty.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Model cannot be empty.");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Max speed must be positive.");
        }
    }

    // Method to accelerate
    public void accelerate(int increment) {
        if (increment > 0) {
            maxSpeed += increment;
        } else {
            System.out.println("Increment must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", maxSpeed=" + maxSpeed +
               '}';
    }

    public static void main(String[] args) {
        // Test class
        try {
            Car car = new Car("Toyota", "Corolla", 180);
            System.out.println(car);

            car.accelerate(20);
            System.out.println("After acceleration: " + car);

            // Attempt invalid operations
            car.accelerate(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Attempt to access private properties directly (will cause errors if uncommented)
        // car.brand = "Ford";  // Uncomment to observe compilation error
        // car.model = "Focus"; // Uncomment to observe compilation error
        // car.maxSpeed = 200;  // Uncomment to observe compilation error
    }
}