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

import java.util.Calendar;

class Bank {
    int deposit;

    public double get_rate_of_interest() {
        return 2;
    }

    // Method to calculate the final amount (days as a parameter)
    public double get_final_amount(int deposit, int days) {
        double rate = get_rate_of_interest();
        double final_amount = deposit * Math.pow((1 + rate / 100), days);
        return final_amount;
    }
}

class SBI_Bank extends Bank {
    //Update this method according to the given table.
    public double get_rate_of_interest() {
        return 7;
    }
}

class ICICI_Bank extends Bank {
    //Update this method according to the given table.
    public double get_rate_of_interest() {
        return 8;
    }
}

class AXIS_bank extends Bank {
    //Update this method according to the given table.
    public double get_rate_of_interest() {
        return 9;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SBI_Bank sbi_bank = new SBI_Bank();
        ICICI_Bank icici_bank = new ICICI_Bank();
        AXIS_bank axis_bank = new AXIS_bank();

        // Dummy Output.
        // Not as required in the question.
        System.out.println("SBI Bank: " + sbi_bank.get_final_amount(10000, 1));
        System.out.println("ICICI Bank: " + icici_bank.get_final_amount(12500, 1));
        System.out.println("AXIS Bank: " + axis_bank.get_final_amount(20000, 1));
    }
}