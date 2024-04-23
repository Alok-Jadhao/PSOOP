/*
 * Print even numbers by one thread and odd numbers by another thread and print the sum of 
 * even and odd numbers by third thread. Use the Thread control function and its method (atleast one)
 */

class Odd extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class Even extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Sum extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        Odd odd = new Odd();
        Even even = new Even();
        Sum sum = new Sum();

        odd.start();
        even.start();
        sum.start();
    }
}