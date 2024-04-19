/*
 * 
Write a two-threaded program, where one thread finds all prime numbers (in 0 to 100) and another thread finds all palindrome numbers (in 10 to 1000). Schedule these threads in a sequential manner to get the results. Now reschedule them as parallel threads.
*/

class Prime extends Thread {
    
    public void display() {
        System.out.println("Prime class Thread started:");
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i); 
            }
        }
    }

    // implementation for isPrime
    public boolean isPrime(int num) {
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                return true;
            } 
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Prime prime = new Prime();
    }
}
