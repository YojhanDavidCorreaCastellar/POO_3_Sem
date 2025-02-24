package Taller_9;

interface Swimmer {
    void swim();
}

// Clase Vehículo que intenta implementar la interfaz Nadador sin tener lógica relevante
public class Vehicle implements Swimmer {
    @Override
    public void swim() {
        //Implementación no relevante para un vehículo
        System.out.println("This vehicle is not meant to swim.");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.swim();
    }
}
