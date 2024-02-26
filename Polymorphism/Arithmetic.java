/*
 * You are tasked with developing a Java program to define a class called Point that represents a 2D coordinate with x and y values. 
 * Within this class, implement methods to perform arithmetic operations between points and scalar values. Specifically, the following operations should be supported:
    1. Add two points (q and r) to produce a new point (p = q + r). 
    2. Add a point q to the current point (p += q).
    3. Subtract one point (r) from another (q) to produce a new point (p = q - r).
    4. Subtract a point q from the current point (p -= q).
    5. Multiply a point (q) by a scalar value (n) to produce a new point (p = q * n).
    6. Multiply the current point by a scalar value (p *= n).
    7. Divide a point (q) by a scalar value (n) to produce a new point (p = q / n).
    8. Divide the current point by a scalar value (p /= n).
 */


class Point {
    int x, y;

    // Constructor to initialize x and y coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to add two points and return a new point
    Point add(Point q, Point r) {
        return new Point(q.x + r.x, q.y + r.y);
    }

    // Method to add a point to the current point
    void add(Point q) {
        this.x += q.x;
        this.y += q.y;
    }

    // Method to subtract one point from another and return a new point
    Point subtract(Point q, Point r) {
        return new Point(q.x - r.x, q.y - r.y);
    }

    // Method to subtract a point from the current point
    void subtract(Point q) {
        this.x -= q.x;
        this.y -= q.y;
    }

    // Method to multiply a point by a scalar value and return a new point
    Point multiply(Point q, int n) {
        return new Point(q.x * n, q.y * n);
    }

    // Method to multiply the current point by a scalar value
    void multiply(int n) {
        this.x *= n;
        this.y *= n;
    }

    // Method to divide a point by a scalar value and return a new point
    Point divide(Point q, int n) {
        return new Point(q.x / n, q.y / n);
    }

    // Method to divide the current point by a scalar value and return double outputs
    void divide(int n) {
        System.out.println("X coordinate of point p: " + (double)this.x/n);
        System.out.println("Y coordinate of point p: " + (double)this.y/n + "\n");
    }
}

public class ArithmeticTest {
    public static void main(String[] args) {
        // Create points and scalar value for operations
        Point q = new Point(20, 20);
        Point r = new Point(5, 5);
        int n = 10;

        System.out.println("q = 20, 20  ;  r = 5, 5  ;  n = 10\n");

        // Operation 1 - add two points
        Point p = q.add(q, r);
        System.out.println("Addition of two points q and r:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 2 - add a point to the current point
        p.add(q);
        System.out.println("Addition of point q to the current point p:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 3 - subtract one point from another
        p = p.subtract(q, r);
        System.out.println("Subtraction of point r from point q:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 4 - subtract a point from the current point
        p.subtract(q);
        System.out.println("Subtraction of point q from the current point p:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 5 - multiply a point by a scalar value
        p = p.multiply(q, n);
        System.out.println("Multiplication of point q by scalar value n = 10:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 6 - multiply the current point by a scalar value
        p.multiply(n);
        System.out.println("Multiplication of the current point p by scalar value n = 10:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 7 - divide a point by a scalar value
        p = p.divide(q, n);
        System.out.println("Division of point q by scalar value n:");
        System.out.println("X coordinate of point p: " + p.x);
        System.out.println("Y coordinate of point p: " + p.y + "\n");

        // Operation 8 - divide the current point by a scalar value
        System.out.println("Division of the current point p by scalar value n:");
        p.divide(n);

        System.out.println("End of program.");
    }
}
