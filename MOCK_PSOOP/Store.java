/*
 * A manufacturer is designing a rectangular box of various shapes. He has two assembly
lines for the boxes. One is for the small boxes of size(L=2,B=6,H=3) in cm and big boxes of
size (L=12.50,B=30.00,H=78.25) in cm. When the material is supplied to him, he decides
on the capacity of the store which is 50,000 cubic cm which boxes to manufacture. He has
to optimize the production to fit in the store everyday. Use method overloading to set the
values of L,B and H.
 */

public class Box {
    private double length;
    private double breadth;
    private double height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public void fitInStore() {
        if (getVolume() <= 50000) {
            System.out.println("Box fits in the store");
        } else {
            System.out.println("Box does not fit in the store");
        }
    }
}

public class Store {
    public static void main(String[] args) {
        Box smallBox = new Box(2, 6, 3);
        smallBox.fitInStore();

        Box bigBox = new Box(12.50, 30.00, 78.25);
        bigBox.fitInStore();
    }
}
