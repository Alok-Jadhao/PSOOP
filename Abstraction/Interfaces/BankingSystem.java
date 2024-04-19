// package Abstraction.Interfaces;
import java.util.Scanner;
/*
A banking system has two interfaces SavingAccount and CurrentAccount. The
SavingAccount account has method getSimpleInterest() and CurrentAccont has method
getCompoudInterest(). Both these interfaces are implemented by class Customer.
Customer have data members: account type, interest rate and balance. The class then
calculates interest on balance and prints it.
 */

interface SavingAccount {
    double getSimpleInterest();
}

interface CurrentAccont {
    double getCompoudInterest();
}

enum AccountType {
    SAVINGS,
    CURRENT
}


class Customer implements SavingAccount, CurrentAccont {
    private AccountType accountType;
    private double interestRate;
    private double balance;
    private int time;

    public Customer(AccountType accountType, double interestRate, double balance, int time) {
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.balance = balance;
        this.time = time;
    }

    @Override
    public double getSimpleInterest() {
        return (balance * interestRate * time) / 100;
    }

    @Override
    public double getCompoudInterest() {
        return (balance * Math.pow((1 + interestRate/100),time)) - balance;
    }   
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input account type, balance, interest rate and time.
        System.out.print("Enter account type (SAVINGS/CURRENT): ");
        String accountType = scanner.nextLine();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter time in years: ");
        int time = scanner.nextInt();

        // create customer object.
        Customer customer = new Customer(AccountType.valueOf(accountType), interestRate, balance, time);

        if (accountType.equals("SAVINGS")) {
            System.out.println("Simple Interest: " + customer.getSimpleInterest());
        } else if (accountType.equals("CURRENT")) {
            System.out.println("Compound Interest: " + customer.getCompoudInterest());
        } else {
            System.out.println("Invalid account type.");
        }
    }
}
