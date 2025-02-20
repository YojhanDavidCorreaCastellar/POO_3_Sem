package Taller_6;

class Car  {
    private String brand;
    private String model;   
    static int carCount = 0;

    public Car(){
        carCount++;
    }

    public static void showCounter() {
        System.out.println("Total cars: " + carCount);
    }
}

public class Car_Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Car.showCounter();
    }
}
