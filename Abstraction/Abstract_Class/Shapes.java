/*
Write a program to calculate the area of 4 rectangles, 5 squares and  2 circles.
Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters,
 'SquareArea' and 'CircleArea' taking one parameter each.
The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and
that of 'CircleArea' is its radius.
Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and
'CircleArea' for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods.
 */

abstract class Shape {
    abstract int rectangleArea(int length, int breadth);

    abstract int squareArea(int side);

    abstract double circleArea(int radius);
}

class Area extends Shape {
    @Override
    int rectangleArea(int length, int breadth) {
        return length * breadth;
    }

    @Override
    int squareArea(int side) {
        return (int)Math.pow(side, 2);
    }

    @Override
    double circleArea(int radius) {
        return Math.PI * radius * radius;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Area area = new Area();

        System.out.println("The area of rectangle with 10x20 is: " + area.rectangleArea(10,20));
        System.out.println("The area of square with side 10 is: " + area.squareArea(10));
        System.out.println("The area of circle with radius 10 is: " + area.circleArea(10));
    }
}