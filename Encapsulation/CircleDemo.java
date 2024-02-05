package Encapsulation;

import java.lang.*;

class Circle{
	int x;
    double y;
    double r;

    public Circle(int x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }
    
    public Circle(int x) {
        this.x = x;
    }
    
    public Circle(){
    	x = 1;
    	y = 1;
    	r = 1;
    }

    double getArea(){
        return Math.PI*r*r;
    }

    double getPerimeter(){
        return 2*Math.PI*r;
    }
    
    


}

public class CircleDemo {
    public static void main(String[] args) {
		Circle c1 = new Circle(3,4.0,5.0);
		Circle c2 = new Circle(8.0);
		Circle c3 = new Circle();
		Circle c4 = new Circle(10);

        c1.getPerimeter();
        c1.getArea();
    }
}
