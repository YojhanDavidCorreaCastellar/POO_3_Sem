package Taller_9;

class Interfaces {
    public interface Swimmer {
        void swim();
    }

    public interface Respirator {
        void breathe();
    }
}

class Fish implements Interfaces.Swimmer, Interfaces.Respirator {
    
    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }

    @Override
    public void breathe() {
        System.out.println("The fish is breathing.");
    }
}

public class TestSwimmer {
    public static void main(String[] args) {
        Fish fish = new Fish();
        
        fish.swim();
        fish.breathe();
    }
}