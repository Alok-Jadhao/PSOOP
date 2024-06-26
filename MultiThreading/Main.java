/*
Write a two-threaded program, where one thread finds all prime numbers (in 0 to 100) and another thread finds all palindrome numbers (in 10 to 1000). Schedule these threads in a sequential manner to get the results. Now reschedule them as parallel threads.
*/

class Prime extends Thread {

    @Override
    public void run() {
	for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i); 
                
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                        System.out.println("Exception caught.");	
                }
            }
        }
    }

    // implementation for isPrime
    public boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            } 
        }

        return true;
    }
}

class Palindrome extends Thread {

    @Override
    public void run() {
        for (int i = 10; i < 1000; i++) {
            if (isPalindrome(i)) {
                System.out.println("Palindrome: " + i); 
                
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                        System.out.println("Exception caught.");	
                }
            }
        }
    }

    // implementation for isPalindrome
    public boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return num == rev;
    }
}

public class Main {
    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.start();

        Palindrome palindrome = new Palindrome();
        palindrome.start();
    }
}
