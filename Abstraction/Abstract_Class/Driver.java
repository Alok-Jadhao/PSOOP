abstract class Car {
    abstract void drive();

    // static void fly() {
    //     System.out.println("I'm Flying.");
    // }

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

    // @Override
    // void fly() {
    //     System.out.println("::I'm flying::");
    // }
}

// Concrete class.
class AeroHT extends WagonR {
    public void fly() {
        System.out.println("I can fly.");
    }
}

public class Driver {
    public static void main(String[] args) {
        // Car wagonR = new WagonR();
        // wagonR.drive();
        // wagonR.playMusic();
        // Car.fly();

        Car aeroHT = new AeroHT();
        aeroHT.fly();
    }
}