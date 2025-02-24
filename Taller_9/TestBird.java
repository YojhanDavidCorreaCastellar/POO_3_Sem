package Taller_9;

class Interfaces {

    public interface Flying {
        void fly();
    }

    public interface Singer {
        void sing();
    }
}

class Bird implements Interfaces.Flying, Interfaces.Singer {
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void sing() {
        System.out.println("The bird is singing.");
    }
}

public class TestBird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        
        bird.fly();
        bird.sing();
    }
}


