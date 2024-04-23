/*
Write a program to print "Welcome to SPIT" and "Computer Engineering Department" continuously on the screen in Java
using threads. Add a sleep method in the welcome thread to delay its execution for 200ms.

(can use wait(), notify() )
 */

class SPIT extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Welcome to SPIT");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

class Department extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Computer Engineering Department");
                Thread.sleep(1500);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}

class PrintSPIT {
    public static void main(String[] args) {
        SPIT s = new SPIT();
        Department d = new Department();

        Thread spit = new Thread(s);
        Thread department = new Thread(d);
        spit.start();
        department.start();
    }
}