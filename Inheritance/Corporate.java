/*
Define parent class "Employee" that has 3 private attributes String
name, String id, int age.
Employee has constructor with 3 arguments that set value of name, id,
age. It also has getter
and setter methods for all 3 private attributes.
Class "SalariedEmployee" is a subclass of Employee and has 1 private
attribute empSalary.
"SalariedEmployee" can be permanent or on contract and has
constructor
SalariedEmployee(String name, String id, int age, double empSalary)
to set the values.
Constructor SalariedEmployee must call the superclass constructor to
set name, id, age and call
setter method to set the salary. Employee salary is empSalary +
2000(allowance) if he is a
permanent employee else Employee salary is empSalary (no allowance).
Accept the details of atleast 5 employees from the user and print details of the employee on the output screen. Then print the details of the employee with highest salary.
*/


import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private int age;

    public Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class SalariedEmployee extends Employee {
    private double empSalary;
    private boolean isPermanent = true;

    public SalariedEmployee(String name, String id, int age, double empSalary) {
        super(name, id, age);
        setEmpSalary(empSalary);
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        if (isPermanent) {
            this.empSalary = empSalary + 2000;
        } else
            this.empSalary = empSalary;
    }

    void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getEmpSalary());
    }

}

public class Corporate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String id;
        int age;
        double empSalary;

        System.out.print("Enter number of emplyees: ");
        int n = in.nextInt();
        SalariedEmployee employees[] = new SalariedEmployee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name: ");
            name = in.next();
            System.out.println("Enter id: ");
            id = in.next();
            System.out.println("Enter age: ");
            age = in.nextInt();
            System.out.println("Enter salary: ");
            empSalary = in.nextDouble();
            employees[i] = new SalariedEmployee(name, id, age, empSalary);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ':');
            employees[i].printDetails();
        }

        int index = maxSalarayIndex(employees);
        System.out.println("Employee with highest salary: ");
        employees[index].printDetails();

        in.close();
    }

    private static int maxSalarayIndex(SalariedEmployee[] employees) {
        int maxIndex = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getEmpSalary() > employees[maxIndex].getEmpSalary()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
