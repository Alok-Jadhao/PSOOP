package Polymorphism.Exp6;

abstract class Shape {
    public abstract void draw();

    public abstract void getArea();
}

class Circle extends Shape {
    int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public void draw() {
        System.out.println("The perimeter of Circle is: " + (2*Math.PI*rad));
    }

    @Override
    public void getArea() {
        System.out.println("The Area of Circle is: " + (Math.PI*rad*rad));
    }
}

class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public void draw() {
        System.out.println("The perimeter of Square is: " + (4*side));
    }

    @Override
    public void getArea() {
        System.out.println("The Area of Square is: " + (Math.pow(side,2)));
    }
}

class Triangle extends Shape {
    int length;
    int breadth;

    public Triangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public void draw() {
        System.out.println("The perimeter of Triangle is: " + ("Sum of all sides."));
    }

    @Override
    public void getArea() {
        System.out.println("The Area of Triangle is: " + (0.5*length*breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
        Triangle triangle = new Triangle(10,20);
        triangle.getArea();
        Square square = new Square(10);
        square.getArea();
    }
}

