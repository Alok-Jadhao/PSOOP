/*
 * Write a java program consisting of a class named Complex to add two complex numbers
by using add() method by passing the objects as parameter(Complex number 1 and
Complex number 2) and display the result using method display(). Initialize the real and
imaginary values of the Complex number by writing parameterized Constructor. Use
default constructor to initialize default values to real and imaginary values to zero. Use
this keyword.
 */

class Complex {
    private double real;
    private double imag;
    // z = x + iy
    
    public Complex() {
        real = 0;
        imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void add(Complex c1, Complex c2) {
        this.real = c1.real + c2.real;
        this.imag = c1.imag + c2.imag;
    }

    public void display() {
        System.out.println("The real part is : " + this.real);
        System.out.println("The imaginary part is : "  + this.imag);
        System.out.println("Complex Number: " + this.real + " + i" + this.imag);
    }

}

public class ComplexAdd {
    public static void main(String[] args) {
        Complex complex = new Complex();

        complex.add(new Complex(1,2), new Complex(2,1));

        complex.display();

    }
}
