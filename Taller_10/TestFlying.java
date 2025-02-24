package Taller_10;

interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}


class Duck implements Flyer, Swimmer {
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }
}

public class TestFlying {
    public static void main(String[] args) {
        Duck duck = new Duck();
        
        duck.fly();
        duck.swim();
    }
}
