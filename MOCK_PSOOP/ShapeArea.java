/*
 * Find out the area of geometric shapes with the given input attributes like length, breadth,
height, radius etc. Design a program using method overloading to print the area of square,
rectangle, circle and triangle.
 */

class Area {
    
    public int getArea(int length, int breadth) { // rectangle
        return length * breadth;
    }

    public double getArea(int breadth, double height) { // triangle
        return 0.5 * breadth * height;
    }

    public double getArea(int side) {  // square
        return Math.pow(side, 2);
    }

    public double getArea(double radius) { // circle
        return Math.PI * radius * radius;
    }

}

public class ShapeArea {
    public static void main(String[] args) {
        System.out.println("The area of different shapes are: ");
        Area area = new Area();

        System.out.println("Area of square with side = 10 is : " + area.getArea(10));
        System.out.println();

        System.out.println("Area of circle with radius = 10.5 is : " + area.getArea(10.5));
        System.out.println();

        System.out.println("Area of rectangle with length = 10 and breadth = 20 is : " + area.getArea(10, 20));
        System.out.println();


        System.out.println("Area of triangle with breadth = 10 and height = 15.5 is : " + area.getArea(10,15.5));
        System.out.println();

    }
}

