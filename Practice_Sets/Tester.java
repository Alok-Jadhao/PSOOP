/*
Mr John is given the contract to color the house. Write a Java program that implements  multi- level inheritance in such a way that 
o There must be 3 classes i.e. Exterior ,Paint ,Bill. 
o The Class Bill inherits the Paint class which in turn inherits the Class Exterior o Class Exterior contains a function to find the area of the house 
o Class Paint contains a function to select the paint type and brand 
o Class Bill calculates the final cost of the painting by getting the house details  and paint details. 
Write a Tester class with the main() function to create appropriate objects and simulate the  above scenario. 

*/


class Exterior {
    int length;
    int breadth;
    int height;

    Exterior(int length, int breadth, int height) {
	this.length = length;
	this.breadth = breadth;
	this.height = height;
    }

    int area() {
	return 2 * (length * breadth + breadth * height + height * length);
    }
}


class Paint extends Exterior {
    String type;
    String brand;
    int pricePerSqFt;

    Paint(int length, int breadth, int height, String type, String brand, int pricePerSqFt) {
	super(length, breadth, height);
	this.type = type;
	this.brand = brand;
	this.pricePerSqFt = pricePerSqFt;
    }


    void display() {
	System.out.println("Paint Type: " + type);
	System.out.println("Paint Brand: " + brand);
	System.out.println("Price per SqFt: " + pricePerSqFt);
    }
}


class Bill extends Paint {
    Bill(int length, int breadth, int height, String type, String brand, int pricePerSqFt) {
	super(length, breadth, height, type, brand, pricePerSqFt);
    }

    int calculateCost() {
	return pricePerSqFt * area();
    }
}


public class Tester {
    public static void main(String[] args) {
	Bill b = new Bill(10, 20, 30, "Oil", "Asian", 10);
	b.display();
	System.out.println("Total Cost: " + b.calculateCost());
    }
}


// Output
// Paint Type: Oil
// Paint Brand: Asian
// Price per SqFt: 10
// Total Cost: 1800
// 10 * 2 * (10 * 20 + 20 * 30 + 30 * 10) = 1800
// Area = 2 * (10 * 20 + 20 * 30 + 30 * 10) = 1800
// Price = 10 * 1800 = 18000
// Total Cost = 18000
