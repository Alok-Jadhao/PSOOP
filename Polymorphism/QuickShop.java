import java.util.Scanner;

class RetailP {
    double wholesale;
    int days;

    // Constructor to initialize wholesale cost and days until sold
    public RetailP(double wholesale, int days) {
        this.wholesale = wholesale;
        this.days = days;
    }

    // Method to calculate the retail price based on the number of days until sold
    double retailPrice() {
        // If days is negative, return -1
        if (days < 0) {
            return -1.0;
        } 
        // If days is between 1 and 7 (inclusive), apply a 5% markup
        else if (days > 0 && days <= 7) {
            return wholesale + wholesale * 0.05;
        } 
        // For all other cases, apply a 10% markup
        else {
            return wholesale + wholesale * 0.1;
        }
    }
}

public class QuickShop {
    public static void main(String[] args) {
        // Prompt the user to enter wholesale cost and expected number of days until sold
        System.out.println("This program determines the retail price for an item at a Quick-Shop supermarket store.");
        Scanner in = new Scanner(System.in);
        double wholesale;
        int days;
        System.out.print("Enter the wholesale cost of item: $");
        wholesale = in.nextDouble();
        System.out.print("Enter the expected number of days until sold: ");
        days = in.nextInt();

        // Create a RetailP object with the provided wholesale cost and days until sold
        RetailP rp1 = new RetailP(wholesale, days);
        // Calculate the retail price
        double price =  rp1.retailPrice();

        // Display the input values and calculated retail price
        System.out.println("Wholesale cost = $" + wholesale);
        System.out.println("Expected time until sold = " + days);
        System.out.println("Retail Price = $" + price);
    }
}
