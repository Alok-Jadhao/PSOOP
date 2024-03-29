// package Abstraction.Interfaces;

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

    public Customer(AccountType accountType, double interestRate, double balance) {
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    public double getSimpleInterest() {
        // TODO: Change according to question.
        return interestRate;
    }

    @Override
    public double getCompoudInterest() {
        // TODO: Change according to question.
        return interestRate;
    }
}

// TODO: Understand the difference between Current and Savings Account.
// TODO: Read about Enums from a good article.
public class BankingSystem {
    public static void main(String[] args) {
        Customer customer = new Customer(AccountType.SAVINGS, 8, 10000);
        System.out.println(customer.getCompoudInterest());
    }
}