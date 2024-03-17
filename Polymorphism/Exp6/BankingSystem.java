/*
Consider a scenario where Bank is a class that provides functionality to get the rate of interest.
However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks are given
below.

Aayush has deposited Rs.10000 in SBI Bank, Rs.12500 in ICICI Bank, and Rs.20000 in AXIS bank
respectively for a particular month.
You need to print the money he will get by applying the rate of interest as per the bank and days.
Create a class 'Bank' with a method 'get_rate_of_interest' which returns 2%.
Make three subclasses named SBI_Bank, ‘ICICI_Bank’ and 'AXIS_bank' with a method with the same
name 'get_rate_of_interest' which returns the rate of interest.
Also, give the final amount Aayush will get from that particular bank by applying the rate of interest and
period. Use Calendar Class to count the number of days and amount he will get after maturity with the
date of Maturity, if he deposits today.
Note:
1. Use compound interest
2. Get time period from the user
3. Solve using method overriding
*/
// package Exp6;
import java.util.Calendar;

class Bank {
    int deposit;
    double rate = 2;

    public double get_rate_of_interest(int days) {
        return 2;
    }

    // Method to calculate the final amount (days as a parameter)
    public double get_final_amount(int deposit, int days) {
        double rate = get_rate_of_interest(days);
        return deposit * Math.pow((1 + rate / 100), (double) (days) /365);
    }
}

class SBI_Bank extends Bank {

    //Updated the rate according to the days input.
    public double get_rate_of_interest(int days) {
        if (days >= 7 && days <= 14) {
            return 3.00;
        } else if (days >= 15 && days <= 30) {
            return 3.00;
        } else if (days >= 31 && days <= 45) {
            return 3.00;
        } else if (days >= 46 && days <= 90) {
            return 4.05;
        } else if (days >= 91 && days <= 120) {
            return 4.10;
        } else if (days >= 121 && days <= 180) {
            return 4.10;
        } else {
            return 2.0;
        }
    }

}

class ICICI_Bank extends Bank {

    public double get_rate_of_interest(int days) {
        if (days >= 7 && days <= 14) {
            rate = 3.10;
        } else if (days >= 15 && days <= 30) {
            rate = 3.20;
        } else if (days >= 31 && days <= 45) {
            rate = 3.50;
        } else if (days >= 46 && days <= 90) {
            rate = 4.50;
        } else if (days >= 91 && days <= 120) {
            rate = 4.70;
        } else if (days >= 121 && days <= 180) {
            rate = 4.90;
        }

        return rate;
    }
}

class AXIS_bank extends Bank {

    public double get_rate_of_interest(int days) {
        if (days >= 7 && days <= 14) {
            return 3.15;
        } else if (days >= 15 && days <= 30) {
            return 3.15;
        } else if (days >= 31 && days <= 45) {
            return 3.45;
        } else if (days >= 46 && days <= 90) {
            return 4.05;
        } else if (days >= 91 && days <= 120) {
            return 4.70;
        } else if (days >= 121 && days <= 180) {
            return 5.00;
        } else {
            return 2.0;
        }
    }
}

// TODO: Learn and Apply the Calendar Class to calculate number of days.

public class BankingSystem {
    public static void main(String[] args) {
        // Bank bank = new Bank();

        // Different banks declaration.
        SBI_Bank sbi_bank = new SBI_Bank();
        ICICI_Bank icici_bank = new ICICI_Bank();
        AXIS_bank axis_bank = new AXIS_bank();

        // Output for different banks.
        System.out.println("SBI Bank: " + sbi_bank.get_final_amount(10000, 10));
        System.out.println("ICICI Bank: " + icici_bank.get_final_amount(10000, 10));
        System.out.println("AXIS Bank: " + axis_bank.get_final_amount(10000, 10));
    }
}

