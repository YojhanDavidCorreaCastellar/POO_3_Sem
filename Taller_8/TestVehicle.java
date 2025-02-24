package Taller_8;

class Vehicle {
    private String brand;
    private double maxVelocity;

    public Vehicle(String brand, double maxVelocity) {
        this.brand = brand;
        this.maxVelocity = maxVelocity;
    }

    public String getBrand() {
        return brand;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max velocity: " + maxVelocity);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, double maxVelocity, int doors) {
        super(brand, maxVelocity);
        this.doors = doors;
    }

    @Override
    public void showInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Max velocity: " + getMaxVelocity());
        System.out.println("Doors: " + doors);
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 200, 4);
        car.showInfo();
    }
}
