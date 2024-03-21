// Shape class
class Shape {
    // Methods to calculate area, perimeter, and side length
    public double getArea() {
        return 0; // Default implementation returns 0
    }

    public double getPerimeter() {
        return 0; // Default implementation returns 0
    }

    public double getSide() {
        return 0; // Default implementation returns 0
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding getArea method for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Overriding getPerimeter method for Circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding getSide method for Circle
    @Override
    public double getSide() {
        return radius; // For a circle, the radius is considered as the 'side'
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overriding getArea method for Triangle using Heron's formula
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Overriding getPerimeter method for Triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Overriding getSide method for Triangle
    @Override
    public double getSide() {
        return side1; // For a triangle, any side can be considered as the 'side'
    }
}

// Square subclass
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Overriding getArea method for Square
    @Override
    public double getArea() {
        return side * side;
    }

    // Overriding getPerimeter method for Square
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Overriding getSide method for Square
    @Override
    public double getSide() {
        return side; // For a square, all sides are equal, so returning any side is sufficient
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(6);

        // Displaying the areas, perimeters, and side lengths of each shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Side Length: " + circle.getSide());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Side Length: " + triangle.getSide());

        System.out.println("\nSquare:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Side Length: " + square.getSide());
    }
}
