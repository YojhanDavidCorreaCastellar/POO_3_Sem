package Taller_3.products.Vehicles;

public class Moto extends Vehicle { 
    public Moto(String brand) { 
        super(brand);
    }

    public void showInformation() {
        System.out.println("Brand: " + brand);
    }
}