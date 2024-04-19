package Abstraction.Interfaces;

import java.util.Scanner;

// Volume interface to calculate volume
interface Volume {
    double getVolume();
}

// SurfaceArea interface to calculate surface area
interface SurfaceArea {
    double getSurfaceArea();
}

// Cylinder class implementing Volume and SurfaceArea interfaces
class Cylinder implements Volume, SurfaceArea {
    // Private fields for radius and height of the cylinder
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override method to calculate volume of the cylinder
    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Override method to calculate surface area of the cylinder
    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Main class to execute the program
public class Shape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for Cylinder
        System.out.println("Input for Cylinder:");
        System.out.print("Enter Radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        // Create a Cylinder object with given radius and height
        Cylinder cylinder = new Cylinder(radius, height);

        // Output the calculated volume and surface area
        System.out.println("Volume: " + String.format("%.2f", cylinder.getVolume()));
        System.out.println("Surface Area: " + String.format("%.2f", cylinder.getSurfaceArea()));

        // Close the scanner
        in.close();
    }
}
