/*
Prog 2.
A program to simulate a simple banking system in which the initial balance and rate of interest are read from the keyboard
 and these values are initialised using the constructor member function. The program consists of the following methods:

    To initialise the balance amount and the rate of interest using constructor member function

    To make deposit

    To withdraw an amount

    To find compound interest based on the rate of interest  (CI = P * (1 + (R / 100))^T.)

    To know the balance amount

    To display the menu options

Note:

    Balance cannot be less than 0.

    In a Saving account if minBalance is set then for that the balance cannot go less than that amount. If it goes, an error must be shown.

    You can set the values by default for the above variables in Checking Account class
 */

import java.util.Scanner;

class Bank{
    double bankbalance;
    double interestRate;
    double minBal = 0;

    public Bank() {
        bankbalance = 100.0;
        interestRate = 5.0;
    }

    public Bank(double bankbalance, double interestRate) {
        this.bankbalance = bankbalance;
        this.interestRate = interestRate;
    }
    
    void deposit(double money){
    	bankbalance+= money;
        getbalance();

    }

    void withdraw(double money){
        bankbalance -= money;
        getbalance();
        checkbalance();
    }

    void getbalance(){
        System.out.println("Your bank balance is: " + bankbalance);
    }

    void setminBal(double bal){
        minBal = bal;
    }

    void checkbalance(){
        if(bankbalance<0)
            System.out.println("Balance cannot be less than 0.");

        if(bankbalance<minBal)
            System.out.println("Error: Minimum Balance not met.");
    }


    void compoundInterest(){
        double CI = bankbalance * (1 + (interestRate / 100));
        System.out.println("The compound interest for one year is: " + CI);
    }


    
}

public class BankingSystem {
    public static void main(String[] args) {
        //b1 to show default constructor
        Bank b1 = new Bank();

        Scanner in = new Scanner(System.in);

        System.out.println("Input for bank: ");

        double bankbalance;
        double interestRate;
        System.out.print("Enter bank balance: ");
        bankbalance = in.nextDouble();
        System.out.print("Enter interest rate: ");
        interestRate = in.nextDouble();

        //Parameterised constructor.
        Bank b2 = new Bank(bankbalance, interestRate);

        System.out.print("Please enter the min balance: ");
        double minb = in.nextDouble();
        b2.setminBal(minb);

        System.out.println("Menu Options: 1. deposit 2. withdraw 3. compound interest 4. bank balance");
        int option = in.nextInt();
        if(option==1) {
            System.out.print("Enter the amount of money to deposit: ");
            int depo = in.nextInt();
            b2.deposit(depo);
        }

        else if(option==2) {
            System.out.print("Enter the amount of money to withdraw: ");
            int withdraw = in.nextInt();
            b2.withdraw(withdraw);
        }

        else if(option==3) {
            b2.compoundInterest();
        }

        else if (option == 4) {
            b2.getbalance();
        }

        else
            System.out.println("Invalid input.");



    }

}
