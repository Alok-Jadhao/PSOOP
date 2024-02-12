/*
 * Exp 3a.Method Overloading
Problem Statement 1:
The payment option on any e-commerce website has several options like netbanking, COD,
credit card, etc. That means, a payment method is overloaded several times to perform single
payment function in various ways.
To perform the above functionality write a
class Purchase with
Data members
1-item
2- price
3-quantity
Method
1-Billing()------price*quantity
overload payment method according to the type of payement option
2-payment()----COD----Billing+additional charges Rs.50
3-Payment(Bank name, Account no.)----net banking----billing+1%
4-Payment(Credit card No)-----Credit Card-----billing+2%
write a menu-driven program to perform payment with the following options:
1- COD---default option of payment
2-Netbanking---read bank details from a user
3-Creditcard-read credit card details from a user
 */

import java.util.Scanner;

class Purchase{

    String item;
    double price;
    intdate quantity;
    double bill;

    public Purchase(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    //To Calculate Bill
    double billing(){
        bill = (price * quantity);
        return bill;
    }

    //COD
    double payment(){
        return bill + 50;
    }

    //Netbanking
    double payment(String Bank_name, long Account_No){
        return bill + 0.01 * bill;
    }

    //Credit Card
    double payment(long Creditcard){
        return bill + 0.02 * bill;
    }
}


public class Program1 {
    public static void main(String[] args) {
        String item;
        double price;
        int quantity;
        double bill;

        Scanner in = new Scanner(System.in);

        //Input of item, price, quantity;
        System.out.print("Enter item you want to buy: ");
        item = in.nextLine();

        System.out.print("Enter price of the item: ");
        price = in.nextDouble();

        System.out.print("Enter number of items: ");
        quantity = in.nextInt();

        Purchase p1 = new Purchase(item, price, quantity);

        bill = p1.billing();
        
        //Input of choice
        System.out.println("How would you like to pay: ");
        System.out.println("1.COD  2.Netbanking  3.Credit Card");

        System.out.println();

        int var = in.nextInt();
        switch (var) {
            //COD
            case 1:
                bill = p1.payment();
                System.out.println("Your bill is: " + bill);
                break;

            //Netbanking
            case 2:
                System.out.print("Enter bank name: ");
                String bankName = in.nextLine();
                in.next();
                System.out.print("Enter Account Number: ");
                long accountNo = in.nextLong();
                bill = p1.payment(bankName, accountNo);
                System.out.println("Your bill is: " + bill);
                break;
            
            //Credit Card
            case 3:
                System.out.print("Enter Credit Card Number: ");
                long creditCard = in.nextLong();
                bill = p1.payment(creditCard);
                System.out.println("Your bill is: " + bill);
                break;
        
            default:
                System.out.println("Invalid Inptut");
                break;
        }

        System.out.println("Thank you for using our Website.");
    }    
}
