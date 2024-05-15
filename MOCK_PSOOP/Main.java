class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Current Thread Name is: " + Thread.currentThread().getName());

        this.setPriority(Thread.MAX_PRIORITY);

        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is the current running? : " + this.isAlive());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();

        try {
            mythread.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread completes.");
    }
}
