package Abstraction;

import java.util.*;

abstract class Course {
    abstract void studentDetails();
}

class Comps extends Course {
    @Override
    void studentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        String[][] students = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name, UID, and year (FE/SE/TE): ");
            students[i][0] = sc.next();
            students[i][1] = sc.next();
            students[i][2] = sc.next();
        }
        // Sort students by year
        Arrays.sort(students, (a, b) -> a[2].compareTo(b[2]));
        // Print student details
        System.out.println("Student Details: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + students[i][0] + ", UID: " + students[i][1] + ", Year: " + students[i][2]);
        }
    }
}

class IT extends Course {
    @Override
    void studentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        String[][] students = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name, UID, and year (FE/SE/TE): ");
            students[i][0] = sc.next();
            students[i][1] = sc.next();
            students[i][2] = sc.next();
        }
        // Sort students by year
        Arrays.sort(students, (a, b) -> a[2].compareTo(b[2]));
        // Print student details
        System.out.println("Student Details: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + students[i][0] + ", UID: " + students[i][1] + ", Year: " + students[i][2]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course (Comps/IT): ");
        String course = sc.next();
        Course c;
        if (course.equals("Comps")) {
            c = new Comps();
        } else if (course.equals("IT")) {
            c = new IT();
        } else {
            System.out.println("Invalid course");
            return;
        }
        c.studentDetails();
    }
}
