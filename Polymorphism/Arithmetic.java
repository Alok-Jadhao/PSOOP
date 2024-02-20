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

class Point {
    int x,y;

    public Point(int x,int y) {
	this.x = x;
	this.y = y;
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

    void multiply(int n){
        this.x *= n;
        this.y *= n;
    }

    Point divide(Point q, int n){
        return new Point(q.x / n, q.y / n);
    }

    void divide(int n){
        this.x /= n;
        this.y /= n;
    }
}

public class Arithmetic { 
    public static void main(String[] args) {
        Point q = new Point(20,20);
        Point r = new Point(5,5);
        int n = 10; 

        System.out.println("q = 20,20  ;  r = 5,5  ;  n = 10\n");

        //Operation 1 - add
        Point p = q.add(q,r);
        System.out.println("Addition of two Points q,r");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");

        //Operation 2 - add
        p.add(q);
        System.out.println("Addition of q in p");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");
        
        //Operation 3 - subtract
        p = p.subtract(q,r);
        System.out.println("Subtraction of two Points q,r");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");
        
        //Operation 4 - subtract.
        p.subtract(q);
        System.out.println("Subtraction of q from p");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");

        //Operation 5 - Multiply
        p = p.multiply(q,n);
        System.out.println("Multiplication of q with n = 10");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");
        
        //Operation 6  - Multiply
        p.multiply(n);
        System.out.println("Multiplication of p with n = 10");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");

        //Operation 7 - divide
        p = p.divide(q,n);
        System.out.println("Division of q by n");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");

        //Operation 8 - divide
        p.divide(n);
        System.out.println("Division of q by n");
        System.out.println("X coordinate of point P: " + p.x);
        System.out.println("Y coordinate of point P: " + p.y + "\n");

        System.out.println("End of program.");
    }
}
