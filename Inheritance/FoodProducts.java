/*
program 3:Consider a class Product with data members barcode and name of
the product. Create the appropriate constructor and write getter methods for
the individual data members.
Derive 2 classes from Product, 1st class is PrepackedFood and 2nd
class is FreshFood. the PrepackedFood class should contain the unit price
and the FreshFood class should contain a weight and a price per kilo as
data members.
Create methods to read the details and print the details of a
FreshFood and PrepackedFood product in the main class.
*/
package Inheritance;
import java.util.Scanner;

class Product {
    long barcode;
    String name;

    Product(long barcode, String name) {
        this.barcode = barcode;
        this.name = name;
    }

    long gebarcode() {
        return barcode;
    }

    String getname() {
        return name;
    }
}

class PrepackedFood extends Product {
    double unitPrice;

    PrepackedFood(long barcode, String name, double unitPrice) {
        super(barcode, name);
        this.unitPrice = unitPrice;
    }

    double getunitPrice() {
        return unitPrice;
    }

    void print() {
        System.out.println("Product: " + getname());
        System.out.println("Barcode: " + gebarcode());
        System.out.println("Unit Price: " + getunitPrice());
    }
}

class FreshFood extends Product {
    double weight;
    double pricePerKilo;

    FreshFood(long barcode, String name, double weight, double pricePerKilo) {
        super(barcode, name);
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
    }

    double getweight() {
        return weight;
    }

    double getpricePerKilo() {
        return pricePerKilo;
    }

    void print() {
        System.out.println("Product: " + getname());
        System.out.println("Barcode: " + gebarcode());
        System.out.println("Weight: " + getweight());
        System.out.println("Price per Kilo: " + getpricePerKilo());
    }
}

public class FoodProducts {
    public static void main(String[] args) {
        System.out.println("What would you like to order: \n1.Fresh Food 2.Prepacked Food");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        //Input of name and barcode as they are common to both the classes.
        System.out.println("Enter the name of the product: ");
        String name = sc.next();
        System.out.println("Enter the barcode of the product: ");
        long barcode = sc.nextLong();
        
        if (choice == 1) {
            //Input of weight and price per kilo.
            System.out.println("Enter the weight of the product: ");
            double weight = sc.nextDouble();
            System.out.println("Enter the price per kilo: ");
            double pricePerKilo = sc.nextDouble();

            //Creating object of FreshFood class.
            FreshFood freshFood = new FreshFood(barcode, name, weight, pricePerKilo);
            System.out.println("Details of FreshFood:");
            freshFood.print();
        } else if (choice == 2) {
            //Input of unit price.
            System.out.println("Enter the unit price of the product: ");
            double unitPrice = sc.nextDouble();

            //Creating object of PrepackedFood class.
            PrepackedFood prepackedFood = new PrepackedFood(barcode, name, unitPrice);
            System.out.println("Details of PrepackedFood:");
            prepackedFood.print();
        }
    }
}