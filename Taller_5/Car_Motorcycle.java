package Taller_5;

class Car {
    protected String type;
    protected String brand;

    public Car(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

}

class Motorcycle extends Car{
    
    private String displacement;

    public Motorcycle(String type, String brand, String displacement) {
        super(type, brand);
        this.displacement = displacement;
    }

    
}

//class TestAccess {
   // public static void main(String[] args) {
     //   Car car = new Car("Picanto", "Kia");

        // Intento de acceder a los miembros protegidos desde una clase o paquete diferente
        // ERROR
       // System.out.println("Type: " + car.type);
        //System.out.println("Brand: " + car.brand);
  //  }
//}

