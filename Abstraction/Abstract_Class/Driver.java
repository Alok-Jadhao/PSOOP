abstract class Car {
    abstract void drive();

    abstract void fly();

    void playMusic() {
        System.out.println("::play music::");
    }
}

abstract class WagonR extends Car {

    @Override
    void drive() {
        System.out.println("::driving::");
    }

}

// Concrete class.
class AeroHT extends WagonR {
    public void fly() {
        System.out.println("I can fly.");
    }
}

public class Driver {
    public static void main(String[] args) {
        Car aeroHT = new AeroHT();
        aeroHT.drive();
        aeroHT.playMusic();
        aeroHT.fly();
    }
}