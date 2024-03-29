// package Abstraction;

/*
A.	Write an abstract class Course with an abstract method studentDetails().
Create 2 classes Comps and IT which inherits class Course and implements studentDetails().
The studentDetails() method should print the name, UID, and year (FE, SE, TE) of students of that Course.
These details have to be taken from the user. Write a program that asks user to choose a course
and print the details of all students in that course in a sorted manner  as per the year( FE,SE,TE)
*/

import java.util.Scanner;

abstract class Course {
    String name;
    long UID;
    String year;

    public Course(String name, long UID, String year) {
        this.name = name;
        this.UID = UID;
        this.year = year;
    }

    abstract void studentDetails();
}

class Comps extends Course {
    public Comps (String name, long UID, String year) {
        super(name, UID, year);
    }

    @Override
    void studentDetails() {
        System.out.println("Name: " + name + "\nUID: " + UID + "\nYear: " + year);
    }
}

class IT extends Course {
    public IT (String name, long UID, String year) {
        super(name, UID, year);
    }

    @Override
    void studentDetails() {
        System.out.println("Name: " + name + "\nUID: " + UID + "\nYear: " + year);
    }
}

public class SPIT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input: No. of Students.
        int n = in.nextInt();

        while(n>0) {
            // Give choice:
            System.out.println("1. COMPS  2. IT");
            int choice = in.nextInt();

            // input basic details:
            System.out.println("Enter name, UID, year");
            String name = in.next();
            long UID = in.nextLong();
            String year = in.next();

            // create comps student.
            if(choice == 1) {
                Comps comps = new Comps(name, UID, year);
                comps.studentDetails();
            } else if(choice == 2) {
                IT it = new IT(name, UID, year);
                it.studentDetails();
            } else {
                System.out.println("Invalid choice");
            }

            n--;
        }




        in.close();
    }
}
