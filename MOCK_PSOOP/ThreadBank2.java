/*
 * * In a bank there are two operations performed as withdraw and deposit. Either deposit is
done or withdraw is done. Initial amount is set to 2500 and amount should not go below
500 while withdrawing money i.e it gives message “less money”. Write code for five
transactions using synchronized multithreading.
 */

class Bank extends Thread {
    static int amount;

    public Bank() {
        amount = 2500;
    }

}

class Deposit extends Bank {
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Depositing 500");
                amount += 500;
                System.out.println("Amount after deposit: " + amount);
            }
        }
    }
}


class Withdraw extends Bank {
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                if (amount - 500 < 500) {
                    System.out.println("Less money");
                } else {
                    System.out.println("Withdrawing 500");
                    amount -= 500;
                    System.out.println("Amount after withdraw: " + amount);
                }    
            }
            
        }
    }
}


public class ThreadBank2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();

        deposit.start();
        withdraw.start();
    }
}
