// package MultiThreading;

/*
Write a Java program that implements a multi-thread application that has three threads. First thread generates a random integer for every 1 second; second thread computes the square of the number and prints; third thread will print the value of cube of the number.
 */

class RandomNumber extends Thread {
    @Override
    public void run() {
        while (true) {
            int num = (int) (Math.random() * 100);
            System.out.println("Random number: " + num);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Exception caught.");
            }
        }
    }
}

class Square extends Thread {
    @Override
    public void run() {
        while (true) {
            int num = (int) (Math.random() * 100);
            System.out.println("Square of num (" + num + ") is: " + num * num);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Exception caught.");
            }
        }
    }
}

class Cube extends Thread {
    @Override
    public void run() {
        while (true) {
            int num = (int) (Math.random() * 100);
            System.out.println("Cube of num (" + num + ") is: " + num * num * num);
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
        Square square = new Square();
        Cube cube = new Cube();

        randomNumber.start();
        square.start();
        cube.start();
    }
}