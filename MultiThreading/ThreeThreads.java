// package MultiThreading;

/*
Write a Java program that implements a multi-thread application that has three threads. First thread generates a random integer for every 1 second; second thread computes the square of the number and prints; third thread will print the value of cube of the number.
 */


class RandomNumber extends Thread {
    static int num;
    static boolean ready = false;   
    @Override
    public void run() {
        while (true) {
            num = getRandomNumber();
            ready = true;
            System.out.println("Random number: " + num);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Exception caught.");
            }
        }
    }


    public int getRandomNumber() {
	return (int) (Math.random() * 100);
    }
}

class Square extends Thread {
    // object of RandomNumber class
    RandomNumber randomNumber;

    public Square(RandomNumber randomNumber) {
	this.randomNumber = randomNumber;
    }

    @Override
    public void run() {
        while (true) {
            if (RandomNumber.ready) {
                System.out.println("Square of num (" + RandomNumber.num + ") is: " + RandomNumber.num * RandomNumber.num);
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Exception caught.");
            }
        }
    }
}

class Cube extends Thread {
    RandomNumber randomNumber;

    public Cube(RandomNumber randomNumber) {
	this.randomNumber = randomNumber;
    }


    @Override
    public void run() {
        while (true) {
            if(RandomNumber.ready) {
                System.out.println("Cube of num (" + RandomNumber.num + ") is: " + Math.pow(RandomNumber.num, 3));
                System.out.println();
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Exception caught.");
            }
        }
    }
}

public class ThreeThreads {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        Square square = new Square(randomNumber);
        Cube cube = new Cube(randomNumber);

        randomNumber.start();
        square.start();
        cube.start();
    }
}
