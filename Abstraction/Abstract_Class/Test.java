package Abstraction.Abstract_Class;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
D.	Define a Westside class that has sales in clothes and accessories. Let us say 10 clothes and 10 accessories each cost 5000.
Clothes and accessories are limited and updated as soon as purchase is done.
Define a class named Payment(abstract class) that contains an instance variable of type double
that stores the amount of the payment. Amount is initialized 25,000 and updated with each purchase.
Also create a method named (abstract)  paymentDetails that updates the amount of the payment.
Next, define a  class named CashPayment that is derived from Payment.
This class should redefine the paymentDetails method to indicate that the payment is in cash.
Include appropriate constructor(s)/methods.
Define a class named CreditCardPayment that is derived from Payment.
This class should contain instance variables for the name on the card, expiration date, and credit card number.
Include appropriate constructor(s)/methods.
Finally, redefine the paymentDetails method to include all credit card information in the printout.
Define a class Person that contains person_name and P_phone_no.
Create a main method that creates at least five persons who will be given random chances for buying
using any payment method CashPayment /CreditCardPayment. Once a person buys clothes/ accessories, the amount get debited.
*/

class Westside {
    int noOfClothes = 10;
    int accessories = 10;
    int costPerItem = 5000;
}
abstract class Payment {
    double payment = 25000;
    int noOfItems;

    // constructor for no of items
    public Payment(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    abstract void paymentDetails();
}

class CashPayment extends Payment {

    public CashPayment(int noOfItems) {
        super(noOfItems);
    }

    @Override
    void paymentDetails() {
        payment = noOfItems * 5000;
        System.out.println("Your payment is in cash. Amount: " + payment);
    }
}

class CreditCardPayment extends Payment {
    String nameOnCard;
    long cardNo;
    Date expiration;

    public CreditCardPayment(String nameOnCard, long cardNo, Date expiration, int noOfItems) {
        super(noOfItems);
        this.nameOnCard = nameOnCard;
        this.cardNo = cardNo;
        this.expiration = expiration;
    }

    @Override
    void paymentDetails() {
        payment = noOfItems * 5000;
        System.out.println("Card Details: ");
        System.out.println("Name on card: " + nameOnCard);
        System.out.println("Card number: " + cardNo);
        System.out.println("Expiration date: " + expiration);

    }
}

class Person {
    String name;
    long phoneNo;

    public Person(String name, long phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of people");
        int noOfPeople = in.nextInt();

        Person[] people = new Person[noOfPeople];
        for (int i = 0; i < noOfPeople; i++) {
            System.out.print("Enter name: ");
            String name = in.next();
            System.out.print("Enter phone no: ");
            long phoneNo = in.nextLong();
            people[i] = new Person(name, phoneNo);

            // Ask for no of items bought.
            System.out.print("Enter no. of items bought: CashPayment or CreditCardPayment");
            int noOfItems = in.nextInt();

            // Ask for payment method.
            System.out.print("Enter payment method: ");
            String paymentMethod = in.next();
            // Switch case.
            switch (paymentMethod) {
                case "CashPayment":
                    CashPayment cashPayment = new CashPayment(noOfItems);
                    cashPayment.paymentDetails();

                    break;

                case "CreditCardPayment":
                    System.out.print("Enter name on card: ");
                    String nameOnCard = in.next();
                    System.out.print("Enter card no: ");
                    long cardNo = in.nextLong();
                    System.out.print("Enter expiration date: ");
                    // Take date as input.
                    Date expiration = new Date();

                    // Create object of CreditCardPayment.
                    CreditCardPayment creditCardPayment = new CreditCardPayment(nameOnCard, cardNo, expiration, noOfItems);
                    creditCardPayment.paymentDetails();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        in.close();
    }
}
