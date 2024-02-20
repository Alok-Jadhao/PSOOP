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


/*
// Method to add two points
public static Point add(Point q, Point r) {
    return new Point(q.x + r.x, q.y + r.y);
}
// Method to add a point to this point
public void add(Point q) {
    this.x += q.x;
    this.y += q.y;
}
*/

import java.lang.*;

class Point {
    Point p,q,r;
    public Point {

    }

    //Add Two points q,r
    Point add(Point q, Point r){
        return new Point(q.x + r.x, q.y + r.y);
    }

    //add q to the current point
    void add(Point q){
        this.x += q.x;
        this.y += q.y;
    }

    //Subtract two point, return new
    Point subtract(Point q, Point r){
        return new Point(q.x - r.x, q.y - r.y);
    }

    //Sub q from current pt.
    void subtract(Point q){
        this.x -= q.x;
        this.y -= q.y;
    }

    //multiply
    Point multiply(Point q, int n){
        return new Point(q.x * n, q.y * n);
    }

    void multiply(Point q){
        this.x *= q.x;
        this.y *= q.y;
    }

    Point divide(Point q, int n){
        return new Point(q.x / n, q.y / n);
    }

    void divide(Point q){
        this.x *= q.x;
        this.y *= q.y;
    }
}

public class Arithmetic { 
    public static void main(String[] args) {
        Point q = new Point(20,20);
    }
}