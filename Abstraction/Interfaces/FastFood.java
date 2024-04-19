// package Abstraction.Interfaces;

/*
A fast food centre has two interfaces EatItHere and TakeAway.
They have methods like deliverOrder() and dispatchOrder(). the class Consumer inherits
both of them. If Consumer orders a takeaway he will be charged a convenience fee of
Rs. 45/- or 5% of order price whichever is more. If he chooses to eat in a restaurant
then he will be charged Rs. 500/- service charge or 10% of order price whichever is lower.
The class consumer has data members as order number and order price.
 */

interface EatItHere {
    void deliverOrder();
    void dispatchOrder();
}

interface TakeAway {
    void deliverOrder();
    void dispatchOrder();
}

class Consumer implements EatItHere, TakeAway {
    double orderPrice;

    public Consumer(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order Delivered");
    }

    @Override
    public void dispatchOrder() {
        System.out.println("Order dispatched.");
    }

    double convenienceFee() {
        double percent = 0.05 * orderPrice;
        return Math.max(45, percent);
    }

    double serviceCharge() {
        return Math.min(500, 0.1 * orderPrice);
    }

    void displayCharges(boolean takeaway) {
        if(takeaway) {
            double convenienceFee = convenienceFee();
            System.out.println("Convenience Fee: " + convenienceFee);
        } else {
            double service = serviceCharge();
            System.out.println("Service Charge: " + service);
        }
    }

}

public class FastFood {
    public static void main(String[] args) {
        Consumer consumer = new Consumer(1000); // Example order price

        // For eating in the restaurant
        System.out.println("For eating in the restaurant:");
        consumer.displayCharges(true);

        // For take-away
        System.out.println("\nFor take-away:");
        consumer.displayCharges(false);
    }
}
