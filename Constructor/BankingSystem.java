import java.util.Scanner;

class Bank {
    // Data members
    double bankbalance;
    double interestRate;
    double minBal = 0;

    // Default constructor with default initial values
    public Bank() {
        bankbalance = 100.0;
        interestRate = 5.0;
    }

    // Parameterized constructor to initialize balance and interest rate
    public Bank(double bankbalance, double interestRate) {
        this.bankbalance = bankbalance;
        this.interestRate = interestRate;
    }

    // Method to deposit money into the account
    void deposit(double money) {
        bankbalance += money;
        getbalance();
    }

    // Method to withdraw money from the account
    void withdraw(double money) {
        bankbalance -= money;
        getbalance();
        checkbalance();
    }

    // Method to display current balance
    void getbalance() {
        System.out.println("Your bank balance is: " + bankbalance);
    }

    // Method to set minimum balance
    void setminBal(double bal) {
        minBal = bal;
    }

    // Method to check if balance is below minimum
    void checkbalance() {
        if (bankbalance < 0)
            System.out.println("Balance cannot be less than 0.");

        if (bankbalance < minBal)
            System.out.println("Error: Minimum Balance not met.");
    }

    // Method to calculate compound interest
    void compoundInterest(int time) {
        double CI = bankbalance * Math.pow(1 + (interestRate / 100),time);
        System.out.println("The compound interest for given time is: " + CI);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Default constructor usage to display default values
        Bank b1 = new Bank();

        Scanner in = new Scanner(System.in);

        // Input for bank balance and interest rate
        double bankbalance;
        double interestRate;
        System.out.println("Input for bank: ");
        System.out.print("Enter bank balance: ");
        bankbalance = in.nextDouble();
        System.out.print("Enter interest rate: ");
        interestRate = in.nextDouble();

        // Parameterized constructor usage with user input values
        Bank b2 = new Bank(bankbalance, interestRate);

        // Setting minimum balance
        System.out.print("Please enter the min balance: ");
        double minb = in.nextDouble();
        b2.setminBal(minb);

        // Menu Options for banking operations
        System.out.println("Menu Options: 1. deposit 2. withdraw 3. compound interest 4. bank balance");
        int option = in.nextInt();
        if (option == 1) {
            System.out.print("Enter the amount of money to deposit: ");
            int depo = in.nextInt();
            b2.deposit(depo);
        } else if (option == 2) {
            System.out.print("Enter the amount of money to withdraw: ");
            int withdraw = in.nextInt();
            b2.withdraw(withdraw);
        } else if (option == 3) {
            System.out.println("Enter years: ");
            int time = in.nextInt();
            b2.compoundInterest(time);
        } else if (option == 4) {
            b2.getbalance();
        } else
            System.out.println("Invalid input.");

        // Closing Scanner object
        in.close();
    }
}
