// package Polymorphism.Exp6;
import java.util.Scanner;

abstract class Employee {
    public abstract double calculateSalary();
}

class Programmer extends Employee {
    int noHours;
    int experience;

    public Programmer(int noHours, int experience) {
        this.noHours = noHours;
        this.experience = experience;
    }

    @Override
    public double calculateSalary() {
        double salary;
        if(experience > 15) {
            salary = noHours * 30 * 1000;
        } else {
            salary = noHours * 30 * 500;
        }
        if(salary > 30000) {
            return (0.95 * salary);
        }
        return salary;
    }
}

class Manager extends Employee {
    int noHours;
    int experience;

    public Manager(int noHours, int experience) {
        this.noHours = noHours;
        this.experience = experience;
    }


    @Override
    public double calculateSalary() {
        double salary;
        if(experience > 15) {
            salary = noHours * 30 * 2000;
        } else {
            salary = noHours * 30 * 1000;
        }
        if(salary > 40000) {
            return (0.95 * salary);
        }
        return salary;
    }
}


public class Salary {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your job role: 1.Programmer 2.Manager : ");
        int choice = sc.nextInt();

        System.out.print("Please enter your experience: ");
        int experience = sc.nextInt();
        System.out.print("Please enter your no of hours: ");
        int noHours = sc.nextInt();

        switch(choice) {
            case 1:
                Programmer p = new Programmer(noHours, experience);
                System.out.println("Your salary is: " + p.calculateSalary());
                break;

            case 2:
                Manager m = new Manager(noHours, experience);
                System.out.println("Your salary is: " + m.calculateSalary());
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}


/*
 no of hours
 overtime
 then tax.
 year of experience

 Manager
 >15 years 2k/hour
 <15 years 1k/hour
 !Tax!
 >40k 5%

 Programmer
 >15 years 1k/hour
 <15 years 0.5k/hour
 >30k 5%

*/
