package Abstraction.Interfaces;
/*
Consider two interfaces, Volume and SurfaceArea with methods getVolume() and
getSurfaceArea() respectively. Class ‘Cylinder’ implements both Volume and
SurfaceArea and implements their methods. The class contains their required dimensions
as data members. Write a program which inputs its dimensions and prints its volume and
surface area. Create classes ‘Cone’and ‘Sphere’ that implements both the interfaces. In
main
 */

import java.util.Date;
import java.util.Scanner;

interface Volume {
    double getVolume();
}

interface SurfaceArea {
    double getSurfaceArea();
}

class Cylinder implements Volume, SurfaceArea {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

class Sphere implements Volume, SurfaceArea {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }


    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cone implements Volume, SurfaceArea {
    double radius;
    double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    @Override
    public double getSurfaceArea() {
        double l = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));  // slant height.
        return Math.PI * Math.pow(radius, 2) + Math.PI * radius * l;
    }
}

public class Shape2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Menu driven program to select shape.
        System.out.println("Select shape: \n1. Cylinder\n2. Sphere\n3. Cone");
        int choice = in.nextInt();
        System.out.println("Enter radius: ");
        double radius = in.nextDouble();

        // Switch case.
        switch (choice) {
            case 1:
                System.out.println("Enter height: ");
                double height = in.nextDouble();
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("Volume of Cylinder: " + cylinder.getVolume());
                System.out.println("Surface Area of Cylinder: " + cylinder.getSurfaceArea());
                break;

            case 2:
                Sphere sphere = new Sphere(radius);
                System.out.println("Volume of Sphere: " + sphere.getVolume());
                System.out.println("Surface Area of Sphere: " + sphere.getSurfaceArea());
                break;

            case 3:
                System.out.println("Enter height: ");
                height = in.nextDouble();
                Cone cone = new Cone(radius, height);
                System.out.println("Volume of Cone: " + cone.getVolume());
                System.out.println("Surface Area of Cone: " + cone.getSurfaceArea());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        in.close();
    }
}