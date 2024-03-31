package Abstraction.Interfaces;
/*
Consider two interfaces, Volume and SurfaceArea with methods getVolume() and
getSurfaceArea() respectively. Class ‘Cylinder’ implements both Volume and
SurfaceArea and implements their methods. The class contains their required dimensions
as data members. Write a program which inputs its dimensions and prints its volume and
surface area. Create classes ‘Cone’and ‘Sphere’ that implements both the interfaces. In
main
 */

import java.util.Scanner;

interface Volume {
    double getVolume();
}

interface SurfaceArea {
    double getSurfaceArea();
}

class Cylinder implements Volume, SurfaceArea {
    private double radius;
    private double height;

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

public class Shape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input for Cylinder:");
        System.out.print("Enter Radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume: " + String.format("%.2f", cylinder.getVolume()));
        System.out.println("Surface Area: " + String.format("%.2f", cylinder.getSurfaceArea()));

        in.close();
    }
}