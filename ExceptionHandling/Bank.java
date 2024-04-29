/*
There is an abstract class Account
Attribute:-
● Name
● Balance
● Acc_No

Method:-
● Deposit - abstract method
● withdraw - abstract method
● display - abstract method

Saving Account inherits the Account class and provides the implementation for the methods accordingly
Saving Account class Attribute:-
● interestRate
● minBalance

Method
● addInterest: handle Arithmetic Exception
● transfer():

Note:
● Balance cannot be less than 0.
● In a Saving account if minBalance is set then for that the balance
cannot go less than that amount. If it goes, an error must be shown.
● let the user deposit to or withdraw from the account. For each
transaction, a message is displayed to indicate the status of the
transaction: successful or failed. In case of failure, the failure
reason is reported.
● The possible Exceptions are negative-amount-exception (in both
deposit and withdraw transaction) and insufficient-amount-
exception ( in withdraw transaction).
For the above scenario write an interactive program in Java. Also, show output for different use cases.
*/

abstract class Account {
    String name;
    int balance;
    int acc_no;

    public Account(String name, int balance, int acc_no) {
        this.name = name;
        this.balance = balance;
        this.acc_no = acc_no;
    }

    abstract void deposit(int amount) throws NegativeAmountException;

    abstract void withdraw(int amount) throws InsufficientAmountException, NegativeAmountException;

    abstract void display();
}

class SavingAccount extends Account {
    int interestRate;
    int minBalance = 0;

    public SavingAccount(String name, int balance, int acc_no, int interestRate, int minBalance) {
        super(name, balance, acc_no);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    @Override
    void deposit(int amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    @Override
    void withdraw(int amount) throws InsufficientAmountException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (balance - amount < minBalance) {
            throw new InsufficientAmountException("Insufficient balance. Minimum balance required: " + minBalance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Minimum Balance: " + minBalance);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientAmountException extends Exception {
    public InsufficientAmountException(String message) {
        super(message);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount("John Doe", 1000, 123456, 5, 500);
        account.display();

        try {
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(1500);
        } catch (NegativeAmountException e) {
            System.out.println("NegativeAmountException: " + e.getMessage());
        } catch (InsufficientAmountException e) {
            System.out.println("InsufficientAmountException: " + e.getMessage());
        }
    }

    
}